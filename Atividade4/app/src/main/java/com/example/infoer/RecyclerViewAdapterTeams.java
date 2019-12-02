package com.example.infoer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import objects.football.Football;
import objects.football.Matches;
import objects.infoPassSoccer.SearchArray;
import objects.infoPassSoccer.SearchPrint;
import objects.places.Places;
import objects.venue.Match;
import objects.weather.Lister;
import objects.weather.Weatheretor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import utilities.RetrofitConfigPlaces;
import utilities.RetrofitConfigSoccer;
import utilities.RetrofitConfigWeather;
import utilities.maps.NameMap;
import utilities.maps.PicMap;


public class RecyclerViewAdapterTeams extends RecyclerView.Adapter<RecyclerViewAdapterTeams.ViewHolder>{

    private ArrayList<ArrayList<String>> mLogos = new ArrayList<>();
    private ArrayList<ArrayList<String>> mNomes = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> mIds = new ArrayList<>();
    private Context mContext;
    private Activity mActivity;
    private SearchArray searchArray = new SearchArray();
    ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();

    public RecyclerViewAdapterTeams(ArrayList<ArrayList<String>> mLogos,
                                    ArrayList<ArrayList<String>> mNomes,
                                    ArrayList<ArrayList<Integer>> mIds,
                                    Context mContext, Activity mActivity) {
        this.mLogos = mLogos;
        this.mNomes = mNomes;
        this.mIds = mIds;
        this.mContext = mContext;
        this.mActivity = mActivity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_football_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Picasso.get().load(mLogos.get(position).get(0)).fit().centerInside().into(holder.imgButton);
        Picasso.get().load(mLogos.get(position).get(1)).fit().centerInside().into(holder.imgButton2);
        holder.text.setText(mNomes.get(position).get(0));
        holder.text2.setText(mNomes.get(position).get(1));

        holder.imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                footballCall(0, position, view);
            }
        });

        holder.imgButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                footballCall(1, position, view);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mLogos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.button) ImageButton imgButton;
        @BindView(R.id.button2) ImageButton imgButton2;
        @BindView(R.id.textView) TextView text;
        @BindView(R.id.textView2) TextView text2;
        @BindView(R.id.layout_style) ConstraintLayout layoutStyle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }

    private void footballCall(int buttonPos, int position, final View view){
        Call<Football> call = new RetrofitConfigSoccer()
                .getFootballService()
                .searchMatch(mIds.get(position).get(buttonPos));
        call.enqueue(new Callback<Football>() {
            @Override
            public void onResponse(Call<Football> call, Response<Football> response) {
                for(Matches m : response.body().getMatches()){
                    venueCall(m, view, response.body().getMatches().size());
                }
                Log.d("FootballService", "Matches retrieved successfully");
            }

            @Override
            public void onFailure(Call<Football> call, Throwable t) {
                Log.e("FootballService", "Error when searching for matches:" + t.getMessage());
            }
        });
    }

    private void venueCall(Matches match, final View view, final int num) {
        Call<Match> call = new RetrofitConfigSoccer()
                .getFootballService()
                .searchVenue(match.getId());
        call.enqueue(new Callback<Match>() {
            @Override
            public void onResponse(Call<Match> call, Response<Match> response) {
                Log.d("FootballService", "Venue retrieved successfully");
                placesCall(response.body(), view, num);
            }

            @Override
            public void onFailure(Call<Match> call, Throwable t) {
                Log.e("FootballService", "Error when searching for venues:" + t.getMessage());
            }
        });
    }

    private void placesCall(final Match match, final View view, final int num){
        Log.d("teste_nome", match.getMatch().toString());
        Call<Places> call = new RetrofitConfigPlaces()
                .getPlacesService()
                .searchCord(match.getMatch().getVenue());
        call.enqueue(new Callback<Places>() {
            @Override
            public void onResponse(Call<Places> call, Response<Places> response) {
                Log.d("teste_call", ""+ call.request().toString());
                Log.d("PlacesService", "Coordinates retrieved successfully");
                weatherCall(response.body(), match, view, num);
            }

            @Override
            public void onFailure(Call<Places> call, Throwable t) {
                Log.e("PlacesService", "Error when searching for coordinates:" + t.getMessage());
            }
        });
    }

    private void weatherCall(final Places places, final Match match, final View view, final int num){
        Call<Weatheretor> call = new RetrofitConfigWeather()
                .getWeatherService()
                .seachWeather( places.getCandidates().get(0).getGeometry().getLocation().getLat(),
                        places.getCandidates().get(0).getGeometry().getLocation().getLng());
        call.enqueue(new Callback<Weatheretor>() {
            @Override
            public void onResponse(Call<Weatheretor> call, Response<Weatheretor> response) {
                equalizerData(response.body(), match, view, num);
                Log.d("WeatherService", "Temperatures retrieved successfully");
            }

            @Override
            public void onFailure(Call<Weatheretor> call, Throwable t) {
                Log.e("WeatherService", "Error when searching for temperatures:" + t.getMessage());
            }
        });
    }

    private void equalizerData(Weatheretor weather, Match match, View view, final int num){
        ArrayList<Lister> tempList = weather.getList();
        Lister answer = null;
        String matchDate = match.getMatch().getUtcDate();
        String[] matchComparationDay = matchDate.split("T");
        String[] matchComparationTime = matchComparationDay[1].split(":", 2);
        try {
            int matchTime = Integer.parseInt(matchComparationTime[0]);
            for(Lister l : tempList){
                String[] weatherComparationDay = l.getDt_txt().split("\\s");
                String[] weatherComparationTime = weatherComparationDay[1].split(":", 2);
                try {
                    int weatherTime = Integer.parseInt(weatherComparationTime[0]);
                    if(weatherComparationDay[0].equals(matchComparationDay[0]) &&
                            Math.abs((weatherTime - matchTime))<2){
                        answer = l;
                    }
                }catch (NumberFormatException nfe){
                    Log.d("StringConvertion", "Error when trying to parse integer" + nfe);
                }
            }
        }catch (NumberFormatException nfe){
            Log.d("StringConvertion", "Error when trying to parse integer" + nfe);
        }
        objectPass(answer, match, view, num);
    }

    private void objectPass(Lister temp, Match match, View view,int num){
        SparseArray<String> picMap = PicMap.setPicMapRef();
        SparseArray<String> nameMap = NameMap.setNameRef();
        if(temp == null) {
            SearchPrint searchPrint = new SearchPrint(nameMap.get(match.getMatch().getHomeTeam().getId()),
                    nameMap.get(match.getMatch().getAwayTeam().getId()),
                    picMap.get(match.getMatch().getHomeTeam().getId()),
                    picMap.get(match.getMatch().getAwayTeam().getId()),
                    match.getMatch().getVenue(),
                    match.getMatch().getCompetition().getName(),
                    match.getMatch().getMatchday(),
                    0,
                    0,
                    "sem tempo irmão");
            searchArray.updateInfoList(searchPrint);
        }else{
            SearchPrint searchPrint = new SearchPrint(nameMap.get(match.getMatch().getHomeTeam().getId()),
                    nameMap.get(match.getMatch().getAwayTeam().getId()),
                    picMap.get(match.getMatch().getHomeTeam().getId()),
                    picMap.get(match.getMatch().getAwayTeam().getId()),
                    match.getMatch().getVenue(),
                    match.getMatch().getCompetition().getName(),
                    match.getMatch().getMatchday(),
                    temp.getMain().getTemp_min(),
                    temp.getMain().getTemp_max(),
                    temp.getWeather().get(0).getDescription());
            searchArray.updateInfoList(searchPrint);
        }

        if(searchArray.getInfoList().size() == num){
            callIntent(view);
        }
    }

    private void callIntent(View view){
        Context context = view.getContext();
        Intent intent = new Intent(context, GamesDisplayActivity.class);
        Log.d("quant", ""+searchArray.getInfoList().size());
        try {
            intent.putExtra("team_matches", ow.writeValueAsString(searchArray));



        } catch (JsonProcessingException e) {
            e.printStackTrace();
            Log.d("tag", "deu merda");
        }
        context.startActivity(intent);
        mActivity.finish();
    }
}

package com.example.infoer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import objects.infoPassSoccer.SearchArray;

public class RecyclerViewAdapterMatches extends RecyclerView.Adapter<RecyclerViewAdapterMatches.ViewHolder>{

    private SearchArray mSearchArray;
    private Context mContext;

    public RecyclerViewAdapterMatches(SearchArray mSearchArray, Context mContext) {
        this.mSearchArray = mSearchArray;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_match_list, parent, false);
        RecyclerViewAdapterMatches.ViewHolder holder = new RecyclerViewAdapterMatches.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        position = mSearchArray.getInfoList().size() - 1 - position;
        holder.compText.setText(mSearchArray.getInfoList().get(position).getCompetition());
        Picasso.get().load(mSearchArray.getInfoList().get(position).getHomeTeamPic()).fit().centerInside().into(holder.homePic);
        Picasso.get().load(mSearchArray.getInfoList().get(position).getAwayTeamPic()).fit().centerInside().into(holder.awayPic);
        Picasso.get().load("https://cdn.pixabay.com/photo/2012/04/11/12/02/letter-x-27780_960_720.png").fit().into(holder.versusPic);
        holder.homeName.setText(mSearchArray.getInfoList().get(position).getHomeTeam());
        holder.awayName.setText(mSearchArray.getInfoList().get(position).getAwayTeam());
        holder.rodada.setText("Rodada "+ mSearchArray.getInfoList().get(position).getRodada());
        holder.estadio.setText(mSearchArray.getInfoList().get(position).getVenue());
        holder.previsao.setText("Previsão do Tempo:");
        holder.tempMin.setText(Double.toString(mSearchArray.getInfoList().get(position).getTempMin()));
        holder.tempMax.setText(Double.toString(mSearchArray.getInfoList().get(position).getTempMax()));
        holder.tempType.setText(mSearchArray.getInfoList().get(position).getWeatherType());
    }

    @Override
    public int getItemCount() {
        return mSearchArray.getInfoList().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.textViewCompetition) TextView compText;
        @BindView(R.id.imageHomeTeam) ImageView homePic;
        @BindView(R.id.imageAwayTeam) ImageView awayPic;
        @BindView(R.id.imageViewVersus) ImageView versusPic;
        @BindView(R.id.textViewHomeTeam) TextView homeName;
        @BindView(R.id.textViewAwayTeam) TextView awayName;
        @BindView(R.id.textViewRodada) TextView rodada;
        @BindView(R.id.textViewEstadio) TextView estadio;
        @BindView(R.id.textViewPrevisao) TextView previsao;
        @BindView(R.id.textViewTempMin) TextView tempMin;
        @BindView(R.id.textViewTempMax) TextView tempMax;
        @BindView(R.id.textViewTempType) TextView tempType;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}

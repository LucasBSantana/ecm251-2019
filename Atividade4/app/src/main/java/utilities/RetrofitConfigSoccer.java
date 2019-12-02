package utilities;

import android.app.Service;

import objects.football.Football;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfigSoccer {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.football-data.org/v2/")
            .addConverterFactory(JacksonConverterFactory.create())
            .build();

    public FootballService getFootballService(){
        return this.retrofit.create(FootballService.class);
    }
}

package utilities;

import objects.weather.Weather;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfigWeather {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.openweathermap.org/data/2.5/")
            .addConverterFactory(JacksonConverterFactory.create())
            .build();

    public WeatherService getWeatherService(){
        return this.retrofit.create(WeatherService.class);
    }
}

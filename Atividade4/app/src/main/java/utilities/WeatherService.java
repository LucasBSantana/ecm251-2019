package utilities;

import objects.weather.Weatheretor;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("forecast?lang=pt&APPID=1128b89cc2432f25c298e3ba961e8809&units=metric")
    Call<Weatheretor>seachWeather(@Query("lat") double lat, @Query("lon") double lon);

    @GET("forecast?lang=pt&APPID=1128b89cc2432f25c298e3ba961e8809&units=metric")
    Call<Weatheretor>seachWeather(@Query("lat") String lat, @Query("lon") String lon);

}

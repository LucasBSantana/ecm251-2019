package utilities;

import objects.places.Places;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfigPlaces {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://maps.googleapis.com/")
            .addConverterFactory(JacksonConverterFactory.create())
            .build();

    public PlacesService getPlacesService(){
        return this.retrofit.create(PlacesService.class);
    }
}

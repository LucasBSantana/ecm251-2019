package utilities;

import objects.places.Places;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PlacesService {

    @GET("maps/api/place/findplacefromtext/json?inputtype=textquery&fields=geometry&key=AIzaSyAtYXRGHB1t1X8P4x-9jZ4YwYPRXdNOq4g")
    Call<Places>searchCord(@Query("input") String input);
}

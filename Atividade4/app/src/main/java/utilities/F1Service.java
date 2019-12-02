package utilities;

import objects.formulaOne.FOne;
import retrofit2.Call;
import retrofit2.http.GET;

public interface F1Service {

    @GET("api/f1/current/next.json")
    Call<FOne> searchRace();

}

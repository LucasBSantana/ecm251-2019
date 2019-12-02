package utilities;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfigF1 {

     Retrofit retrofit = new Retrofit.Builder()
             .baseUrl("https://ergast.com/")
             .addConverterFactory(JacksonConverterFactory.create())
             .build();

    public F1Service getF1Service(){
        return this.retrofit.create(F1Service.class);
    }
}

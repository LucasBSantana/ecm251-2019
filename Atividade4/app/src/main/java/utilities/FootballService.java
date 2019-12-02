package utilities;

import objects.football.Football;
import objects.venue.Match;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface FootballService {

    @Headers("X-Auth-Token: 1a2c833b09cb40a3820ffe716f8c333a")
    @GET("teams/{team}/matches?status=SCHEDULED")
    Call<Football>searchMatch(@Path("team") int team);

    @Headers("X-Auth-Token: 1a2c833b09cb40a3820ffe716f8c333a")
    @GET("matches/{matchId}")
    Call<Match>searchVenue(@Path("matchId") int matchId);
}

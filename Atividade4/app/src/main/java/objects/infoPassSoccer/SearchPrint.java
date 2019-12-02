package objects.infoPassSoccer;

public class SearchPrint{
    private String homeTeam;
    private String awayTeam;
    private String homeTeamPic;
    private String awayTeamPic;
    private String venue;
    private String competition;
    private int rodada;
    private double tempMin;
    private double tempMax;
    private String weatherType;

    public SearchPrint(){}

    public SearchPrint(String homeTeam, String awayTeam, String homeTeamPic,
                       String awayTeamPic, String venue, String competition, int rodada,
                       double tempMin, double tempMax, String weatherType) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamPic = homeTeamPic;
        this.awayTeamPic = awayTeamPic;
        this.venue = venue;
        this.competition = competition;
        this.rodada = rodada;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.weatherType = weatherType;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public String getHomeTeamPic() {
        return homeTeamPic;
    }

    public String getAwayTeamPic() {
        return awayTeamPic;
    }

    public String getVenue() {
        return venue;
    }

    public String getCompetition() {
        return competition;
    }

    public int getRodada() {
        return rodada;
    }

    public double getTempMin() {
        return tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public String getWeatherType() {
        return weatherType;
    }
}

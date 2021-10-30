
public class Team {

    private String homeTeam;
    private String visitingTeam;
    private int hPoint;
    private int vPoint;


    public Team(String homeTeam, String visitingTeam, int hPoint, int vPoint) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.hPoint = hPoint;
        this.vPoint = vPoint;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getVisitingTeam(){
        return this.visitingTeam;
    }
    
    public int getHPoint () {
        return this.hPoint;
    }
    
    public int getVPoint(){
        return this.vPoint;
    }
}
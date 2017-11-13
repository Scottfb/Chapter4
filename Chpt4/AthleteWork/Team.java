package AthleteWork;

public class Team
{
    private String teamName;
    private Athlete[] players;
    
    public Team(String tm, int size) {
        this.teamName = tm;
        this.players = new Athlete[size];
    }
    public String toString() {
        String output = "The team " + this.teamName + " has the following players: \n";
        for (Athlete a: players) {
            output += a + "\n";
        }
        return output;
    }
    public void addAthlete(int index, Athlete a) {
        players[index] = a;
    }
}

public class Football
{
    private String team;
    private int playersonfield;
    public Football ()
    {
        team = new String ("Manchester United");
        playersonfield = 10;
    }
    public Football (String team, int playersonfield)
    {
        this.team = new String (team);
        this.playersonfield = playersonfield;
    }
    public String toString ()
    {
        String output = new String();
        output = "Team: " + team + "\n" + "Players on field: " + playersonfield;
        return output;
    }
}

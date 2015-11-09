public class Football
{
    private String team;
    private int playersonfield;
    public Football ()
    {
        team = "Manchester United";
        playersonfield = 10;
    }
    public Football (String team, int playersonfield)
    {
        this.team = team;
        this.playersonfield = playersonfield;
    }
    public String toString ()
    {
        String result = String.format ( "Team: %s\n" + "Players: %d", team, playersonfield);
        return result;
    }
}

public class Song
{
    private double cost;
    private String artist;
    private String name;
    private int YearReleased;
    public Song()
    {
        cost =0.99;
        artist = "Logic";
        name = "Young Jesus";
        YearReleased = 2015;
    } //end constructor Song
    public int getYearReleased()
    {
        return YearReleased;
    }
    public void setYearReleased(int Year)
    {
        this.YearReleased = Year;
    }
    public Song (String name, double cost, String artist)
    {
        this.name = name;
        this.cost = cost;
        this.artist = artist;
    }

    public String toString( )
    {
        String output = new String();
        output = "Name: " + name + "\nCost: " + cost + "\nArtist: " + 
        artist;
        return output;
    }
}//end class song
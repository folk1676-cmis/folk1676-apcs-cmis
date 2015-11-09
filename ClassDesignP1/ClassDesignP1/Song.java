public class Song
{
    private double cost;
    private String artist;
    private String name;
    public Song()
    {
        cost =0.99;
        artist = "Logic";
        name = "Young Jesus";
    } //end constructor Song
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
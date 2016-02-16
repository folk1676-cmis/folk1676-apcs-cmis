public class MySong
{
    public String name;
    public int rating;
    
    public MySong()
    {
        name = "Love Yourself";
        rating = 4;
    }
    
    public MySong( String name, int rating )
    {
        this.name = name;
        this.rating = rating;
    }
    
    public String toString()
    {
        String output = String.format( "Name: %s \nRating: %d\n", name, rating );
        return output;
    }
}

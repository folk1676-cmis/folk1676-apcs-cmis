public class SongDriver1 
{
    public static void main (String argvs [] )
    {
        Song thisSong = new Song();
        System.out.println(thisSong);
        System.out.println("Length: " + thisSong.convert());
        thisSong.setYearReleased(2015);
        System.out.println("Year Released: " + thisSong.getYearReleased());
    }
} //end class MySongDriver
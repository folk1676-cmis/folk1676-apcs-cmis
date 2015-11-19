public class SongDriver1 
{
    public static void main (String argvs [] )
    {
        Song otherSong = new Song ();
        Song thisSong = new Song("Demons", 0.99, "James Morrison");
        System.out.println (thisSong);
        System.out.println (otherSong);
        
        thisSong.setYearReleased(2013);
        otherSong.setYearReleased(2015);
        
        System.out.println(thisSong.getYearReleased());
        System.out.println(otherSong.getYearReleased());
    }
} //end class MySongDriver
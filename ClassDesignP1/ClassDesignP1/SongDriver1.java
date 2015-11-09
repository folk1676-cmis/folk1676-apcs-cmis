public class SongDriver1 
{
    public static void main (String argvs [] )
    {
        Song otherSong = new Song ();
        Song thisSong = new Song("Demons", 0.99, "James Morrison");
        System.out.println (thisSong);
        System.out.println (otherSong);
    }
} //end class MySongDriver
public class SongDriver1 
{
    public static void main (String argvs [] )
    {
        Song otherSong = new Song ();
        Song thisSong = new Song("Demons", 0.99, "James Morrison");
        thisSong.setYearReleased(2013);
        otherSong.setYearReleased(2015);

        System.out.println(thisSong);
        System.out.print("Year: ");
        System.out.println(thisSong.getYearReleased());
        System.out.print("\n");
        System.out.println(otherSong);
        System.out.print("Year: ");
        System.out.print(otherSong.getYearReleased());
    }
} //end class MySongDriver
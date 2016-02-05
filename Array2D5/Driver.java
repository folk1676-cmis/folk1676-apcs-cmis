public class Driver
{
    public static void main ( String[] args )
    {
        Jukebox song = new Jukebox();
        System.out.println( song );
        System.out.println( "Song: " + song.randomSong());
        System.out.println("Song(s) with 5 rating: " + song.playSongofRating(5));
    }
}
import java.util.ArrayList;
public class Jukebox
{
    MySong[][] songList = new MySong[3][4];

    public Jukebox()
    {
        songList[0][0] = new MySong( "Jet Airliner", 5 );
        songList[0][1] = new MySong( "Slide", 4 );
        songList[0][2] = new MySong( "Tom Sawyer", 3 );
        songList[0][3] = new MySong( "Purple Rain", 2 );
        songList[1][0] = new MySong( "Sing a Song", 1 );
        songList[1][1] = new MySong( "Baba O'Riley", 5 );
        songList[1][2] = new MySong( "Jumper", 4 );
        songList[1][3] = new MySong( "Car Wash", 3 );
        songList[2][0] = new MySong( "Kung Fu Fighting", 2 );
        songList[2][1] = new MySong( "Right as Rain", 4 );
        songList[2][2] = new MySong( "Beat It", 5 );
        songList[2][3] = new MySong( "Bust a Move", 4 );
    }

    public String toString()
    {
        String output = new String();
        for( MySong[] row : songList )
        {
            for( MySong odo : row )
            {
                output += odo + "\n";
            }
        }
        return output;
    }

    public MySong randomSong()
    {
        return songList[ (int)(Math.random()) * songList.length ][ (int)(Math.random()) * songList[0].length ];
    }

    public ArrayList<MySong> playSongofRating (int rating)
    { 
        ArrayList<MySong> songs = new ArrayList<MySong>();
        for( int row = 0; row < songList.length; row++ )
        {
            for(int col = 0; col < songList[0].length; col++ )
                if( songList[row][col].rating == rating )
                {
                    songs.add( songList[row][col] );
                }
        }
        return songs;
    }
}

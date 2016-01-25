import java.util.ArrayList;
public class MyPod
{
    private String color;
    private int memory;
    ArrayList<String> playList = new ArrayList<String>();

    public MyPod()
    {
        color = new String ("Black");
        memory = 64;
        playList.add( "Charlie Brown" );
        playList.add( "       Yellow" );
        playList.add( "       A Sky Full of Stars" );
        playList.add( "       Viva La Vida" );
        playList.add( "       The Scientist" );
        playList.add( "       Swallowed in the Sea" );
        playList.add( "       Amazing Day" );
        playList.add( "       Til Kingdom Come" );
        playList.add( "       Paradise" );
        playList.add( "       Midnight" );
    }

    public MyPod ( String color, int memory, String[] songs )
    {
        this.color = color;
        this.memory = memory;
    }

    public String toString ( )
    {
        String song = "";
        for( String s : playList )
        {
            song += s + "\n";
        }
        String output = String.format(
                "Color: %s \nMemory: %dGB \nSongs: %s", color, memory, song);
        return output;
    }
}

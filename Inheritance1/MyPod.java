public class MyPod
{
    private String color;
    private int memory;
    private String[] songs;

    public MyPod()
    {
        color = new String ("Black");
        memory = 64;
        songs = new String[] {"Charlie Brown", ", Viva La Vida", ", The Scientist"};
    }

    public MyPod ( String color, int memory, String[] songs )
    {
        this.color = color;
        this.memory = memory;
        this.songs = songs;
    }

    public String toString ( )
    {
        String song = "";
        for( String s : songs )
        {
            song += s;
        }
        String output = String.format(
                "Color: %s \nMemory: %dGB \nSongs: %s", color, memory, song);
        return output;
    }
}

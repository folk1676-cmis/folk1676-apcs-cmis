public class MyPod extends MyDevice
{
    private int songs;
    
    public MyPod(int memory, String color, int songs)
    {
        super(memory, color);
        this.songs = songs;
    }

    public String toString()
    {
        return super.toString() + String.format("\nSongs: %s", songs);
    }
}
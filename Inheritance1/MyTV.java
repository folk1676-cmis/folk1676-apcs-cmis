public class MyTV extends MyPhone2
{
    private double size;
    private int channels;
    
    public MyTV(int memory, String color, boolean camera, String screen, double size, int channels)
    {
        super(memory, color, camera, screen);
        this.size = size;
        this.channels = channels;
    }

    public String toString()
    {
        return super.toString() + String.format("\nSize: %s", size) + String.format("\nChannels: %s", channels);
    }
}
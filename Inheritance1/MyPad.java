public class MyPad extends MyPhone2
{
    private double size;
    
    public MyPad(int memory, String color, boolean camera, String screen, double size)
    {
        super(memory, color, camera, screen);
        this.size = size;
    }

    public String toString()
    {
        return super.toString() + String.format("\nSize: %s", size);
    }
}
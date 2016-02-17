public class MyWatch extends MyDevice
{
    private String type;

    public MyWatch(int memory, String color, String type)
    {
        super(memory, color);
        this.type = type;
    }

    public String toString()
    {
        return super.toString() + String.format("\nType: %s", type);
    }
}
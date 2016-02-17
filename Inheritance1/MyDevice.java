public class MyDevice
{
    private int memory;
    private String color;
    
    public MyDevice()
    {
        this.memory = 64;
        this.color = new String ("Black");
    }
    
    public MyDevice(int memory, String color)
    {
        this.memory = memory;
        this.color = color;
    }

    public String toString()
    {
        String output = new String();
        output = "Memory: " + memory + "GB\n" +
                 "Color: " + color;
        return output;
    }
}
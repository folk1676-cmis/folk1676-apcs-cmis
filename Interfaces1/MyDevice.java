import java.util.ArrayList;
public abstract class MyDevice implements Connectable
{
    private int memory;
    private String color;
    public MyDevice()
    {
        memory = 8;
        color = new String ("Black");
    } //end constructor  
    public MyDevice( int memory, String color)
    {
        this.memory = memory;
        this.color = color;
    } //end constructor  
    public void connectToBluetooth()
    {
       System.out.println("Bluetooth Connected");
    }

    public String toString()
    {
        String output ="\nMemory: " + memory + "GB" + "\nColor: "+ color; 
        return output;
    }
}
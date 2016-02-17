public class MyPhone2 extends MyPhone1
{
    private String screen;
    
    public MyPhone2(int memory, String color, boolean camera, String screen)
    {
        super(memory, color, camera);
        this.screen = screen;
    }

    public String toString()
    {
        return super.toString() + String.format("\nScreen: %s", screen);
    }
}
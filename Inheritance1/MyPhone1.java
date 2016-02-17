public class MyPhone1 extends MyDevice
{
    private boolean camera;
    
    public MyPhone1(int memory, String color, boolean camera)
    {
        super(memory, color);
        this.camera = camera;
    }

    public String toString()
    {
        return super.toString() + String.format("\nCamera: %s", camera);
    }
}
public class Cubiverse
{
    private int w, h, d, volume;
    private double x, y, z, dfleft, dfbottom, dfback;
    private String name;
    public Cubiverse()

    {
        w = 1;
        h = 1; 
        d = 1;
        volume = w * d * h;
        x = 0.5;
        y = 0.5;
        z = 0.5;
        dfleft = w * x;
        dfbottom = h * y;
        dfback = d * z; 
        this.name = name;

    }
    public Cubiverse(double x, double y, double z, String name)
    {
        w = 1;
        h = 1;
        d = 1;
        volume = w * d * h;
        this.x = x;
        this.y = y;
        this.z = z;
        dfleft = w * x;
        dfbottom = h * y;
        dfback = d * z;
        this.name = name;

    } 
    public String toString()
    { 
        String result = String.format("Name:%s\n"+
                "w: %d\n"+
                "h: %d\n"+
                "d: %d\n"+
                "volume: %d\n"+
                "x: %.2f\n"+
                "y: %.2f\n"+
                "z: %.2f\n"+
                "distance from left:%.2f\n"+
                "distance from bottom: %.2f\n"+
                "distance from back: %.2f\n", name, w, h, d, volume, x, y, z, dfleft, dfbottom, dfback);
        return result;
    }
}

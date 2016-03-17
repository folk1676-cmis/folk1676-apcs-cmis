import java.util.ArrayList;
public class MyDevicesDriver     {
    public static void main (String argvs [] )
    {
        ArrayList<Connectable> dioud = new ArrayList<Connectable>(); 
        dioud.add(new MyPhone (64, "Black", "iPhone", true ));
        dioud.add(new MyPod (32, "Black", "iPod" ));
        dioud.add(new MyCar (420, "Red", 400000 ));
        for (Connectable x : dioud)
        {
            System.out.println("" + x.getClass() + x + "\n" );
        }

        for (Connectable x : dioud)
        {
            x.connectToBluetooth();
        }
    }
}
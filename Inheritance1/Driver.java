public class Driver
{
    public static void main(String[] args)
    {
        MyDevice[] Devices = new MyDevice[7];
        Devices[0] = new MyDevice(32, "Blue");
        Devices[1] = new MyPhone1(32, "Blue", true);
        Devices[2] = new MyPhone2(32, "Blue", true, "LED");
        Devices[3] = new MyPad(32, "Blue", true, "LED", 10.6);
        Devices[4] = new MyPod(32, "Blue", 1524);
        Devices[5] = new MyWatch(32, "Blue", "Digital");
        Devices[6] = new MyTV(32, "Blue", false, "LED", 10.6, 1628);
        for ( MyDevice device : Devices )
        {
            System.out.println(device + "\n");
        }     
    }
}
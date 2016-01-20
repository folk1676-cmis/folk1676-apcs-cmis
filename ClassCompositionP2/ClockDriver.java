public class ClockDriver
{
    public static void main ( String argvs [] )
    {
        ClockStore a = new ClockStore();
        System.out.println( a );
        System.out.println("Clock #" + a.mostSeconds() + " has the most seconds.");
    }
}

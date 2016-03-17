import java.util.ArrayList;
public class AnalogDigitalDriver
{
    public static void main (String argvs [] )
    {
        BWTV bw = new BWTV();
        HDTV hd = new HDTV();
        ArrayList<TV> dioud = new ArrayList<TV>();
        dioud.add(bw);
        dioud.add(hd);

        for ( TV x : dioud)
        {
            System.out.println( x.tvType() + "Am I on? " + x.getTV() );
        }

        for(int i = 0; i < dioud.size(); i++)
        {
            dioud.get(i).setTV(true); //set as true
        }

        System.out.println("\n");
        for( TV x: dioud )
        {
            System.out.println( x.tvType() + "Am I on? " + x.getTV() );
        }
        System.out.println(bw.rotateRabbitEars());
        System.out.println(hd.connectHDMI());
    }
}

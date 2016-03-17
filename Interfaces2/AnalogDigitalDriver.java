// a. Use a for-each loop to print the type of TV and whether or not the TV is on.
// 
// b. Use a regular for loop to turn on each TV.
// 
// c. Use a separate for-each loop to print the type of TV and whether or not it is
// 
// on.
// 
// d. Print the result of calling the “rotateRabbitEars()” method for a BWTV.
// 
// e. Print the result of calling the “connectHDMI()” method for a HDTV.

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

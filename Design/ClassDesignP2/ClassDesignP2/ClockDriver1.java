import javax.swing.JOptionPane;
public class ClockDriver1 
{
    public static void main (String argvs [] )
    {
        String inp1 = JOptionPane.showInputDialog("Hour: ");
        int hr = Integer.parseInt( inp1 );
        Clock otherClock = new Clock ();
        String inp2 = JOptionPane.showInputDialog("Minute: ");
        int min = Integer.parseInt( inp2 );        
        String inp3 = JOptionPane.showInputDialog("Second: ");
        int sec = Integer.parseInt( inp3 );
        System.out.println(otherClock);
        System.out.println( "0" + hr + ":" + "0" + min + ":" + "0" + sec );
    }
} //end class ClockDriver
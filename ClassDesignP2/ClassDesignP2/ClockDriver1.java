import javax.swing.JOptionPane;
public class ClockDriver1 
{
    public static void main (String argvs [] )
    {
        String hr = JOptionPane.showInputDialog("Hour: ");
        int hr = Integer.parseInt( hr );
        Clock otherClock = new Clock ();
        String min = JOptionPane.showInputDialog("Minute: ");
        int min = Integer.parseInt( min );
        
        String sec = JOptionPane.showInputDialog("Second: ");
        int sec = Integer.parseInt( sec );
        
    }
} //end class ClockDriver
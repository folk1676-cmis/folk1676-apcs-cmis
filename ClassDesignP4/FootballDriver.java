import javax.swing.JOptionPane;
public class FootballDriver
{
    public static void main (String argvs [] )
    {
        String team = JOptionPane.showInputDialog("Football Club: ");
        String pf = JOptionPane.showInputDialog("Numbers of players on the field");
        int playersonfield = Integer.parseInt( pf );
        JOptionPane.showMessageDialog(null, "Club: " + team + "\n" + "Players on field: " + playersonfield );
    }
}
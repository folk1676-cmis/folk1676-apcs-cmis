import javax.swing.JOptionPane;
public class weatherChaos 
{
    public static void main ( String args[] )
    {
        String input = JOptionPane.showInputDialog( "Enter the amount of days between 1 and 31" );
        int userinput = Integer.parseInt( input );
        int []temp = new int[userinput];
       
        if ( userinput < 1 )
        {
            System.out.print("That's not a valid number of days!");
        }
        if (userinput > 31 )
        {
            System.out.print("That's not a valid number of days!");
        }
        
        for ( int i = 0; i < temp.length; i++ )
        {
            temp[i] = (int) (Math.random() * 200) - 100;
            System.out.println( "day" + userinput );
        }
    }
}
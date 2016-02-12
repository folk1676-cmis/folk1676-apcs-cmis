import javax.swing.JOptionPane;
public class password
{
    public static void main ( String[] args )
    {
        String lname = JOptionPane.showInputDialog( "Lastname: " );
        String pass = JOptionPane.showInputDialog( "Password: " );

        int x = 0;     

        String y = lname.toLowerCase();
        String z = pass.toLowerCase();

        while( x >= 0 )
        {
            x = z.indexOf( y );
            if( x >= 0 )
            {
                System.out.println( "Please enter a valid password" );
                z = JOptionPane.showInputDialog( "Password: " );
                // System.out.println( "Please enter a valid password" );
            }
            else
            {
                System.out.println( "The password is valid." );
            }
        }
    }
}

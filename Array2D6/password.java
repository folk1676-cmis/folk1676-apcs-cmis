import javax.swing.JOptionPane;
public class password
{
    public static void main ( String[] args )
    {
        String uname = JOptionPane.showInputDialog( "Username: " ); // ask for username input
        String pass = JOptionPane.showInputDialog( "Password: " ); // ask for password input

        int x = 0; // comparing variable

        String y = uname.toLowerCase(); // lowercase
        String z = pass.toLowerCase(); // lowercase

        while( x >= 0 ) // while loop for looping
        {
            x = z.indexOf( y ); // x is a new value now and compare the password to the username
            if( x >= 0 ) // only works if it's not the same
            {
                System.out.println( "Please enter a valid password" ); // prints out only if password is invalid
                z = JOptionPane.showInputDialog( "Password: " ).toLowerCase();
                // System.out.println( "Please enter a valid password" );
            }
            else
            {
                System.out.println( "The password is valid." ); // meets criteria
            }
        }
    }
}

import javax.swing.JOptionPane;
public class FundamentalsP9
{
    public static void main ( String [] args )
    {
        String username = JOptionPane.showInputDialog("Enter the username: "); //input for username
        String password = JOptionPane.showInputDialog("Enter the password: "); //input for password
        
        int pass = Integer.parseInt(password); //convert to int
        
        if (username.equals("amir")&&pass == 123) //set value for both username and password
        {
            System.out.println("You have successfully logged in");
        }//end if
        else
        {
            System.out.println("Login unsuccessful…try again");
        }//end else
    }//end main
}//end FundamentalsP9

import java.util.Scanner;
public class HelloUser
    {
        public static void main ( String [] args )
        { Scanner stdin = new Scanner ( System.in );
            String usersName;
            
            System.out.print("Please enter your name: ");
            usersName = stdin.nextLine();
            
            System.out.println("Hello, " + usersName );
        }
    }
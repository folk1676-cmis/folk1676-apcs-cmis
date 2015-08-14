import java.util.Scanner;
public class HelloUserAge
    {
         public static void main ( String [] args )
        { Scanner stdin = new Scanner ( System.in );
            String usersName;
            
            System.out.print("Please enter your name: ");
            usersName = stdin.nextLine();
            
            String Age;
            System.out.print("Please enter your age: ");
            Age = stdin.nextLine();
            
            System.out.println("Hello, " + usersName + "! You are" + Age + "years old.");
        }
    }
import javax.swing.JOptionPane;
public class FundamentalsP2
    {public static void main ( String [] args )
        {double a, b;
            
            String input1 = JOptionPane.showInputDialog( "Enter a number:" );
            String input2 = JOptionPane.showInputDialog( "Enter another number: " );
            
            a = Integer.parseInt( input1 );
            b = Integer.parseInt( input2 );
            
            if(a < b)
                {
                    System.out.println( "The value of a is " + a + " and it is less than b whose value is " + b + "." );
                }//end if
            if(a > b)
                {
                    System.out.println( "The value of a is " + a + " and it is greater than b whose valus is " + b + "." );
                }//end if
            if(a == b)
                {
                    System.out.println( "The value of a is " + a + " and it is equal to b whose value is " + b + "." );
                }//end if
        }//end main
    }//end FundamentalsP2
    
    
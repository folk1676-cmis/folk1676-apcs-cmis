import javax.swing.JOptionPane;
public class FundamentalsP3
    {public static void main ( String [] args )
        {
            String input = JOptionPane.showInputDialog( "Enter an integer" );
            
            int x = Integer.parseInt( input );
            int r = x % 2;
            
            if(r == 0)
                {
                    System.out.println( x + " is an even integer." );
                }//end if
            if(r == 1)
                {
                    System.out.println( x + " is an odd integer." );
                }//end if
            }//end main
        }//end FundamentalsP3
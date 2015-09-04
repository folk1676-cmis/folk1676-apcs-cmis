import javax.swing.JOptionPane;
public class Test1
{
    public static void main ( String [] args )
    {
        String num = JOptionPane.showInputDialog("Enter an integer: "); 
        int integer = Integer.parseInt(num);
        
        int num1 = integer.length;
        for ( int index = 0; index < num.length; index++)
        {
            System.out.println( num[index] );
        }
    }
}
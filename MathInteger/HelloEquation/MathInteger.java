import javax.swing.JOptionPane;

public class MathInteger
    {
        public static void main ( String [] args )
        {float sum, sub, sub2, mul, div, div2 = 0;
            
           String input1 = JOptionPane.showInputDialog( "Enter a number: ");
           String input2 = JOptionPane.showInputDialog( "Enter another number: ");
           
           float num1 = Integer.parseInt( input1 );
           float num2 = Integer.parseInt( input2 );
           
           sum = num1 + num2;
           sub = num1 - num2;
           sub2 = num2 - num1;
           mul = num1 * num2;
           div = num1 / num2;
           div2 = num2 / num1;
           
           System.out.println( num1 + " + " + num2 + " = " + sum );
           System.out.println( num2 + " + " + num1 + " = " + sum );
           System.out.println( num1 + " - " + num2 + " = " + sub );
           System.out.println( num2 + " - " + num1 + " = " + sub2 );
           System.out.println( num1 + " * " + num2 + " = " + mul );
           System.out.println( num2 + " * " + num1 + " = " + mul );
           System.out.println( num1 + " / " + num2 + " = " + div );
           System.out.println( num2 + " / " + num1 + " = " + div2 );
        }
    }
           
           
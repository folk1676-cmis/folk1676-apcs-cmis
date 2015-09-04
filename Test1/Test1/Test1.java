import javax.swing.JOptionPane;
public class Test1
{
    public static void main ( String [] args )
    {
        String num = JOptionPane.showInputDialog("Enter an integer: "); 
        int x = Integer.parseInt(num);
        int []y = new int [x];
        
        for ( int index = 0; index < y.length; index++ )
        {
            System.out.println((double)(Math.random()*50));
        }
        
        int z = Integer.parseInt(num);
        int r = x % 2;
        
        if (r == 0)
        
            {
                System.out.println("E" + y);
            }
        else
            {
                System.out.println("O" + y);
            }
    }
}
import javax.swing.JOptionPane;
public class weatherChaos 
{
    public static void main ( String args[] )
    {
        String input = JOptionPane.showInputDialog( "Enter the amount of days between 1 and 31" );
        int userinput = Integer.parseInt( input );
        int []temp = new int[userinput];
        int swing;
        String des;
        int sum= 0;
        int min = 99;
        int max = 0;
       
        if ( userinput < 1 )
        {
            System.out.print("That's not a valid number of days!");
        }
        else if (userinput > 31 )
        {
            System.out.print("That's not a valid number of days!");
        }
        else
        {
            System.out.println("day	" + "temp	" + "swing	" + "description");
        }
        
        for ( int i = 0; i < temp.length; i++ )
        {
            temp[i] = (int) (Math.random() * 200) - 100;
            swing = Math.abs(temp[i] - temp[i]);
            if ( temp[i] < 0 )
            {
                des = "freezing";
                System.out.println( i + 1 + "	" + temp[i] + "	" + swing + "	" + des);
            }
            else if (temp[i] > 0 && temp[i] < 15 )
            {
                des = "chilly";
                System.out.println( i + 1 + "	" + temp[i] + "	" + swing + "	" + des);
            }
            else if (temp[i] > 16 && temp[i] < 30 )
            {
                des = "comfortable";
                System.out.println( i + 1 + "	" + temp[i] + "	" + swing + "	" + des);
            }
            else if (temp[i] > 31 && temp[i] < 40 )
            {
                des = "hot";
                System.out.println( i + 1 + "	" + temp[i] + "	" + swing + "	" + des);
            }
            else
            {
                des = "AAAAAAUUUUGGGHHH!";
                System.out.println( i + 1 + "	" + temp[i] + "	" + swing + "	" + des);
            }
        }
        for ( int index = 0; index < temp.length; index++ )
        {
            if ( temp[index] < min)
            {
                min = temp[index];
            }
        }
        for ( int index = 0; index < temp.length; index++ )
        {
            if ( temp[index] >= max)
            {
                max = temp[index];
            }
        }
        for ( int index = 0; index < temp.length; index++ )
        {
            temp[index] =((int)(100*Math.random())); 
            sum = sum + temp[index];
        }
        System.out.println( "Minimum temperature: " + min );
        System.out.println( "Maximum temperature: " + max );
        System.out.println( "Average temperature: " + sum / userinput);
        System.out.println( "Highest swing: " );
    }
}
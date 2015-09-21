import javax.swing.JOptionPane;
public class Histogram 
{
    public static void main ( String args[] )
    {
        String input = JOptionPane.showInputDialog( "Choose an integer"); 
        int num = Integer.parseInt( input );
        int []count = new int[100];
        int []info = new int[num];
        int sum= 0;
        int min = 99;
        int occ = 0;
        int max = 0;
        int []mst = new int[100];
        for ( int index = 0; index < info.length; index++ )
        {
            info[index] =((int)(100*Math.random())); 
            sum = sum + info[index];
        }
        for (   int index = 0; index < info.length; index++)
        {
            for ( int i = 0; i < 100; i++)
            {
                if ( info[index] == i)
                {
                    count[i]= count[i] + 1  ;
                }
            }
        }
        for ( int index = 0; index < count.length; index++ )
        {
            System.out.print("\n" + index  +  ":" );
            for (int i = 0 ; i< count[index]; i++)
            {
                System.out.print("#");
            }  
        }         
        for ( int index = 0; index < info.length; index++ )
        {
            if ( info[index] < min)
            {
                min=info[index];
            }
        }
        for ( int index = 0; index < info.length; index++ )
        {
            if ( info[index] >= max)
            {
                max=info[index];
            }

        }
        for ( int index = 0; index < 100; index++ )

        {
            if(count[index] > occ)
            {
                occ =  count[index];
            }
        }
        for ( int index = 0; index < 100; index++ )
        {
            if (count[index] == occ)
            {
                mst[index] = index;
            }
        }
        System.out.println( "\n" + "Min: " + min );
        System.out.println( "Max: " + max );
        System.out.println( "Sum: " + sum );
        System.out.println( "Average: " + sum / num);
        System.out.print( "Mst: " );
        for ( int index = 0; index < count.length; index++ )
        {
            if (mst[index] > 0)
            {
                System.out.print(mst[index]+  " ");
            }
        } 
    } // end main
} // end NAME
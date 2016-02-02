public class Odoamne
{
    public static void main ( String [] args )
    {
        int[][] odoamne = new int[3][5];
        int sum = 0;

        for( int row = 0; row < odoamne.length; row++ )
        {
            for( int col = 0; col < odoamne[0].length; col++ )
            {
                odoamne[row][col] = (int)(Math.random() * 15);
            }
        }

        //         for( int row = 0; row < odoamne.length; row++ )
        //         {
        //             for( int col = 0; col < odoamne[0].length; col++ )
        //             {
        //                 if( odoamne[row][col] == 5 )
        //                 {
        //                     System.out.print( "(" + row + "," + col + ")" );
        //                 }
        //             }
        //         }

        for( int[] row : odoamne )
        {
            for( int col : row )
            {
                System.out.print( col + "\t" );
            }
            System.out.println();
        }
        
        System.out.println();
        
        for( int row = 0; row < odoamne.length; row++ )
        {
            int rowSum = 0;
            for( int col = 0; col < odoamne[0].length; col++ )
            {
                rowSum += odoamne[row][col];
            }
            System.out.println( "Sum of Row " + (row+1) + ": " + rowSum );
        }

        for( int col = 0; col < odoamne[0].length; col++ )
        {
            int colSum = 0;
            for( int row = 0; row < odoamne.length; row++ )
            {
                colSum += odoamne[row][col];
            }
            System.out.println( "Sum of Column " + (col+1) + ": " + colSum );
        }

        for( int[] row : odoamne )
        {
            for( int col : row )
            {
                sum += col;
            }
        }
        System.out.println("Sum of Total: " + sum );
    }
}

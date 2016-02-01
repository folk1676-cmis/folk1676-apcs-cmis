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

        for( int[] row : odoamne )
        {
            for( int col : row )
            {
                sum += odoamne.length;
                System.out.print( sum );
            }
        }
    }
}

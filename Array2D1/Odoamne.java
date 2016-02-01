public class Odoamne
{
    public static void main ( String [] args )
    {
        int[][] odoamne = new int[3][4];

        for( int row = 0; row < odoamne.length; row++ )
        {
            for( int col = 0; col < odoamne[0].length; col++ )
            {
                odoamne[row][col] = (int)(Math.random() * 10);
                System.out.print( odoamne[row][col] + "\t" );
            }
            System.out.println( "\n" );
        }

        for( int row = 0; row < odoamne.length; row++ )
        {
            for( int col = 0; col < odoamne[0].length; col++ )
            {
                if( odoamne[row][col] == 5 )
                {
                    System.out.print( "(" + row + "," + col + ")" );
                }
            }
        }
    }
}

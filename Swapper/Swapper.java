public class Swapper
{
    public static void main ( String [] args )
    {
        int rowpro = 0; // product of row
        int colpro = 0; // product of columns
        int rowprotwo = 0;
        int colprotwo = 0;
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};

        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                if(grid[row][col] != 0)
                {
                    rowpro *= grid[row][col];
                    if( rowpro > rowprotwo )
                    {
                        rowprotwo = rowpro;
                        colprotwo = col - 2;
                    }
                }
            }
        }

        for( int row = 0; row < grid.length; row++ ) // for highest row product
        {
            //int rowpro = 0;
            for( int col = 0; col < grid[0].length; col++ ) // begin for loop
            {
                rowpro += grid[row][col];
            } // end for loop
            // System.out.println( rowpro ); // check the product
        } 
        // System.out.println( "\n" );
        for( int col = 0; col < grid[0].length; col++ ) // for highest column product
        {
            //int colpro = 0;
            for( int row = 0; row < grid.length; row++ ) // begin for loop
            {
                colpro += grid[row][col];
            } // end for loop
            // System.out.println( colpro ); // check the product
        }        
        // value is 9

        for( int row = 0; row < grid.length; row++ )
        {
            for( int col = 0; col < grid[0].length; col++ )
            {
                if( grid[row][col] == 0 )
                {
                    grid[row][col] = 9;
                }
                else if( grid[row][col] == 9 )
                {
                    grid[row][col] = 0;
                }
            }
        }

        for( int[] row : grid ) // print out array
        {
            for( int col : row )
            {
                System.out.print( col + "\t" );
            }
            System.out.println();
        }  
    }
}
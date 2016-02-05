public class Swapper
{
    public static void main ( String [] args )
    {
        int rowpro = 0; // product of row
        int colpro = 0; // product of columns
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

        for( int row = 0; row < grid.length; row++ ) //loop for rows
        {
            for( int col = 0; col < grid[0].length; col++ )
            {
                if( grid[row][col] == 0 ) //change 0 to 1 so when multiply doesn't affect
                {
                    grid[row][col] = 1;
                } //end if statement
                grid[row][col] = grid[row][row] * grid[row][row];
                if( grid[row][col] > rowpro )
                {
                    rowpro = grid[row][col];
                }
            } //end for loop
        } //end for loop

        for( int col = 0; col < grid[0].length; col++ ) //loop for columns
        {
            for( int row = 0; row < grid.length; row++ ) //begin for loop
            {
                if( grid[row][col] == 0 ) //change 0 to 1 so when multiply doesn't affect
                {
                    grid[row][col] = 1;
                }
                grid[row][col] = grid[col][col] * grid[col][col];
                if( grid[row][col] > colpro )
                {
                    colpro = grid[row][col];
                } //end if statement
            } //end for loop
        } //end for loop

        for( int row = 0; row < grid.length; row++ ) //begin for loop
        {
            for( int col = 0; col < grid[0].length; col++ ) //begin for loop
            {
                if( grid[row][col] == grid[rowpro][colpro] )
                {
                    if( grid[row][col] == 1 )
                    {
                        grid[row][col] = grid[rowpro][colpro];
                    }
                }
                System.out.println( grid[row][col] );
            } //end for loop
        } //end for loop
    }
}

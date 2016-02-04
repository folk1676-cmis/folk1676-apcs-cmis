import javax.swing.JOptionPane;
public class Odoamne
{
    public static void main ( String[] args )
    {
        int inputrow = Integer.parseInt(JOptionPane.showInputDialog("Rows: "));
        int inputcol = Integer.parseInt(JOptionPane.showInputDialog("Columns: "));
        int[][] odo = new int[inputrow][inputcol];

        for( int row = 0; row < odo.length; row++ )
        {
            for( int col = 0; col < odo[0].length; col++ )
            {
                odo[row][col] = row * col;
                odo[row][0] = row;
                odo[0][col] = col;
            }
        }

        //         for( int[] r : odo )
        //         {
        //             for( int c : r )
        //             {
        //                 System.out.print( odo[r][c] + "\t" );
        //             }
        //             System.out.println();
        //         }
        
        for( int row = 0; row < odo.length; row++ )
        {
            for( int col = 0; col < odo[0].length; col++ )
            {
                System.out.print( odo[row][col] + "\t" );
            }
            System.out.println("\n");
        }
    }
}

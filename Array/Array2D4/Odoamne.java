import javax.swing.JOptionPane;
public class Odoamne
{
    public static void main ( String[] args )
    {
        String[] odoamne = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
        int inputrow = Integer.parseInt(JOptionPane.showInputDialog("Rows: "));
        int inputcol = Integer.parseInt(JOptionPane.showInputDialog("Columns: "));
        String[][] odo = new String[inputrow][inputcol];
        int c = 0;

        for( int row = 0; row < odo.length; row++ )
        {
            for( int col = 0; col < odo[0].length; col++ )
            {
                odo[row][col] = odoamne[c];
                System.out.print( odo[row][col] + "\t" );
                c++;
                
                if( c == 26 )
                {
                    c -= 26;
                }
            }
            System.out.println("\n");
        }
    }
}

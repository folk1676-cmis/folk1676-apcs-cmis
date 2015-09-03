public class FundamentalsP5
    {public static void main ( String [] args )
        {
            String[] favMov = { "Southpaw" , "Fight Club" , "Million Dollar Baby"};
            for ( int x = 0; x < favMov.length; x++ )
            {
                System.out.println( favMov[x]);
            }//end for loop
        
            System.out.println("\n" );
            
            String[] favSong = { "Welcome to Forever" , " Best Day of My Lie", " Charlie Brown"  };
            int x = 0;
            while (x < favSong.length-1)
            
            {
                System.out.print(favSong[x] + "," );
                x++;
            }//end for loop
            System.out.print(favSong[favSong.length-1]);
        }//end main
}//end FundamentalsP5
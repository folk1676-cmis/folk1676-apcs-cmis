public class FundamentalsP5
    {public static void main ( String [] args )
        {
            String[] favMov = { "Southpaw" , "Fight Club" , "Million Dollar Baby"};
            for ( int x = 0; x < favMov.length; x++ )
            {
                System.out.println( favMov[x]);
            }
        
            System.out.println("\n" );
            
            String[] favSong = { "Welcome to Forever" , "Go Big or Go Home", "See You Again"  };
            int x = 0;
            while (x < favSong.length-1)
            
            {
                System.out.print(favSong[x] + "," );
                x++;
        }
    }
}
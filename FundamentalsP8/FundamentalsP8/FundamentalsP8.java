public class FundamentalsP8
{
    public static void FundamentalsP8( String [] args )
       {
           String[] favArtists = { "Coldplay" , "Charlie Puth" , "Taylor Swift" };
           for ( int x = 0; x < favArtists.length; x++ )
            {
                System.out.println( favArtists[x] );
            }
            
           System.out.println("\n");
            
           favArtists[((int)Math.random()*3)] = "Michael Jackson";
           for ( int x = 0; x < favArtists.length; x++ )
            {
                System.out.println( favArtists[x] );
            }
           
           for ( int x = 0; x < favArtists.length; x++ )
    }
}

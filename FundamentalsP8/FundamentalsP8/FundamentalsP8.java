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
            int x = (int)Math.random()*3;
            favArtists[x] = "Michael Jackson";
            
            if ( favArtists[x].equals( favArtists[0]))
            {
                System.out.println( "We found Michael Jackson!" );
            }
            else
            {
                System.out.println( "Michael Jackson is not in " + favArtists[0] );
            }
            
            if ( favArtists[x].equals( favArtists[0]))
            {
                System.out.println( "We found Michael Jackson!" );
            }
            else
            {
                System.out.println( "Michael Jackson is not in " + favArtists[0] );
            }
            
            if ( favArtists[x].equals( favArtists[0]))
            {
                System.out.println( "We found Michael Jackson!" );
            }
            else
            {
                System.out.println( "Michael Jackson is not in " + favArtists[0] );
            }
        }
    }

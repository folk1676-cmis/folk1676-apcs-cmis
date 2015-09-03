public class FundamentalsP8
{
    public static void FundamentalsP8( String [] args )
       {
           String[] favArtists = { "Coldplay" , "Charlie Puth" , "Taylor Swift" }; //define three artists
           for ( int x = 0; x < favArtists.length; x++ )
            {
                System.out.println( favArtists[x] );
            }//for loop end
            
           System.out.println("\n"); //print empty line
            
           favArtists[((int)(3*Math.random()))] = "Michael Jackson"; //randomly substitute MJ
           for ( int x = 0; x < favArtists.length; x++ )
            {
                System.out.println( favArtists[x] );
            }//for loop end
            
           System.out.println("\n"); //print empty line
            
           for ( int x = 0; x < favArtists.length; x++)
            {
                if ( favArtists[x].equals("Michael Jackson"))
                {
                    System.out.println("We found Michael Jackson");
                }//if end
                else
                {
                    System.out.println("No Michael Jackson in music " + "["+x+"]");
                }//else end
            }//for loop end
        }//end main
    }//end FundamentalsP8
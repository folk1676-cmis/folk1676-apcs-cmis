public class FundamentalsP6
{
    public static void main (String argvs [] )
    {
      int[] array = new int[50];
    
      int x = array.length;
      for ( int index = 0; index < x; index++ )
      {
        
          array[ index ] = (int)(Math.random()*100   );     
        
        }//end for loop
      for ( int index = 0; index < x; index++ )
      {
        
          System.out.print( array[ index ] + " " );    
      
        }//end for loop
      System.out.print( "\n" );    
      
    }//end main
}//end FundamentalsP6
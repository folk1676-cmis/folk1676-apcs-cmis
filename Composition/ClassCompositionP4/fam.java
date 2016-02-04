import java.util.ArrayList;
public class fam
{
    public static void main ( String[] args )
    {
        ArrayList<String> myFamily = new ArrayList<String>();
        
        myFamily.add( "Nattapon" );
        myFamily.add( "Natchanok" );
        myFamily.add( "Thanchanok" );
        myFamily.add( "Sunisa" );
        
        for ( int i = 0; i < myFamily.size(); i++ )
        {
            System.out.println( myFamily.get( i ) );
        }
    }
}

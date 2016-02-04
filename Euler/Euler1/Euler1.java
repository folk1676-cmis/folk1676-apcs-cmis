public class Euler1
{
    public static void main ( String sharks [] )
    {
        int shark = 0;
        for ( int i = 0; i < 1000; i++)
        {
            if ( i % 3 == 0 || i % 5 == 0 )
            {
                shark += i;
            }
        }
        System.out.println( shark );
    }
}

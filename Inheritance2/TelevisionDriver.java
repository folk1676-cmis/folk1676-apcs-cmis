public class TelevisionDriver
{
    public static void main ( String[] args )
    {
        Television[] telev = new Television[4];
        telev[0]= new LCD( "HD Bronze \t", 59.99 );
        telev[1]= new DLP( "DLP Silver \t", 99.99 );
        telev[2]= new LED( "LED Platinum \t", 399.99 );
        telev[3]= new Plasma( "Plasma Sapphire", 499.99 );

        System.out.println( "TVs in the store..." );
        for ( Television tv : telev )
        {
            System.out.println( tv );
        } 
    }
}

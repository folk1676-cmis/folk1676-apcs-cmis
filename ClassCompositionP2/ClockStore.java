public class ClockStore
{
    private Clock[] clocksInStock;
    private int x;

    public ClockStore()
    {
        clocksInStock = new Clock[3];
        clocksInStock[0] = new Clock ( 12, 30, 45 );
        clocksInStock[1] = new Clock ( 22, 24, 26 );
        clocksInStock[2] = new Clock ( 10, 05, 55 );
    }

    public int mostSeconds()
    {
        for ( int i = 0; i < clocksInStock.length; i++ )
        {
            if ( clocksInStock[i].totalSeconds() > x )
            {
                x = i;
            }
        }
        return x;
    }

    public String toString()
    {
        String output = String.format(
                "A: %d", x);
        return output;
    }
}
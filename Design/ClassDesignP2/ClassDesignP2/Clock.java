public class Clock
{
    private int hr;
    private int min;
    private int sec;
    public Clock()
    {
        hr = 9;
        min = 8;
        sec = 7;
    } //end constructor Song
    public Clock (String name, double cost, String artist)
    {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    public String toString( )
    {
        String output = new String();
        output = "0" + hr + ":" + "0" + min + ":" + "0" + sec;
        return output;
    }
}//end class song
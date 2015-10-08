public class Clock
{
    private int hr;
    private int min;
    private int sec;
    public Clock()
    {
        hr = 0;
        min = 0;
        sec = 0;
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
        output = hr + "/n:" + min + "/n" + sec;
        return output;
    }
}//end class song
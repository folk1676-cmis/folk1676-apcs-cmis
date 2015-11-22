public class Clock
{
    private int hour;
    private int minute;
    private int second;
    public Clock ( int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void convertDaylightSaving( int hours )
    {
        double random = Math.random();
        if (random > 0.5)
        {
            this.hour = hour+1;
        }
        else {
            this.hour = hour-1;
        }
    }

    public void setTime (int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int totalSeconds()
    {
        int output = (hour*3600)+(minute*60)+(second);
        return output;
    }

    public String toString( )
    {
        String output = new String();
        output =  "The time is " + hour + ":" +  minute + ":" + second + "\nTotal seconds is " +  totalSeconds() ;
        return output;
    }
}
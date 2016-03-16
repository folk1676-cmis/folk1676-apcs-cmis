public abstract class TV
{
    private boolean tvON;
    
    public TV()
    {
        this.tvON = tvON;
    }
    
    public boolean getTV()
    {
        return tvON;
    }
    
    public void setTV( boolean tvON )
    {
        this.tvON = tvON;
    }
    
    public abstract String type();
}

public class Graduate extends Student
{
    private String name;
    private String major;
    private int units;

    public Graduate(String name, String major, int units)
    {
        super(name, major, units);
    }

    public int calculateTuition(int units)  
    {
        return units * 500; // in dollars
    }
    
    public String toString()
    {
        return super.toString() + calculateTuition(getUnits());
    }

}
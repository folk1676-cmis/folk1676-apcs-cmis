public class UnderGraduate extends Student
{
    private String firstName;
    private String major;
    private int units;

    public UnderGraduate(String firstName, String major, int units)
    {
        super(firstName, major, units);
    }

    public int calculateTuition(int units)  
    {
        return units * 250;
    }
    
    public String toString()
    {
        return super.toString();
    }

}
public class PostGraduate extends Student
{
    private String name;
    private String major;
    private int units;

    public PostGraduate(String name, String major, int units)
    {
        super(name, major, units);
    }

    public int calculateTuition(int units)  
    {
        return units * 750;
    }
    
    public String toString()
    {
        return super.toString();
    }

}
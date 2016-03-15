public abstract class Student
{
    private String name;
    private String major;
    private int units;

    public Student(String name, String major, int units)
    {
        this.name = name;
        this.major = major;
        this.units = units;
    }

    public void Name(String name)
    {
        this.name = name;
    } // end method Name

    public String Name()
    {
        return name;	
    } // end method Name

    public void setMajor(String major)
    {
        this.major = major;
    } // end method setMajor

    public String getMajor()
    {
        return major;	
    } // end method getMajor

    public void setUnits(int units)
    {
        this.units = units;
    } // end method setUnits

    public int getUnits()
    {
        return units;	
    } // end method getUnits

    public abstract int calculateTuition(int units);

    public String toString()
    {
        String output = new String("");
        output = "\n\nName: " + name + "\nMajor: " + major + "\nUnits: " + units + "\nTuition: $";
        return output;
    }
}
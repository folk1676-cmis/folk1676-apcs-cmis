public class Senior extends Student
{
    String university;
    boolean gapYear;
    public Senior(String name, int yob, int mob, int dob, String schoolName, String university, boolean gapYear)
    {
        super(name, yob, mob, dob, schoolName);
        this.university = university;
        this.gapYear = gapYear;
    }
    
    public String toString()
    {
        return super.toString() + String.format("\nUniversity: %s\nGap Year: %s", university, gapYear);
    }
}
public class Student extends Person
{
    String schoolName;
    
    public Student(String name, int yob, int mob, int dob, String schoolName)
    {
        super(name, birthDay);
        this.schoolName = schoolName;
    }
    
        
    public String toString()
    {
        return super.toString() + String.format("\nSchool: %s", schoolName);
    }
    
}
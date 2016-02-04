public class Student
{
    private int gradelevel;
    private String firstname;
    private String lastname;
    private double eng;
    private double math;
    private double sci;
    private double fa;
    private double ss;
    private double grades[] = new double[5];

    public Student()
    {
        firstname = new String ("Min");
        lastname = new String ("Cho");
        gradelevel = 12;
        for (int i = 0; i < grades.length; i++)
        {
            grades[i] = Math.random() * 4;
        }
    } 

    public void setGPA(double eng, double math, double sci, double fa, double ss)
    {
        this.grades[0] = eng;
        this.grades[1] = math;
        this.grades[2] = sci;
        this.grades[3] = fa;
        this.grades[4] = ss;
    }

    public double calcGPA()
    {
        double totalGPA = 0;
        for (int i = 0; i < grades.length; i++)
        {
            grades[i] = Math.random() * 4;
            totalGPA = 0 + grades[i];
        }
        return totalGPA / grades.length;
    }

    public String getGrade()
    {
        if (calcGPA() >= 4.00)
        {
            return "A";
        }
        else if (calcGPA() > 3.00 && calcGPA() <= 4.00)
        {
            return "B";
        }
        else if (calcGPA() > 2.00 && calcGPA() <= 3.00)
        {
            return "C";
        }
        else if (calcGPA() > 1.00 && calcGPA() <= 2.00)
        {
            return "D";
        }
        else
        {
            return "F";
        }
    }

    public Student (String firstname, String lastname, int gradelevel, double eng, double math, double sci, double fa, double ss)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gradelevel = gradelevel;
        this.eng = eng;
        this.math = math;
        this.sci = sci;
        this.fa = fa;
        this.ss = ss;
    }

    public String lname ()
    {
        return this.lastname;
    }
    
    public String toString( )
    {
        String output = String.format(
                "First Name: %s \nLast Name: %s \nGrade Level: %d \nGPA: %.2f \nGrades: %s \n", firstname, lastname, gradelevel, calcGPA(), getGrade());
        return output;
    }
}
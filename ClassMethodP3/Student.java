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
        firstname = new String ("Jack");
        lastname = new String ("Smith");
        gradelevel = 11;
        for (int i = 0; i < grades.length; i++)
        {
            grades[i] = Math.random() * 4;
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
    public double calcGPA()
    {
        double totalGPA = 0;
        for (int i = 0; i < grades.length; i++)
        {
            totalGPA = totalGPA + grades[i];
        }
        return totalGPA / grades.length;
    }
    public String toString( )
    {
        String output = new String();
        output = String.format("firstname: %s, %s\n", %d
                            firstname,lastname);
        return output;
    }
}
public class Roster
{
    private Student[] students = new Student[3];

    public Roster()
    {
        students[0] = new Student ("Finn", "Balor", 9, 1.0, 1.0, 1.0, 2.0, 3.0);
        students[1] = new Student ("Luke", "Rockhold", 10, 2.0, 2.0, 2.0, 3.0, 4.0);
        students[2] = new Student ("Robert", "Lewandowski", 11, 3.0, 3.0, 3.0, 4.0, 4.0);
        //students[3] = new Student ("Hugo", "Padioleau", 12, 4.0, 4.0, 3.0, 4.0, 3.0);
    }

    public String findMaxGPA()
    {
        Student MaxGPA = new Student();
        for (int index = 0; index < students.length; index++)
        {
            if (students[index].calcGPA() > MaxGPA.calcGPA())
            {
                MaxGPA = students[index];
            }
        }
        return MaxGPA.firstname; 
    }

    public String toString()
    {
        String output = new String();
        for (Student names: students)
        {
            output = findMaxGPA() + " has the highest GPA out of all the students.";
        }
        return output; 
    }
}
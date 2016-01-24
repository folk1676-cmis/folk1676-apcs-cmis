public class Roster
{
    private Student []studentList;
    public Roster()
    {
        studentList= new Student [3];
        studentList[0] = new Student( "Luke ", "Rockhold ", 12 );
        studentList[1] = new Student( "Connor ","McGregor ", 12 );
        studentList[2] = new Student( "Dominick ", "Cruz ", 11);
    }
    
    public String findStudentWithMaxGPA()
    {
        double gpaH=0;
        String output ="";
        for ( Student x : studentList) 
        {
            if ( x.calcGPA() >= gpaH )
            {
                gpaH = x.calcGPA();
                output = x.getName();
            }
        }
        return output;
    }

    public String toString( )
    {
        String x = "";
        for (Student i : studentList)
        {
            x += i;
        }
        String output = new String();
        output =  x + "\n\n " + findStudentWithMaxGPA();
        return output;
    }
}
import java.util.ArrayList;
public class Roster2
{
    ArrayList<Student> myStudents = new ArrayList<Student>();
    public Roster2()
    {
        Student x = new Student( "Min", "Cho", 11, 1.7, 1.0, 0.0, 2.3, 1.0 );
        Student y = new Student( "Sean", "Kim", 11, 3.0, 0.0, 2.7, 0.0, 0.0 );
        Student z = new Student( "Punpun", "Nattavutthisit", 11, 1.7, 0.0, 1.7, 2.3, 1.0 );
        myStudents.add( x );
        myStudents.add( y );
        myStudents.add( z );
    }//end

    public void addStudent( Student newStudent )
    {
        myStudents.add( newStudent );
    }//end

    public void dropStudent( String lastname )
    {
        for ( int shark = 0; shark < myStudents.size(); shark++ )
        {
            if ( myStudents.get( shark ).lname().equals( lastname ) )
            {
                myStudents.remove( shark );
                shark--;
            }
        }
    }//end

    public String toString ( )
    {
        String x = "";
        for( Student y : myStudents )
        {
            x += y + "\n";
        }
        String output = x;
        return output;
    }
}

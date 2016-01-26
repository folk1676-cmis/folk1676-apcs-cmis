import java.util.ArrayList;
public class Rooster2
{
    ArrayList<Student> myStudents = new ArrayList<Student>();
    public Rooster2()
    {
        Student x = new Student( "Min", "Cho", 10, 1.7, 1.0, 2.7, 2.3, 1.0 );
        myStudents.add( x );
    }//end

    public void addStudent( Student newStudent )
    {
        myStudents.add( newStudent );
    }//end

    public void dropStudent( String lastname )
    {
        for ( int shark = 0; shark < myStudents.size(); shark++ )
        {
            if ( myStudents.get( shark ).equals( lastname ) );
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

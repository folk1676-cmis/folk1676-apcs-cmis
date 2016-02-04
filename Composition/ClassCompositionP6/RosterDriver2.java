public class RosterDriver2
{
    public static void main( String[] args )
    {
        Roster2 x = new Roster2();
        System.out.println( "The class started with 3 students: " );
        System.out.println( x );
        Student a = new Student( "KQLY", "Kukli", 12, 0.0, 0.0, 0.0, 0.0, 4.0 );
        x.addStudent( a );
        System.out.println( "Then somebody joined: ");
        System.out.println( x );
        x.dropStudent( "Kim" );
        System.out.println( "But somebody else dropped the class: ");
        System.out.println( x );
    }
}

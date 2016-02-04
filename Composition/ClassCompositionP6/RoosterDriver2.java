public class RoosterDriver2
{
    public static void main( String[] args )
    {
        Rooster2 x = new Rooster2();
        System.out.println( "The class started with 3 students: " );
        System.out.println( x );
        Student a = new Student( "KQLY", "Kukli", 12, 0.0, 0.0, 0.0, 0.0, 4.0 );
        x.addStudent( a );
        System.out.println( "Then, a new student joined the class: ");
        System.out.println( x );
        x.dropStudent( "Cho" );
        System.out.println( "However, they all dropped the class... ");
        System.out.println( x );
    }
}

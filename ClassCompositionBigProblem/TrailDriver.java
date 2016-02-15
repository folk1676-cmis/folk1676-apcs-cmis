import java.util.ArrayList;
public class TrailDriver     {
    public static void main (String argvs [] )
    {
        ArrayList<Integer> x = new ArrayList<Integer>(); 
        Trail MountainOne = new Trail ();
        Trail MountainTwo = new Trail ();
        Trail MountainThree = new Trail (x);

        x.add( 140 );
        x.add( 130 );
        x.add( 150 );
        x.add( 155 );                    
        x.add( 170 );
        x.add( 150 );
        x.add( 145 );
        x.add( 160 );   
        MountainThree.addMarker(60);
        MountainThree.addMarker(50);
        MountainThree.addMarker(60);
        MountainThree.addMarker(65);
        MountainThree.addMarker(60);

        System.out.println ("MountainOne\n"+ MountainOne + "\nMountainTwo\n" + MountainTwo + "\nMountainThree\n" + MountainThree);
    }
}
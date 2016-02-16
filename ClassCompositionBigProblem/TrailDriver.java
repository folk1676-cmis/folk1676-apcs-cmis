import java.util.ArrayList;
public class TrailDriver     {
    public static void main (String argvs [] )
    {
        ArrayList<Integer> two = new ArrayList<Integer>(); 
        ArrayList<Integer> three = new ArrayList<Integer>(); 
        Trail MountainOne = new Trail ();
        Trail MountainTwo = new Trail ( two );
        Trail MountainThree = new Trail ( three );

        two.add( 150 );
        two.add( 140 );
        two.add( 170 );
        two.add( 155 );                    
        two.add( 120 );
        two.add( 190 );
        two.add( 155 );
        two.add( 160 );  

        three.add( 140 );
        three.add( 130 );
        three.add( 150 );
        three.add( 155 );                    
        three.add( 170 );
        three.add( 150 );
        three.add( 145 );
        three.add( 185 ); 

        MountainTwo.addMarker( 80 );
        MountainTwo.addMarker( 70 );
        MountainTwo.addMarker( 65 );
        MountainTwo.addMarker( 65 );
        MountainTwo.addMarker( 40 );
        
        MountainThree.addMarker( 20 );
        MountainThree.addMarker( 90 );
        MountainThree.addMarker( 180 );
        MountainThree.addMarker( 120 );
        MountainThree.addMarker( 140 );

        System.out.println ("MountainOne\n"+ MountainOne + "\nMountainTwo\n" + MountainTwo + "\nMountainThree\n" + MountainThree);
        System.out.println( "MountainThree's Level from index 5 to 7: " + MountainThree.isLevelTrailSegment( 5, 7 ));
        System.out.println( "MountainThree's Difficulty from index 8 to 9: " + MountainThree.isDifficult( 8, 9 ));
    }
}
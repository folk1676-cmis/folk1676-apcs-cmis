public class MyPodDriver
{
    public static void main ( String argvs [] )
    {
        MyPod MyPod = new MyPod ();
        System.out.println( MyPod );
        System.out.println("");
        String[] asdf = new String[]{"Adventure of a Lifetime", ", A Sky Full of Stars", ", Yellow"} ;
        MyPod carPod = new MyPod ("White", 64, asdf);
        System.out.println( carPod );
    }
}

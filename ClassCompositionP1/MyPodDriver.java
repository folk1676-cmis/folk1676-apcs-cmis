public class MyPodDriver
{
    public static void main ( String argvs [] )
    {
        MyPod MyPod = new MyPod ();
        System.out.println( MyPod );
        System.out.println("");
        String[] asdf = new String[]{"D", "E", "F"} ;
        MyPod carPod = new MyPod ("White", 64, asdf);
        System.out.println( carPod );
    }
}

public class ClassMethodP5
{
    public static void main ( String argvs [] )
    {
        String school1 = new String ("Chicago");
        String school2 = new String ("Monash");
        String school3 = new String ("Columbia");
        
        System.out.println(school1.compareTo(school2));
        System.out.println(school1.compareTo(school3));
        //System.out.println(school2.compareTo(school1));
        //System.out.println(school2.compareTo(school3));
        //System.out.println(school3.compareTo(school1));
        //System.out.println(school3.compareTo(school2));
    }
}
//a. compareTo() is comparing the first letter of the string. 
//For example, Chicago = C --> 3. Monash = M --> 13
//So subtracts the other one from the inner bracket. 3 - 13= -10

//b. either takes teh next letter or ignore it and do the same.
//CH = 3 + 8 = 11, CO = 3 + 15 = 18 --> 11 - 18 = -7
//H = 8, O = 15 --> 8 - 15 = -7
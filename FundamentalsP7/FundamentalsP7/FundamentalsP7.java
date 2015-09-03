public class FundamentalsP7 
{
    public static void main ( String args[] )
    {
        int[]num = new int[10];
        int negative = 0;
        int positive = 0;
        for ( int index = 0; index < num.length ; index++)
        {
            int i = 0;

            i= (int)(100*Math.random());
            if (i % 2 ==0)
            {
                num[index] =((int)(100*(-1)*Math.random()));
                negative++;
            } //end if
            else 
            {
                num[index] =((int)(100*Math.random()));

                positive++;

            }// end else

        } // end for loop

        int index = 0;
        while (index < num.length)
        {
            System.out.println(num[index]);
            index++;
        }// end while loop
        System.out.println("The number of positive integers are " + positive + ". The number of negative integers are " + negative + ".");
        for ( int i = 0; i < num.length; i++)
        {

            if ( num [ i ] > 0)
            {
                System.out.print(num[i] + "\t");

            }
        }

    }   // end main
} // end FundamentalsP7 
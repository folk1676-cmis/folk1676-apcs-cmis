public class SimpleCardDriver
{
    public static void main ( String[] args )
    {
        String [] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String [] suit = {"H", "C", "S", "D"};
        SimpleCard[] deck = new SimpleCard[52];
        int [] x = new int [2];
        int [] y = new int [2];

        for ( int i = 0; i < deck.length; i++ )
        {
            x[i] = 0 + i;
            y[i] = 0 + i;
            SimpleCard deck= new deck(rank[x[i]],suit[y[i]]);
            SimpleCard[i] = deck;
            Sysmtem.out.print("");
        }
    }
}
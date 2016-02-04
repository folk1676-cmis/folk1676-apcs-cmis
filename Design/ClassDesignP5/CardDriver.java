public class CardDriver
{
    public static void main ( String[] args )
    {
        String [] MyHand = new String[3];
        String [] Cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String [] Suits = {"♠", "♥", "♦", "♣"};

        for ( int i = 0; i < MyHand.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            MyHand[i] = Suits[symbol] + Cards[card];
            System.out.println(MyHand[i]);
        }
    }
}

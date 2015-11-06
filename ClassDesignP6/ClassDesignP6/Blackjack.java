public class Blackjack
{
    public static void main ( String[] args )
    {
        String [] Dealer = new String[2];
        String [] P1 = new String [2];
        String [] P2 = new String [2];
        String [] P3 = new String [2];
        String [] P4 = new String [2];
        String [] P5 = new String [2];       
        String [] Cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String [] Suits = {"♠", "♥", "♦", "♣"};
        int valuedealer = 0;
        int value1 = 0;
        int value2 = 0;
        int value3 = 0;
        int value4 = 0;
        int value5 = 0;
        int totalvalue1 = 0;
        int totalvalue2 = 0;
        int totalvalue3 = 0;
        int totalvalue4 = 0;
        int totalvalue5 = 0;
        int totaldealer = 0;

        for ( int i = 0; i < Dealer.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            Dealer[i] = "Dealer's hands: " + Suits[i] + Cards[i];
            System.out.println(Dealer[i]);
            if (Cards[i] == "2")
            {
                valuedealer = 2;
            }
            if (Cards[i] == "3")
            {
                valuedealer = 3;
            }
            if (Cards[i] == "4")
            {
                valuedealer = 4;
            }
            if (Cards[i] == "5")
            {
                valuedealer = 5;
            }
            if (Cards[i] == "6")
            {
                valuedealer = 6;
            }
            if (Cards[i] == "7")
            {
                valuedealer = 7;
            }
            if (Cards[i] == "8")
            {
                valuedealer = 8;
            }
            if (Cards[i] == "9")
            {
                valuedealer = 9;
            }
            if (Cards[i] == "10")
            {
                valuedealer = 10;
            }
            if (Cards[i] == "J")
            {
                valuedealer = 10;
            }
            if (Cards[i] == "Q")
            {
                valuedealer = 10;
            }
            if (Cards[i] == "K")
            {
                valuedealer = 10;
            }
            if (Cards[i] == "A")
            {
                valuedealer = 11;
            }
            if (valuedealer > 21)
            {
                valuedealer = valuedealer - 10;
            }
            totaldealer += valuedealer;
        }
        System.out.println("Total card value of dealer: " + totaldealer);
        System.out.println("\n");

        for ( int i = 0; i < P1.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P1[i] = "Player 1's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P1[i]);
            if (Cards[i] == "2")
            {
                value1 = 2;
            }
            if (Cards[i] == "3")
            {
                value1 = 3;
            }
            if (Cards[i] == "4")
            {
                value1 = 4;
            }
            if (Cards[i] == "5")
            {
                value1 = 5;
            }
            if (Cards[i] == "6")
            {
                value1 = 6;
            }
            if (Cards[i] == "7")
            {
                value1 = 7;
            }
            if (Cards[i] == "8")
            {
                value1 = 8;
            }
            if (Cards[i] == "9")
            {
                value1 = 9;
            }
            if (Cards[i] == "10")
            {
                value1 = 10;
            }
            if (Cards[i] == "J")
            {
                value1 = 10;
            }
            if (Cards[i] == "Q")
            {
                value1 = 10;
            }
            if (Cards[i] == "K")
            {
                value1 = 10;
            }
            if (Cards[i] == "A")
            {
                value1 = 11;
            }
            totalvalue1 += value1;
        }
        System.out.println("Total value of player 1: " + totalvalue1);
        System.out.println("\n");

        for ( int i = 0; i < P2.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P2[i] = "Player 2's hands: " +Suits[symbol] + Cards[card];
            System.out.println(P2[i]);
            if (Cards[i] == "2")
            {
                value2 = 2;
            }
            if (Cards[i] == "3")
            {
                value2 = 3;
            }
            if (Cards[i] == "4")
            {
                value2 = 4;
            }
            if (Cards[i] == "5")
            {
                value2 = 5;
            }
            if (Cards[i] == "6")
            {
                value2 = 6;
            }
            if (Cards[i] == "7")
            {
                value2 = 7;
            }
            if (Cards[i] == "8")
            {
                value2 = 8;
            }
            if (Cards[i] == "9")
            {
                value2 = 9;
            }
            if (Cards[i] == "10")
            {
                value2 = 10;
            }
            if (Cards[i] == "J")
            {
                value2 = 10;
            }
            if (Cards[i] == "Q")
            {
                value2 = 10;
            }
            if (Cards[i] == "K")
            {
                value2 = 10;
            }
            if (Cards[i] == "A")
            {
                value2 = 11;
            }
            if (value1 > 21)
            {
                value1 = value1 - 10;
            }
            totalvalue2 += value2;
        }
        System.out.println("Total value of player 2: " + totalvalue2);
        System.out.println("\n");

        for ( int i = 0; i < P3.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P3[i] = "Player 3's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P3[i]);
            if (Cards[i] == "2")
            {
                value3 = 2;
            }
            if (Cards[i] == "3")
            {
                value3 = 3;
            }
            if (Cards[i] == "4")
            {
                value3 = 4;
            }
            if (Cards[i] == "5")
            {
                value3 = 5;
            }
            if (Cards[i] == "6")
            {
                value3 = 6;
            }
            if (Cards[i] == "7")
            {
                value3 = 7;
            }
            if (Cards[i] == "8")
            {
                value3 = 8;
            }
            if (Cards[i] == "9")
            {
                value3 = 9;
            }
            if (Cards[i] == "10")
            {
                value3 = 10;
            }
            if (Cards[i] == "J")
            {
                value3 = 10;
            }
            if (Cards[i] == "Q")
            {
                value3 = 10;
            }
            if (Cards[i] == "K")
            {
                value3 = 10;
            }
            if (Cards[i] == "A")
            {
                value3 = 11;
            }
            if (value3 > 21)
            {
                value3 = value3 - 10;
            }
            totalvalue3 += value3;
        }
        System.out.println("Total value of player 3: " + totalvalue3);
        System.out.println("\n");

        for ( int i = 0; i < P4.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P4[i] = "Player 4's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P4[i]);
            if (Cards[i] == "2")
            {
                value4 = 2;
            }
            if (Cards[i] == "3")
            {
                value4 = 3;
            }
            if (Cards[i] == "4")
            {
                value4 = 4;
            }
            if (Cards[i] == "5")
            {
                value4 = 5;
            }
            if (Cards[i] == "6")
            {
                value4 = 6;
            }
            if (Cards[i] == "7")
            {
                value4 = 7;
            }
            if (Cards[i] == "8")
            {
                value4 = 8;
            }
            if (Cards[i] == "9")
            {
                value4 = 9;
            }
            if (Cards[i] == "10")
            {
                value4 = 10;
            }
            if (Cards[i] == "J")
            {
                value4 = 10;
            }
            if (Cards[i] == "Q")
            {
                value4 = 10;
            }
            if (Cards[i] == "K")
            {
                value4 = 10;
            }
            if (Cards[i] == "A")
            {
                value4 = 11;
            }
            if (value4 > 21)
            {
                value4 = value4 - 10;
            }
            totalvalue4 += value4;
        }
        System.out.println("Total value of player 4: " + totalvalue4);
        System.out.println("\n");

        for ( int i = 0; i < P5.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P5[i] = "Player 5's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P5[i]);
            if (Cards[i] == "2")
            {
                value5 = 2;
            }
            if (Cards[i] == "3")
            {
                value5 = 3;
            }
            if (Cards[i] == "4")
            {
                value5 = 4;
            }
            if (Cards[i] == "5")
            {
                value5 = 5;
            }
            if (Cards[i] == "6")
            {
                value5 = 6;
            }
            if (Cards[i] == "7")
            {
                value5 = 7;
            }
            if (Cards[i] == "8")
            {
                value5 = 8;
            }
            if (Cards[i] == "9")
            {
                value5 = 9;
            }
            if (Cards[i] == "10")
            {
                value5 = 10;
            }
            if (Cards[i] == "J")
            {
                value5 = 10;
            }
            if (Cards[i] == "Q")
            {
                value5 = 10;
            }
            if (Cards[i] == "K")
            {
                value5 = 10;
            }
            if (Cards[i] == "A")
            {
                value5 = 11;
            }
            if (value5 > 21)
            {
                value5 = value5 - 10;
            }
            totalvalue5 += value5;
        }
        System.out.println("Total value of player 5: " + totalvalue5);
        System.out.println("\n");

        if (value1 == 21)
        {
            System.out.println("Player 1 got blackjack and wins!");
        }
        else if (value1 > valuedealer)
        {
            System.out.println("Player 1 wins!");
        }
        else
        {
            System.out.println("Player 1 loses!");
        }
        if (value2 == 21)
        {
            System.out.println("Player 2 got blackjack and wins!");
        }
        else if (value2 > valuedealer)
        {
            System.out.println("Player 2 wins!");
        }
        else 
        {
            System.out.println("Player 2 loses!");
        }
        if (value3 == 21)
        {
            System.out.println("Player 3 got blackjack and wins!");
        }
        else if (value3 > valuedealer)
        {
            System.out.println("Player 3 wins!");
        }
        else
        {
            System.out.println("Player 3 loses!");
        }
        if (value4 == 21)
        {
            System.out.println("Player 4 got blackjack and wins!");
        }
        else if (value4 > valuedealer)
        {
            System.out.println("Player 4 wins!");
        }
        else
        {
            System.out.println("Player 4 loses!");
        }
        if (value5 == 21)
        {
            System.out.println("Player 5 got blackjack and wins!");
        }
        else if (value5 > valuedealer)
        {
            System.out.println("Player 5 wins!");
        }
        else
        {
            System.out.println("Player 5 loses!");
        }
    }
}
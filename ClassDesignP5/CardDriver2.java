public class CardDriver2
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
        int value = 0;
        int totalvalue = 0;
        int totaldealer = 0;
        int[] x = new int[2];
        int[] y = new int[2];
        for ( int i = 0; i < Dealer.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            Dealer[i] = "Dealer's hands: " + Suits[i] + Cards[i];
            System.out.println(Dealer[i]);
            if (Cards[i] == "2")
            {
                value = 2;
            }
            if (Cards[i] == "3")
            {
                value = 3;
            }
            if (Cards[i] == "4")
            {
                value = 4;
            }
            if (Cards[i] == "5")
            {
                value = 5;
            }
            if (Cards[i] == "6")
            {
                value = 6;
            }
            if (Cards[i] == "7")
            {
                value = 7;
            }
            if (Cards[i] == "8")
            {
                value = 8;
            }
            if (Cards[i] == "9")
            {
                value = 9;
            }
            if (Cards[i] == "10")
            {
                value = 10;
            }
            if (Cards[i] == "J")
            {
                value = 10;
            }
            if (Cards[i] == "Q")
            {
                value = 10;
            }
            if (Cards[i] == "K")
            {
                value = 10;
            }
            if (Cards[i] == "A")
            {
                value = 11;
            }
            totaldealer += value;
        }
        System.out.println("Total card value of dealer: " + totaldealer);
        System.out.println("\n");

        for ( int i = 0; i < P1.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P1[i] = "Player 1's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P1[i]);
            if (P1[i] == "2")
            {
                value = 2;
            }
            if (P1[i] == "3")
            {
                value = 3;
            }
            if (P1[i] == "4")
            {
                value = 4;
            }
            if (P1[i] == "5")
            {
                value = 5;
            }
            if (P1[i] == "6")
            {
                value = 6;
            }
            if (P1[i] == "7")
            {
                value = 7;
            }
            if (P1[i] == "8")
            {
                value = 8;
            }
            if (P1[i] == "9")
            {
                value = 9;
            }
            if (P1[i] == "10")
            {
                value = 10;
            }
            if (P1[i] == "J")
            {
                value = 10;
            }
            if (P1[i] == "Q")
            {
                value = 10;
            }
            if (P1[i] == "K")
            {
                value = 10;
            }
            if (P1[i] == "A")
            {
                value = 11;
            }
            totalvalue += value;
        }
        System.out.println("Total value of player 1: " + totalvalue);
        System.out.println("\n");
        
        for ( int i = 0; i < P2.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P2[i] = "Player 2's hands: " +Suits[symbol] + Cards[card];
            System.out.println(P2[i]);
            if (P2[i] == "2")
            {
                value = 2;
            }
            if (P2[i] == "3")
            {
                value = 3;
            }
            if (P2[i] == "4")
            {
                value = 4;
            }
            if (P2[i] == "5")
            {
                value = 5;
            }
            if (P2[i] == "6")
            {
                value = 6;
            }
            if (P2[i] == "7")
            {
                value = 7;
            }
            if (P2[i] == "8")
            {
                value = 8;
            }
            if (P2[i] == "9")
            {
                value = 9;
            }
            if (P2[i] == "10")
            {
                value = 10;
            }
            if (P2[i] == "J")
            {
                value = 10;
            }
            if (P2[i] == "Q")
            {
                value = 10;
            }
            if (P2[i] == "K")
            {
                value = 10;
            }
            if (P2[i] == "A")
            {
                value = 11;
            }
            totalvalue += value;
        }
        System.out.println("Total value of player 2: " + totalvalue);
        System.out.println("\n");

        for ( int i = 0; i < P3.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P3[i] = "Player 3's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P3[i]);
            if (P3[i] == "2")
            {
                value = 2;
            }
            if (P3[i] == "3")
            {
                value = 3;
            }
            if (P3[i] == "4")
            {
                value = 4;
            }
            if (P3[i] == "5")
            {
                value = 5;
            }
            if (P3[i] == "6")
            {
                value = 6;
            }
            if (P3[i] == "7")
            {
                value = 7;
            }
            if (P3[i] == "8")
            {
                value = 8;
            }
            if (P3[i] == "9")
            {
                value = 9;
            }
            if (P3[i] == "10")
            {
                value = 10;
            }
            if (P3[i] == "J")
            {
                value = 10;
            }
            if (P3[i] == "Q")
            {
                value = 10;
            }
            if (P3[i] == "K")
            {
                value = 10;
            }
            if (P3[i] == "A")
            {
                value = 11;
            }
            totalvalue += value;
        }
        System.out.println("Total value of player 3: " + totalvalue);
        System.out.println("\n");

        for ( int i = 0; i < P4.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P4[i] = "Player 4's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P4[i]);
            if (P4[i] == "2")
            {
                value = 2;
            }
            if (P4[i] == "3")
            {
                value = 3;
            }
            if (P4[i] == "4")
            {
                value = 4;
            }
            if (P4[i] == "5")
            {
                value = 5;
            }
            if (P4[i] == "6")
            {
                value = 6;
            }
            if (P4[i] == "7")
            {
                value = 7;
            }
            if (P4[i] == "8")
            {
                value = 8;
            }
            if (P4[i] == "9")
            {
                value = 9;
            }
            if (P4[i] == "10")
            {
                value = 10;
            }
            if (P4[i] == "J")
            {
                value = 10;
            }
            if (P4[i] == "Q")
            {
                value = 10;
            }
            if (P4[i] == "K")
            {
                value = 10;
            }
            if (P4[i] == "A")
            {
                value = 11;
            }
            totalvalue += value;
        }
        System.out.println("Total value of player 4: " + totalvalue);
        System.out.println("\n");

        for ( int i = 0; i < P5.length; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P5[i] = "Player 5's hands: " + Suits[symbol] + Cards[card];
            System.out.println(P5[i]);
            if (P5[i] == "2")
            {
                value = 2;
            }
            if (P5[i] == "3")
            {
                value = 3;
            }
            if (P5[i] == "4")
            {
                value = 4;
            }
            if (P5[i] == "5")
            {
                value = 5;
            }
            if (P5[i] == "6")
            {
                value = 6;
            }
            if (P5[i] == "7")
            {
                value = 7;
            }
            if (P5[i] == "8")
            {
                value = 8;
            }
            if (P5[i] == "9")
            {
                value = 9;
            }
            if (P5[i] == "10")
            {
                value = 10;
            }
            if (P5[i] == "J")
            {
                value = 10;
            }
            if (P5[i] == "Q")
            {
                value = 10;
            }
            if (P5[i] == "K")
            {
                value = 10;
            }
            if (P5[i] == "A")
            {
                value = 11;
            }
            totalvalue += value;
        }
        System.out.println("Total value of player 5: " + totalvalue);
    }
}
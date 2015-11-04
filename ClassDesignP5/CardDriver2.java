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
        int value;
        int delta;
        
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            Dealer[i] = Suits[symbol] + Cards[card];
            System.out.println("Dealer's card: ");
            System.out.print(Dealer[i]);
            if (Dealer[i] == "2")
            {
                value = 2;
            }
            if (Dealer[i] == "3")
            {
                value = 3;
            }
            if (Dealer[i] == "4")
            {
                value = 4;
            }
            if (Dealer[i] == "5")
            {
                value = 5;
            }
            if (Dealer[i] == "6")
            {
                value = 6;
            }
            if (Dealer[i] == "7")
            {
                value = 7;
            }
            if (Dealer[i] == "8")
            {
                value = 8;
            }
            if (Dealer[i] == "9")
            {
                value = 9;
            }
            if (Dealer[i] == "10")
            {
                value = 10;
            }
            if (Dealer[i] == "J")
            {
                value = 10;
            }
            if (Dealer[i] == "Q")
            {
                value = 10;
            }
            if (Dealer[i] == "K")
            {
                value = 10;
            }
            if (Dealer[i] == "A")
            {
                value = 11;
            }
        }
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            Dealer[i] = Suits[symbol] + Cards[card];
            System.out.print(" " + Dealer[i]);
            if (Dealer[i] == "2")
            {
                value = 2;
            }
            if (Dealer[i] == "3")
            {
                value = 3;
            }
            if (Dealer[i] == "4")
            {
                value = 4;
            }
            if (Dealer[i] == "5")
            {
                value = 5;
            }
            if (Dealer[i] == "6")
            {
                value = 6;
            }
            if (Dealer[i] == "7")
            {
                value = 7;
            }
            if (Dealer[i] == "8")
            {
                value = 8;
            }
            if (Dealer[i] == "9")
            {
                value = 9;
            }
            if (Dealer[i] == "10")
            {
                value = 10;
            }
            if (Dealer[i] == "J")
            {
                value = 10;
            }
            if (Dealer[i] == "Q")
            {
                value = 10;
            }
            if (Dealer[i] == "K")
            {
                value = 10;
            }
            if (Dealer[i] == "A")
            {
                value = 11;
            }
        }
        System.out.print("\n");
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P1[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 1's card: ");
            System.out.print(P1[i]);
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
        }
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P1[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 1's card: ");
            System.out.print(P1[i]);
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
        }
        System.out.print("\n");
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P2[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 2's card: ");
            System.out.print(P2[i]);
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
        }
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P2[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 2's card: ");
            System.out.print(" " + P2[i]);
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
        }
        System.out.print("\n");
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P3[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 3's card: ");
            System.out.print(P3[i]);
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
        }
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P3[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 3's card: ");
            System.out.print(" " + P3[i]);
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
        }
        System.out.print("\n");
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P4[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 4's card: ");
            System.out.print(P4[i]);
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
        }
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P4[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 4's card: ");
            System.out.print(" " + P4[i]);
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
        }
        System.out.print("\n");
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P5[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 5's card: ");
            System.out.print(P5[i]);
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
        }
        for ( int i = 0; i < 1; i++ )
        {
            int card = (int)(Math.random()*13);
            int symbol = (int)(Math.random()*4);
            P5[i] = Suits[symbol] + Cards[card];
            System.out.println("Player 5's card: ");
            System.out.print(" " + P5[i]);
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
        }
    }
}
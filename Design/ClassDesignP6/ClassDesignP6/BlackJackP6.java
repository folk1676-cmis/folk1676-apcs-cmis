public class BlackJackP6
{
    public static void main ( String[] args )
    {
        int Value = 0;
        int totalValue = 0;
        int totalValuePlayer = 0;
        int [] x = new int [2];
        int [] y = new int [2];
        Card [] Dealer = new Card[2];
        Card [] Player1 = new Card[2];
        Card [] Player2 = new Card[2];
        Card [] Player3 = new Card[2];
        Card [] Player4 = new Card[2];
        Card [] Player5 = new Card[2];
        String [] Cards =  {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String [] Suit = {"♥", "♦", "♣", "♠"};        
        String Winner;
        
        System.out.print("Dealer's Hands:"); 
        System.out.print("\n");
        for( int i = 0; i < Dealer.length; i++)
        {
            x[i] = ((int) (Math.random()*13));
            y[i] = ((int) (Math.random()*4));
            Card DealerHand= new Card(Cards[x[i]],Suit[y[i]]); 
            Dealer[i]=DealerHand;
            System.out.print( "Dealer Card: "+Dealer[i] + "\n");
        }
        for( int i = 0; i < Dealer.length; i++)
        {
            if ( Cards[x[i]] == ("J") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] ==("Q") )
            {
                Value = 10;
            }
            else if  (Cards[x[i]] == ("K") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] == ("1") )
            {
                Value = 11;
            }
            else if (Cards[x[i]] == ("2") )
            {
                Value = 2;
            }   
            else if (Cards[x[i]] == ("3") )
            {
                Value = 3;
            }   
            else if (Cards[x[i]] == ("4") )
            {
                Value = 4;
            }    
            else if (Cards[x[i]] == ("5") )
            {
                Value = 5;
            }   
            else if (Cards[x[i]] == ("6") )
            {
                Value = 6;
            }   
            else if (Cards[x[i]] == ("7") )
            {
                Value = 7;
            }       
            else if (Cards[x[i]] == ("8") )
            {
                Value = 8;
            }   
            else if (Cards[x[i]] == ("9") )
            {
                Value = 9;
            }   
            else if (Cards[x[i]] == ("10") )
            {
                Value = 10;
            }     
            totalValue += Value;
            System.out.print("Dealer Value : "+Value+ "\n");

        }
        System.out.print("Total Value: " + totalValue + "\n");
        System.out.print("\n");
        System.out.print("Player 1's Hands:"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            x[i] = ((int) (Math.random()*13));
            y[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[x[i]],Suit[y[i]]); 
            Player1[i]=PlayerHand;
            System.out.print( "Player Card: "+Player1[i] + "\n");
        }
        for( int i = 0; i < Player1.length; i++)
        {
            if (Cards[x[i]] == ("J") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] ==("Q") )
            {
                Value = 10;
            }
            else if  (Cards[x[i]] == ("K") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] == ("1") )
            {
                Value = 11;
            }
            else if (Cards[x[i]] == ("2") )
            {
                Value = 2;
            }   
            else if (Cards[x[i]] == ("3") )
            {
                Value = 3;
            }   
            else if (Cards[x[i]] == ("4") )
            {
                Value = 4;
            }    
            else if (Cards[x[i]] == ("5") )
            {
                Value = 5;
            }   
            else if (Cards[x[i]] == ("6") )
            {
                Value = 6;
            }   
            else if (Cards[x[i]] == ("7") )
            {
                Value = 7;
            }       
            else if (Cards[x[i]] == ("8") )
            {
                Value = 8;
            }   
            else if (Cards[x[i]] == ("9") )
            {
                Value = 9;
            }   
            else if (Cards[x[i]] == ("10") )
            {
                Value = 10;
            }     
            totalValuePlayer += Value;
            System.out.print("Player Value: "+Value+ "\n");
        }
        System.out.print( "Total Value: " + totalValuePlayer +  "\n");
        if (totalValuePlayer==21)
        {
            Winner = "Player 1";
            System.out.print("Result: Player 1 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print("Result: Player 1 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = "Player 1";
            System.out.print("Result: Player 1 won dealer with " + totalValuePlayer + " points which is more than the dealer's " + totalValue + " points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("Result: Dealer won Player 1 with " + totalValue + " points, which is more than the player's " + totalValuePlayer +  " points.");
        } 
        totalValuePlayer = 0;
        System.out.println("\n");
        System.out.print("Player 2's Hands:"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            x[i] = ((int) (Math.random()*13));
            y[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[x[i]],Suit[y[i]]); 
            Player2[i]=PlayerHand;
            System.out.print( "Player Card: "+Player2[i] + "\n");
        }
        for( int i = 0; i < Player2.length; i++)
        {
            if (Cards[x[i]] == ("J") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] ==("Q") )
            {
                Value = 10;
            }
            else if  (Cards[x[i]] == ("K") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] == ("1") )
            {
                Value = 11;
            }
            else if (Cards[x[i]] == ("2") )
            {
                Value = 2;
            }   
            else if (Cards[x[i]] == ("3") )
            {
                Value = 3;
            }   
            else if (Cards[x[i]] == ("4") )
            {
                Value = 4;
            }    
            else if (Cards[x[i]] == ("5") )
            {
                Value = 5;
            }   
            else if (Cards[x[i]] == ("6") )
            {
                Value = 6;
            }   
            else if (Cards[x[i]] == ("7") )
            {
                Value = 7;
            }       
            else if (Cards[x[i]] == ("8") )
            {
                Value = 8;
            }   
            else if (Cards[x[i]] == ("9") )
            {
                Value = 9;
            }   
            else if (Cards[x[i]] == ("10") )
            {
                Value = 10;
            }     
            totalValuePlayer += Value;
            System.out.print("Player Value: "+Value+ "\n");
        }
        System.out.print( "Total Value: " + totalValuePlayer +  "\n");
        if (totalValuePlayer==21)
        {
            Winner = "Player 2";
            System.out.print("Result: Player 2 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print("Result: Player 2 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = "Player 2";
            System.out.print("Result: Player 2 won dealer with " + totalValuePlayer + " points which is more than the dealer's " + totalValue + " points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("Result: Dealer won Player 2 with " + totalValue + " points, which is more than the player's " + totalValuePlayer +  " points.");
        } 
        totalValuePlayer = 0;
        System.out.println("\n");
        System.out.print("Player 3's Hands:"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            x[i] = ((int) (Math.random()*13));
            y[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[x[i]],Suit[y[i]]); 
            Player3[i]=PlayerHand;
            System.out.print( "Player Card: "+Player3[i] + "\n");
        }
        for( int i = 0; i < Player3.length; i++)
        {
            if (Cards[x[i]] == ("J") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] ==("Q") )
            {
                Value = 10;
            }
            else if  (Cards[x[i]] == ("K") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] == ("1") )
            {
                Value = 11;
            }
            else if (Cards[x[i]] == ("2") )
            {
                Value = 2;
            }   
            else if (Cards[x[i]] == ("3") )
            {
                Value = 3;
            }   
            else if (Cards[x[i]] == ("4") )
            {
                Value = 4;
            }    
            else if (Cards[x[i]] == ("5") )
            {
                Value = 5;
            }   
            else if (Cards[x[i]] == ("6") )
            {
                Value = 6;
            }   
            else if (Cards[x[i]] == ("7") )
            {
                Value = 7;
            }       
            else if (Cards[x[i]] == ("8") )
            {
                Value = 8;
            }   
            else if (Cards[x[i]] == ("9") )
            {
                Value = 9;
            }   
            else if (Cards[x[i]] == ("10") )
            {
                Value = 10;
            }     
            totalValuePlayer += Value;
            System.out.print("Player Value: "+Value+ "\n");
        }
        System.out.print( "Total Value: " + totalValuePlayer +  "\n");
        if (totalValuePlayer==21)
        {
            Winner = "Player 3";
            System.out.print("Result: Player 3 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print("Result: Player 3 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = "Player 3";
            System.out.print("Result: Player 3 won dealer with " + totalValuePlayer + " points which is more than the dealer's " + totalValue + " points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("Result: Dealer won Player 3 with " + totalValue + " points, which is more than the player's " + totalValuePlayer +  " points.");
        } 
        totalValuePlayer = 0;
        System.out.println("\n");
        System.out.print("Player 4's Hands:"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            x[i] = ((int) (Math.random()*13));
            y[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[x[i]],Suit[y[i]]); 
            Player4[i]=PlayerHand;
            System.out.print( "Player Card: "+Player4[i] + "\n");
        }
        for( int i = 0; i < Player4.length; i++)
        {
            if (Cards[x[i]] == ("J") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] ==("Q") )
            {
                Value = 10;
            }
            else if  (Cards[x[i]] == ("K") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] == ("1") )
            {
                Value = 11;
            }
            else if (Cards[x[i]] == ("2") )
            {
                Value = 2;
            }   
            else if (Cards[x[i]] == ("3") )
            {
                Value = 3;
            }   
            else if (Cards[x[i]] == ("4") )
            {
                Value = 4;
            }    
            else if (Cards[x[i]] == ("5") )
            {
                Value = 5;
            }   
            else if (Cards[x[i]] == ("6") )
            {
                Value = 6;
            }   
            else if (Cards[x[i]] == ("7") )
            {
                Value = 7;
            }       
            else if (Cards[x[i]] == ("8") )
            {
                Value = 8;
            }   
            else if (Cards[x[i]] == ("9") )
            {
                Value = 9;
            }   
            else if (Cards[x[i]] == ("10") )
            {
                Value = 10;
            }     
            totalValuePlayer += Value;
            System.out.print("Player Value: "+Value+ "\n");
        }
        System.out.print( "Total Value: " + totalValuePlayer +  "\n");
        if (totalValuePlayer==21)
        {
            Winner = "Player 4";
            System.out.print("Result: Player 4 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print("Result: Player 4 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = "Player 4";
            System.out.print("Result: Player 4 won dealer with " + totalValuePlayer + " points which is more than the dealer's " + totalValue + " points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("Result: Dealer won Player 4 with " + totalValue + " points, which is more than the player's " + totalValuePlayer +  " points.");
        } 
        totalValuePlayer = 0;
        System.out.println("\n");
        System.out.print("Player 5's Hands:"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            x[i] = ((int) (Math.random()*13));
            y[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[x[i]],Suit[y[i]]); 
            Player5[i]=PlayerHand;
            System.out.print( "Player Card: "+Player5[i] + "\n");
        }
        for( int i = 0; i < Player5.length; i++)
        {
            if (Cards[x[i]] == ("J") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] ==("Q") )
            {
                Value = 10;
            }
            else if  (Cards[x[i]] == ("K") )
            {
                Value = 10;
            }
            else if (Cards[x[i]] == ("1") )
            {
                Value = 11;
            }
            else if (Cards[x[i]] == ("2") )
            {
                Value = 2;
            }   
            else if (Cards[x[i]] == ("3") )
            {
                Value = 3;
            }   
            else if (Cards[x[i]] == ("4") )
            {
                Value = 4;
            }    
            else if (Cards[x[i]] == ("5") )
            {
                Value = 5;
            }   
            else if (Cards[x[i]] == ("6") )
            {
                Value = 6;
            }   
            else if (Cards[x[i]] == ("7") )
            {
                Value = 7;
            }       
            else if (Cards[x[i]] == ("8") )
            {
                Value = 8;
            }   
            else if (Cards[x[i]] == ("9") )
            {
                Value = 9;
            }   
            else if (Cards[x[i]] == ("10") )
            {
                Value = 10;
            }     
            totalValuePlayer += Value;
            System.out.print("Player Value: "+Value+ "\n");
        }
        System.out.print( "Total Value: " + totalValuePlayer +  "\n");
        if (totalValuePlayer==21)
        {
            Winner = "Player 5";
            System.out.print("Result: Player 5 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print("Result: Player 5 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = "Player 5";
            System.out.print("Result: Player 5 won dealer with " + totalValuePlayer + " points which is more than the dealer's " + totalValue + " points.");
        }  
        else 
        {
            Winner = "Dealer";
            System.out.print("Result: Dealer won Player 5 with " + totalValue + " points, which is more than the player's " + totalValuePlayer +  " points.");
        } 
    }
}
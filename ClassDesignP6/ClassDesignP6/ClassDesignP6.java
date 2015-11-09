public class ClassDesignP6
{
    public static void main ( String[] args )
    {
        int value = 0;
        int totalValue = 0;
        int totalValuePlayer = 0;

        int [] a = new int [2];
        int [] b = new int [2];
        
        Card [] Dealer = new Card[2];
        Card [] Player1 = new Card[2];
        Card [] Player2 = new Card[2];
        Card [] Player3 = new Card[2];
        Card [] Player4 = new Card[2];
        Card [] Player5 = new Card[2];

        String Winner;
        String [] Cards =  {"1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9", " 10", " J", " Q", " K"};
        String [] Suit = {"♥", " ♦", " ♣", " ♠"};
        
        System.out.print("DEALER'S HANDS:"); 
        System.out.print("\n");
        for( int i = 0; i < Dealer.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Card DealerHand= new Card(Cards[a[i]],Suit[b[i]]); 
            Dealer[i] = DealerHand;
            System.out.print( "Dealer Card: " +Dealer[i] + "\n");
        }
        for( int i = 0; i < Dealer.length; i++)
        {
            if ( Cards[a[i]] == ("J") )
            {
                value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
            {
                value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
            {
                value = 10;
            }
            else if (Cards[a[i]] == ("1") )
            {
                value = 11;
            }
            else if (Cards[a[i]] == ("2") )
            {
                value = 2;
            }   
            else if (Cards[a[i]] == ("3") )
            {
                value = 3;
            }   
            else if (Cards[a[i]] == ("4") )
            {
                value = 4;
            }    
            else if (Cards[a[i]] == ("5") )
            {
                value = 5;
            }   
            else if (Cards[a[i]] == ("6") )
            {
                value = 6;
            }   
            else if (Cards[a[i]] == ("7") )
            {
                value = 7;
            }       
            else if (Cards[a[i]] == ("8") )
            {
                value = 8;
            }   
            else if (Cards[a[i]] == ("9") )
            {
                value = 9;
            }   
            else if (Cards[a[i]] == ("10") )
            {
                value = 10;
            }     
            totalValue += value;
            System.out.print("Dealer value : " + value + "\n");
        }
        System.out.print(" Total value for Dealer: " + totalValue + "\n");
        System.out.print("\n");
        
        System.out.print("PLAYER 1'S  HANDS's HANDS"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
            Player1[i]=PlayerHand;
            System.out.print( " Player Card: " +Player1[i] + "\n");
        }
        for( int i = 0; i < Player1.length; i++)
        {
            if (Cards[a[i]] == ("J") )
            {
                value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
            {
                value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
            {
                value = 10;
            }
            else if (Cards[a[i]] == ("1") )
            {
                value = 11;
            }
            else if (Cards[a[i]] == ("2") )
            {
                value = 2;
            }   
            else if (Cards[a[i]] == ("3") )
            {
                value = 3;
            }   
            else if (Cards[a[i]] == ("4") )
            {
                value = 4;
            }    
            else if (Cards[a[i]] == ("5") )
            {
                value = 5;
            }   
            else if (Cards[a[i]] == ("6") )
            {
                value = 6;
            }   
            else if (Cards[a[i]] == ("7") )
            {
                value = 7;
            }       
            else if (Cards[a[i]] == ("8") )
            {
                value = 8;
            }   
            else if (Cards[a[i]] == ("9") )
            {
                value = 9;
            }   
            else if (Cards[a[i]] == ("10") )
            {
                value = 10;
            }     
            totalValuePlayer += value;
            System.out.print(" Player value : " + value + "\n");
        }
        System.out.print( " Total value for Player : " + totalValuePlayer + "\n");
        System.out.print("\n");
        if (totalValuePlayer==21)
        {
            Winner = " Player 1";
            System.out.print(" RESULT : Player 1 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 1 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = " Player 1";
            System.out.print(" RESULT : Player 1 won dealer with " + totalValuePlayer + "points while Dealer lost with " + totalValue + " points.");
        }  
        else 
        {
            Winner = " Dealer";
            System.out.print(" RESULT : Dealer won Player 1 with " + totalValue + "points while Player 1 lost with " + totalValuePlayer + " points.");
        } 
        totalValuePlayer = 0;
        System.out.print("\n");
        
        System.out.print("PLAYER 2'S  HANDS's HANDS"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
            Player2[i]=PlayerHand;
            System.out.print( " Player Card: " +Player2[i] + "\n");
        }
        for( int i = 0; i < Player2.length; i++)
        {
            if (Cards[a[i]] == ("J") )
            {
                value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
            {
                value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
            {
                value = 10;
            }
            else if (Cards[a[i]] == ("1") )
            {
                value = 11;
            }
            else if (Cards[a[i]] == ("2") )
            {
                value = 2;
            }   
            else if (Cards[a[i]] == ("3") )
            {
                value = 3;
            }   
            else if (Cards[a[i]] == ("4") )
            {
                value = 4;
            }    
            else if (Cards[a[i]] == ("5") )
            {
                value = 5;
            }   
            else if (Cards[a[i]] == ("6") )
            {
                value = 6;
            }   
            else if (Cards[a[i]] == ("7") )
            {
                value = 7;
            }       
            else if (Cards[a[i]] == ("8") )
            {
                value = 8;
            }   
            else if (Cards[a[i]] == ("9") )
            {
                value = 9;
            }   
            else if (Cards[a[i]] == ("10") )
            {
                value = 10;
            }     
            totalValuePlayer += value;
            System.out.print(" Player value : " + value + "\n");
        }
        System.out.print( " Total value for Player : " + totalValuePlayer + "\n");
        System.out.print("\n");
        if (totalValuePlayer==21)
        {
            Winner = " Player 2";
            System.out.print(" RESULT : Player 2 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 2 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = " Player 2";
            System.out.print(" RESULT : Player 2 won dealer with " + totalValuePlayer + "points while Dealer lost with " + totalValue + " points.");
        }  
        else 
        {
            Winner = " Dealer";
            System.out.print(" RESULT : Dealer won Player 2 with " + totalValue + "points while Player 2 lost with " + totalValuePlayer + " points.");
        } 
        totalValuePlayer = 0;
        System.out.print("\n");
        
        System.out.print("PLAYER 3'S  HANDS"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
            Player3[i]=PlayerHand;
            System.out.print( " Player Card: " +Player3[i] + "\n");
        }
        for( int i = 0; i < Player3.length; i++)
        {
            if (Cards[a[i]] == ("J") )
            {
                value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
            {
                value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
            {
                value = 10;
            }
            else if (Cards[a[i]] == ("1") )
            {
                value = 11;
            }
            else if (Cards[a[i]] == ("2") )
            {
                value = 2;
            }   
            else if (Cards[a[i]] == ("3") )
            {
                value = 3;
            }   
            else if (Cards[a[i]] == ("4") )
            {
                value = 4;
            }    
            else if (Cards[a[i]] == ("5") )
            {
                value = 5;
            }   
            else if (Cards[a[i]] == ("6") )
            {
                value = 6;
            }   
            else if (Cards[a[i]] == ("7") )
            {
                value = 7;
            }       
            else if (Cards[a[i]] == ("8") )
            {
                value = 8;
            }   
            else if (Cards[a[i]] == ("9") )
            {
                value = 9;
            }   
            else if (Cards[a[i]] == ("10") )
            {
                value = 10;
            }     
            totalValuePlayer += value;
            System.out.print(" Player value : " + value + "\n");
        }
        System.out.print( " Total value for Player : " + totalValuePlayer + "\n");
        System.out.print("\n");
        if (totalValuePlayer==21)
        {
            Winner = " Player 3";
            System.out.print(" RESULT : Player 3 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 3 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = " Player 3";
            System.out.print(" RESULT : Player 3 won dealer with " + totalValuePlayer + "points while Dealer lost with " + totalValue + " points.");
        }  
        else 
        {
            Winner = " Dealer";
            System.out.print(" RESULT : Dealer won Player 3 with " + totalValue + "points while Player 3 lost with " + totalValuePlayer + " points.");
        } 
        totalValuePlayer = 0;
        System.out.print("\n");
        
        System.out.print("PLAYER 4'S  HANDS"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
            Player4[i]=PlayerHand;
            System.out.print( " Player Card: " +Player4[i] + "\n");
        }
        for( int i = 0; i < Player4.length; i++)
        {
            if (Cards[a[i]] == ("J") )
            {
                value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
            {
                value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
            {
                value = 10;
            }
            else if (Cards[a[i]] == ("1") )
            {
                value = 11;
            }
            else if (Cards[a[i]] == ("2") )
            {
                value = 2;
            }   
            else if (Cards[a[i]] == ("3") )
            {
                value = 3;
            }   
            else if (Cards[a[i]] == ("4") )
            {
                value = 4;
            }    
            else if (Cards[a[i]] == ("5") )
            {
                value = 5;
            }   
            else if (Cards[a[i]] == ("6") )
            {
                value = 6;
            }   
            else if (Cards[a[i]] == ("7") )
            {
                value = 7;
            }       
            else if (Cards[a[i]] == ("8") )
            {
                value = 8;
            }   
            else if (Cards[a[i]] == ("9") )
            {
                value = 9;
            }   
            else if (Cards[a[i]] == ("10") )
            {
                value = 10;
            }     
            totalValuePlayer += value;
            System.out.print(" Player value : " + value + "\n");
        }
        System.out.print( " Total value for Player : " + totalValuePlayer + "\n");
        System.out.print("\n");
        if (totalValuePlayer==21)
        {
            Winner = " Player 4";
            System.out.print(" RESULT : Player 4 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 4 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = " Player 4";
            System.out.print(" RESULT : Player 4 won dealer with " + totalValuePlayer + "points while Dealer lost with " + totalValue + " points.");
        }  
        else 
        {
            Winner = " Dealer";
            System.out.print(" RESULT : Dealer won Player 4 with " + totalValue + "points while Player 4 lost with " + totalValuePlayer + " points.");
        } 
        totalValuePlayer = 0;
        System.out.print("\n");
        
        System.out.print("PLAYER 5'S  HANDS"); 
        System.out.print("\n");
        for( int i = 0; i < Player1.length; i++)
        {
            a[i] = ((int) (Math.random()*13));
            b[i] = ((int) (Math.random()*4));
            Card PlayerHand= new Card(Cards[a[i]],Suit[b[i]]); 
            Player5[i]=PlayerHand;
            System.out.print( " Player Card: " +Player5[i] + "\n");
        }
        for( int i = 0; i < Player5.length; i++)
        {
            if (Cards[a[i]] == ("J") )
            {
                value = 10;
            }
            else if (Cards[a[i]] ==("Q") )
            {
                value = 10;
            }
            else if  (Cards[a[i]] == ("K") )
            {
                value = 10;
            }
            else if (Cards[a[i]] == ("1") )
            {
                value = 11;
            }
            else if (Cards[a[i]] == ("2") )
            {
                value = 2;
            }   
            else if (Cards[a[i]] == ("3") )
            {
                value = 3;
            }   
            else if (Cards[a[i]] == ("4") )
            {
                value = 4;
            }    
            else if (Cards[a[i]] == ("5") )
            {
                value = 5;
            }   
            else if (Cards[a[i]] == ("6") )
            {
                value = 6;
            }   
            else if (Cards[a[i]] == ("7") )
            {
                value = 7;
            }       
            else if (Cards[a[i]] == ("8") )
            {
                value = 8;
            }   
            else if (Cards[a[i]] == ("9") )
            {
                value = 9;
            }   
            else if (Cards[a[i]] == ("10") )
            {
                value = 10;
            }     
            totalValuePlayer += value;
            System.out.print(" Player value : " + value + "\n");
        }
        System.out.print( " Total value for Player : " + totalValuePlayer + "\n");
        System.out.print("\n");
        if (totalValuePlayer==21)
        {
            Winner = " Player 5";
            System.out.print(" RESULT : Player 5 won dealer with 21 points");
        }  
        else if( totalValuePlayer > 21)
        {
            System.out.print(" RESULT : Player 5 Lost");
        }
        else if (totalValuePlayer > totalValue)
        {
            Winner = " Player 5";
            System.out.print(" RESULT : Player 5 won dealer with " + totalValuePlayer + "points while Dealer lost with " + totalValue + " points.");
        }  
        else 
        {
            Winner = " Dealer";
            System.out.print(" RESULT : Dealer won Player 5 with " + totalValue + "points while Player 5 lost with " + totalValuePlayer + " points.");
        } 
    }
}
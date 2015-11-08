public class Card
{
    public String Cards;
    public String Suit;
    public Card()
    {
        Cards = "7";
        Suit = "♣";

    }    
    public Card (String Cards, String Suit )    
    {
        this.Cards = Cards;
        this.Suit = Suit;

    }   
    public String toString()
    {
        String result =  String.format (
                "%s %s", Cards, Suit);
        return result;
    } 

}
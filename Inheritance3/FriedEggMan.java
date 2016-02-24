public class FriedEggMan extends SuperHero
{
    private String suitColor;
    private boolean hasCape;

    public FriedEggMan()
    {
        super();
    }

    public FriedEggMan( String setSuitColor, boolean setCape )
    {
        this.suitColor = suitColor;
        this.hasCape = hasCape;
    }

    public String motto()
    {
        return "Fries Eggs";
    }
}

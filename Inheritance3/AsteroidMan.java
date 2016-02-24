public class AsteroidMan extends SuperHero
{
    private String suitColor;
    private boolean hasCape;

    public AsteroidMan()
    {
        super();
    }

    public AsteroidMan( String setSuitColor, boolean setCape )
    {
        this.suitColor = suitColor;
        this.hasCape = hasCape;
    }

    public String motto()
    {
        return "An Astronaut";
    }
}

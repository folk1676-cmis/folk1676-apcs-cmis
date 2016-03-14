public class AsteroidMan extends SuperHero
{
    public AsteroidMan()
    {
        super();
    }

    public String motto()
    {
        return "'SpaceMan'";
    }

    public String toString()
    {
        return super.toString() + "\t" + motto();
    }
}

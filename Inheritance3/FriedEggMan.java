public class FriedEggMan extends SuperHero
{
    public FriedEggMan()
    {
        super();
    }

    public String motto()
    {
        return "'EggMan'";
    }

    public String toString()
    {
        return super.toString() + "\t" + motto();
    }
}
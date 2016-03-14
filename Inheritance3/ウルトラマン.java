public class ウルトラマン extends SuperHero
{
    public ウルトラマン()
    {
        super();
    }

    public String motto()
    {
        return "'禁じられた言葉'";
    }

    public String toString()
    {
        return super.toString() + "\t" + motto();
    }
}
public class ウルトラマン extends SuperHero
{
    private String suitColor;
    private boolean hasCape;

    public ウルトラマン()
    {
        super();
    }

    public ウルトラマン( String setSuitColor, boolean setCape )
    {
        this.suitColor = suitColor;
        this.hasCape = hasCape;
    }

    public String motto()
    {
        return "禁じられた言葉";
    }
}
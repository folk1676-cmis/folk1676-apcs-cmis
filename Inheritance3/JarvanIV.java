public class JarvanIV extends SuperHero
{
    private String suitColor;
    private boolean hasCape;

    public JarvanIV()
    {
        super();
    }

    public JarvanIV( String setSuitColor, boolean setCape )
    {
        this.suitColor = suitColor;
        this.hasCape = hasCape;
    }

    public String motto()
    {
        return "DEMACIA";
    }
}
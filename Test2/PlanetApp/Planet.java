public class Planet
{
    private int maxPopulation;
    private double percentageSpaceMarines;
    private int maxSpaceMarinesPerStarDestroyer;
    private int nPlanets;
    private Planet p;
    public Planet()
    {
        maxPopulation = 1;
        percentageSpaceMarines = 1;
        maxSpaceMarinesPerStarDestroyer = 1;
        nPlanets = 1;
    }
    public Planet (int maxPopulation, double percentageSpaceMarines, int maxSpaceMarinesPerStarDestroyer, int nPlanets)
    {
        this.maxPopulation = maxPopulation;
        this.percentageSpaceMarines = percentageSpaceMarines;
        this.maxSpaceMarinesPerStarDestroyer = maxSpaceMarinesPerStarDestroyer;
        this.nPlanets = nPlanets;
    }
    public String toString()
    {
        String output = new String();
        output = "Name: " + "\n" + "Relationship: " + "\n" + "Radius: " +  "\n" + "Population: " + maxPopulation + "\n" + "Space Marines as percent of Pop: " +  "\n" + "Space Marines: " + percentageSpaceMarines +"\n" + "Star Destroyers: " + maxSpaceMarinesPerStarDestroyer +"\n" + "Space Marines per star destroyer: " + "" +"\n";
        return output;
    }
}
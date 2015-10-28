public class Planet
{
    private int maxPopulation;
    private double percentageSpaceMarines;
    private int maxSpaceMarinesPerStarDestroyer;
    private int nPlanets;
    private double radius;
    private String p;
    private String [] relationship;
    public Planet()
    {
        maxPopulation = 1;
        percentageSpaceMarines = 1;
        maxSpaceMarinesPerStarDestroyer = 1;
        nPlanets = 1;
        radius = 1;
        relationship = new String [] {"Hostile" , "At War", "Neutral", "Friendly", "Ally"};
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
        output = "Name: " + "\n" + "Relationship: " + relationship + "\n" + "Radius: " + radius +  "\n" + "Population: " + (maxPopulation-(int)((Math.random()*maxPopulation))) + "\n" + "Space Marines as percent of Pop: " + percentageSpaceMarines + "\n" + "Space Marines: " + maxPopulation-((int)(Math.random())*maxPopulation) +"\n" + "Star Destroyers: " + maxSpaceMarinesPerStarDestroyer +"\n" + "Space Marines per star destroyer: " + "" +"\n";
        return output;
    }
}
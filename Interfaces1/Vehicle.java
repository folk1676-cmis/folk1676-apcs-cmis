public abstract class Vehicle 
{
    private int horsepower;
    private String color;
    public Vehicle()
    {
        horsepower = 420;
        color = new String ("Red");
    } //end constructor  
    public Vehicle( int horsepower, String color)
    {
        this.horsepower = horsepower;
        this.color = color;
    } //end constructor  

    public String toString()
    {
      String output ="\nHorse Power: " + horsepower + "HPW" + "\nColor: " + color; 
      return output;
    }
}
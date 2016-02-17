public class Plasma extends Television
{
    private String model;
    private double price;
    
    public Plasma()
    {
        
    }
    
    public Plasma(String model, double price)
    {
        super(model, price);
        this.model = model;
        this.price = price; 
    }
    
    public String toString()
    {
        return super.toString();
    }
}
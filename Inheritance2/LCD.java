public class LCD extends Television
{
    private String model;
    private double price;
    
    public LCD()
    {
        
    }
    
    public LCD(String model, double price)
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
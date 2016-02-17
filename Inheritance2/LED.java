public class LED extends Television
{
    private String model;
    private double price;
    
    public LED()
    {
        
    }
    
    public LED(String model, double price)
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
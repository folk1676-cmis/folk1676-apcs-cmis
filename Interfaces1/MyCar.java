public class MyCar extends Vehicle implements Connectable, Discountable
{
    private int price;

    public MyCar( int horsepower, String color, int price )
    {
        super( horsepower, color );
        this.price = price;
    }

    public boolean discount()
    {
        return true;
    }

    public void connectToBluetooth()
    {
        System.out.print("Bluetooth Connected");
    }

    public String toString()
    {
        return super.toString() + "\nPrice: $" + price + "\n";
    }
}
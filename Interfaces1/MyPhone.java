public class MyPhone extends MyDevice 
{
    private String name;
    private boolean mint;

    public  MyPhone (int memory, String color, String name, boolean mint)
    {
        super( memory,color );
        this.name = name;
        this.mint = mint;
    }

    public String toString()
    {
        return super.toString() +
        String.format("\nModel: %s\nNew? %s" ,name, mint);
    }
}
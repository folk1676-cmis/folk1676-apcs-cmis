public class Person
{
    private String name;
    private String birthDay;
    
    public Person(String name, String birthDay)
    {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String toString()
    {
        return String.format("Name: %s\nBirthday: %s", name, birthDay);
    }

}
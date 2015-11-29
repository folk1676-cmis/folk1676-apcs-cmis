import javax.swing.JOptionPane;
public class Song 
{
    private String artist;
    private String songName;
    private int length;
    private int year;
    String username = JOptionPane.showInputDialog("Username: ");
    String password = JOptionPane.showInputDialog("Password: ");
    private String min;
    private int seconds;
    
    public Song()
    {
        artist = "James Morrison";
        songName = "Demons";
        length = 197;
    }

    public int getYearReleased()
    {
        return year;
    }

    public void setYearReleased(int year)
    {
        if( password.equals("amnotam1r") && username.equals("Folk"))
        {
            this.year = year;
        }
    }

    public String convert()
    {
        min = (Integer.toString(length/60)) + " minutes " + (Integer.toString(length%60)) + " seconds.";
        return min;
    }

    public String toString()
    {
        String output = new String();
        output = "Artist: " + artist + "\n" + "Title: " + songName;
        return output;
    }
}
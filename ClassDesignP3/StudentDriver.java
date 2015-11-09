import javax.swing.JOptionPane;
public class StudentDriver {
    public static void main (String argvs [] )
    {
        Student senior001 = new Student ();
        Student junior001 = new Student ("Jack", "Smith", 11, 3.50);
        JOptionPane.showMessageDialog(null, "Senior001"+ senior001 +"  Junior001" +junior001, "Junior001 and Senior001", JOptionPane.INFORMATION_MESSAGE ) ;
    }
}
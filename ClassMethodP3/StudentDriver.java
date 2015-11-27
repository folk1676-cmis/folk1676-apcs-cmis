import javax.swing.JOptionPane;
public class StudentDriver {
    public static void main (String argvs [] )
    {
        Student senior001 = new Student ();
        Student junior001 = new Student ("Jack", "Smith",11 , 4.00, 3.70, 3.30, 3.00, 2.70);
        JOptionPane.showMessageDialog(null, "Senior"+ senior001 +"  Junior" +junior001, "Junior001 and Senior001", JOptionPane.INFORMATION_MESSAGE);
    }
}
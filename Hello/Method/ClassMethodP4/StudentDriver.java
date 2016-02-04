import javax.swing.JOptionPane;
public class StudentDriver {
    public static void main (String argvs [] )
    {
        Student junior001 = new Student ("Min", "Cho", 11, 4.00, 3.70, 3.30, 3.00, 2.70);
        Student senior001 = new Student ();
        JOptionPane.showMessageDialog(null,junior001, "Junior:",JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null,senior001, "Senior:",JOptionPane.PLAIN_MESSAGE );
    }
}
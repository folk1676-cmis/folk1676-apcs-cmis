import java.util.ArrayList;
public class Driver
{
    public static void main(String[] args)
    {
        UnderGraduate ug1 = new UnderGraduate("Nhat", "Agriculture", 120);
        UnderGraduate ug2 = new UnderGraduate("Yang", "Business", 120);
        Graduate g1 = new Graduate("Rashid", "Computer Science", 45);
        Graduate g2 = new Graduate("Amir", "Petroleum Engineering", 45);
        PostGraduate ps1 = new PostGraduate("Paul", "Physical Fitness", 90);
        PostGraduate ps2 = new PostGraduate("Lee", "Medical", 90);

        ArrayList<Student> allStudents = new ArrayList<Student>();
        allStudents.add(ug1);
        allStudents.add(ug2);
        allStudents.add(g1);
        allStudents.add(g2);
        allStudents.add(ps1);
        allStudents.add(ps2);

        Student[][] studentBody = new Student[3][2];
        int i = 0;
        for(int row = 0; row < studentBody.length; row++)
        {
            for(int col = 0; col < studentBody[0].length; col++)
            {
                studentBody[row][col] = allStudents.get(i);
                i++;
            }
        }
        for(int row = 0; row < studentBody.length; row++)
        {
            for(int col = 0; col < studentBody[0].length; col++)
            {
                System.out.print(studentBody[row][col] + "\t\t" );
            }
            System.out.println();
        }

    }
}
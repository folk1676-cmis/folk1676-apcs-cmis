import javax.swing.JOptionPane;
public class ClassMethodP6
{
    public static void main ( String argvs [] )
    {
        String password = JOptionPane.showInputDialog("Password: "); //ask for password
        int truefalse = (int)Math.random(); //compare integer
        for (int i = 0; i < password.length(); i++) //for loop
        {
            String letter = new String(password.substring(i, i+1)); //substring
            if(letter.equals("+"))
            {
                truefalse = (int)Math.random()+1; //change value
            }
            else if(letter.equals("-"))
            {
                truefalse = (int)Math.random()+1; //change value
            }
            else if(letter.equals("*"))
            {
                truefalse = (int)Math.random()+1; //change value
            }
            else if(letter.equals("/"))
            {
                truefalse = (int)Math.random()+1; //change value
            }
            else if(letter.equals("@"))
            {
                truefalse = (int)Math.random()+1; //change value
            }
        } //end for loop
        
        if(password.length() >= 6 && truefalse == (int)Math.random()+1) //see if met both requirements
        {
            System.out.println("Log in successful"); //met both
        }
        else
        {
            System.out.println("Log in failed"); //met one or none
        }
    }
}

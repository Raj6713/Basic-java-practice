/*This class will test the working of the class of the Account*/
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Account1test 
{
	public static void main(String[] args) throws IOException 
	{
		String nu;
		Double num;
		int choice;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		Account1 ac=new Account1(100);
		ac.displayMessage();
		nu=JOptionPane.showInputDialog("1> For credit\n2>For Debit\n");
        choice=Integer.parseInt(nu);
        switch(choice)
        {
        	case 1:
        	nu=JOptionPane.showInputDialog("Enter credit Amount:");
            num=Double.parseDouble(nu);
            ac.credit(num);
            ac.displayMessage();
        	break;

        	case 2:
        	nu=JOptionPane.showInputDialog("Enter Debit Amount:");
            num=Double.parseDouble(nu);
            ac.debit(num);
            ac.displayMessage();
        	break;

        	default:
        	JOptionPane.showMessageDialog(null,"Wrong option Entered");
        }
       
       JOptionPane.showMessageDialog(null,"End of Program");
	}
}
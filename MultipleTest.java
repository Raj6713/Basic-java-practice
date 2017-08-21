/*This program will set and get results for Multiple test class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class MultipleTest 
{
	public static void main(String[] args) throws IOException 
	{
		Multiple mp=new Multiple();
		String inp;
		inp=JOptionPane.showInputDialog("Enter(num1,num2): ");
		mp.setNum1(Integer.parseInt(inp.split(" ")[0]));
		mp.setNum2(Integer.parseInt(inp.split(" ")[1]));
		mp.displayMessage();
	}

}
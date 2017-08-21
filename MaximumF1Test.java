/*This program will check working of the maximumF class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class MaximumF1Test 
{
	public static void main(String[] args) throws IOException
	{
		MaximumF1 maxi=new MaximumF1();
		String inp;
		inp=JOptionPane.showInputDialog("Enter (num1,num2,num3): ");
		maxi.setNum1(Integer.parseInt(inp.split(" ")[0]));
		maxi.setNum2(Integer.parseInt(inp.split(" ")[1]));
		maxi.setNum3(Integer.parseInt(inp.split(" ")[2]));
		maxi.displayMessage();
	}
}
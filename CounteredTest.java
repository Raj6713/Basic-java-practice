/*This will check working of the counter class and show 
output on the screen.*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class CounteredTest 
{
	public static void main(String[] args) throws IOException 
	{
	Countered c1=new Countered();
	c1.displayMessage();
	String input;
	input=JOptionPane.showInputDialog("Enter last value:");
	c1.setUpperLimit(Integer.parseInt(input));
	//c1.calculate();
	c1.displayMessage();
    }
}
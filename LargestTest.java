/*Write test class for largest value*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class LargestTest 
{
	public static void main(String[] args) throws IOException
	{
		String message,input;
		Largest l1=new Largest();
		l1.displayMessage();
        input=JOptionPane.showInputDialog("Enter how many numbers:");
        l1.setSize(Integer.parseInt(input));
        l1.calculate();
        l1.displayMessage();
	}

}
/*This program will show the working of the WhileCounter class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class WhileCounterTest 
{
	public static void main(String[] args) throws IOException 
	{
		WhileCounter counter=new WhileCounter();
		String input;
		input=JOptionPane.showInputDialog("Enter (start,end)");
		counter.setStart(Integer.parseInt(input.split(" ")[0]));
		counter.setEnd(Integer.parseInt(input.split(" ")[1]));
		counter.displayMessage();
	}
}
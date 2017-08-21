/*Write a program which will calculate the sum for the square sum */
import javax.swing.JOptionPane;
import java.io.IOException;
public class SquareSumTest 
{
	public static void main(String[] args) throws IOException 
	{
		SquareSum summer=new SquareSum();
		summer.displayMessage();
		String input;
		input=JOptionPane.showInputDialog("Enter lowerLimit: ");
		summer.setLowerLimit(Integer.parseInt(input));
		input=JOptionPane.showInputDialog("Enter upperLimit: ");
		summer.setUpperLimit(Integer.parseInt(input));
        summer.calculate();
        summer.displayMessage();		
	}
}
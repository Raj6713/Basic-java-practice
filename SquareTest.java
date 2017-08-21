
/*This class will check working of the Square class */
import javax.swing.JOptionPane;
import java.io.IOException;
public class SquareTest 
{
	public static void main(String[] args) throws IOException
	{
		Square s1=new Square();
		String input;
		input=JOptionPane.showInputDialog("Enter size: ");
		s1.setSize(Integer.parseInt(input));
		s1.displayMessage();
	}
}
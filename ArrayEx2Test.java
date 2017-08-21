/*This program will check working of the Array Ex2 class and
show output on the screen.*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ArrayEx2Test 
{
	public static void main(String[] args) throws IOException 
	{
		ArrayEx2 ar=new ArrayEx2();
		String input;
		input=JOptionPane.showInputDialog("Enter (Row,Column): ");
		ar.setRow(Integer.parseInt(input.split(" ")[0]));
		ar.setColumn(Integer.parseInt(input.split(" ")[1]));
        ar.displayMessage();
	}
}
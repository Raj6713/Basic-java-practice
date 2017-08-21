/*This program will check working of the triangle class*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class TriangleTest 
{
	public static void main(String[] args) throws IOException 
	{
		String input;
		Triangle t=new Triangle();
		t.displayMessage();
        input=JOptionPane.showInputDialog("Enter side(space seperated)");
        t.setSide1(Double.parseDouble(input.split(" ")[0]));
        t.setSide2(Double.parseDouble(input.split(" ")[1]));
        t.setSide3(Double.parseDouble(input.split(" ")[2]));
        t.displayMessage();
	}
}
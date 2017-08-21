/*Program will test working of the Infinite loop*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class InfiniteTest 
{
	public static void main(String[] args) throws IOException 
	{
		Infinite in=new Infinite();
		in.calculate();
		in.displayMessage();
	}
}
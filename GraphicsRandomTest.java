/*This program will check working of the given class*/
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.io.IOException;
public class GraphicsRandomTest 
{
	public static void main(String[] args) throws IOException
	{
		GraphicsRandom newDice=new GraphicsRandom();
		String inp;
		inp=JOptionPane.showInputDialog("Enter no. of rolls: ");
		newDice.setRoll(Integer.parseInt(inp));
		newDice.displayMessage();
         int k=Integer.parseInt(inp)
		JFrame application=new JFrame();
		application.add(newDice);
		application.setVisible(true);
		application.setSize(,);
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
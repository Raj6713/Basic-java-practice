/*This class will test and se parameters for Hypotonuse*/
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.IOException;
public class Hypotonuse1Test 
{
	public static void main(String[] args) throws IOException 
	{
		Hypotonuse1 hp=new Hypotonuse1();
		String inp;
		inp=JOptionPane.showInputDialog("Enter (Base, Height): ");
		hp.setBase(Double.parseDouble(inp.split(" ")[0]));
		hp.setHeigh(Double.parseDouble(inp.split(" ")[1]));
		hp.displayMessage();
        JFrame app=new JFrame();
        app.add(hp);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(500,500);
	}
}
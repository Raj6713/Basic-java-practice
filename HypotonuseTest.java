/*This class will show the hypotonuse working*/
import javax.swing.JFrame;
import java.io.IOException;
import javax.swing.JOptionPane;
public class HypotonuseTest 
{
	public static void main(String[] args) throws IOException
	{
		Hypotonuse hp=new Hypotonuse();
		String inp;
		int p,q;
		inp=JOptionPane.showInputDialog("Enter (Base,Height): ");
		hp.setBase(Double.parseDouble(inp.split(" ")[0]));
		hp.setHeight(Double.parseDouble(inp.split(" ")[1]));
		hp.displayMessage();
        p=(int)Double.parseDouble(inp.split(" ")[0]);
        q=(int)Double.parseDouble(inp.split(" ")[1]);
		JFrame app=new JFrame();
		app.add(hp);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(p+50,q+50);
		app.setVisible(true);
	}
}
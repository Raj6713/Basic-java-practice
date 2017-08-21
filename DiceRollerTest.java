/*This will test and will show values*/
import java.io.IOException;
import javax.swing.JFrame;
public class DiceRollerTest 
{
	public static void main(String[] args) throws IOException 
	{
		DiceRoller dc=new DiceRoller();
		dc.rollDice();
		dc.displayMessage();
		JFrame app=new JFrame();
		app.add(dc);
		app.setSize(600,600);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
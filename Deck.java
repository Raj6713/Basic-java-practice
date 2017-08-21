/*This class will show which card is produced for the time being*/
import javax.swing.JOptionPane;
public class Deck
{
	private String deck,face,message;
	public Deck(String s1,String s2)
	{
		deck=s1;
		face=s2;
	}

	public String to String()
	{
		return deck+" of "+face;
	}
}
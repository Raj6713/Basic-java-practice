/*This program will show the working of the random library of the java*/
import javax.swing.JOptionPane;
import java.util.Random;
public class RandomN 
{
	private String message;
	private int diceFace,rolls;
	public RandomN()
	{
		diceFace=6;
	}
	public void setDiceFace(int n){diceFace=n;}
	private int getDiceFace(){return diceFace;}
    public void setRolls(int n){rolls=n;}
    private int getRolls(){return rolls;}
	private void calculation()
	{
		Random r=new Random(); 
       message="Dice rolling with faces:"+Integer.toString(getDiceFace())+"\n";
       for(int i=1;i<=getRolls();i++)
       {
       	message+=Integer.toString(1+r.nextInt(getDiceFace()))+" ";
       	if(i%6==0)
       		message+="\n";
       }
	}

	public void displayMessage()
	{
		calculation();
		JOptionPane.showMessageDialog(null,message);
	}
}
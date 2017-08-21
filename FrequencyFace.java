/*Write a program which will roll a dice given time and find frequency
of each face*/
import javax.swing.JOptionPane;
import java.util.Random;
public class FrequencyFace 
{
	private final int SIZE=6;
	private String message;
	private int freq[],rolls;
	public FrequencyFace()
	{
		message="";
		rolls=0;
		freq=new int[SIZE];
	}

	public void setRoll(int p){rolls=p;}
	private int getRoll(){return rolls;}
	private void rollDice()
	{
		Random dice=new Random();
       for(int i=0;i<getRoll();i++)
      {
          ++freq[dice.nextInt(6)];
      }
      message="Total rolls: "+Integer.toString(getRoll())+"\n";
      for(int i=0;i<SIZE;i++)
      {
          message+=Integer.toString(i+1)+" "+Integer.toString(freq[i])+"\n";
      }
	}

	public void displayMessage()
	{
		rollDice();
		JOptionPane.showMessageDialog(null,message);
	}
}
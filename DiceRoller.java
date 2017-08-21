/*This program will roll dce a specified time and will print the corre
sponding level on scheme.*/
import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;
public class DiceRoller extends JPanel
{   
	private String message;
    private int sumOfDice[],dice1,dice2,sum;
    public DiceRoller()
    {
    	sumOfDice=new int[13];
    	
    }

    public void rollDice()
    {
    	Random dices=new Random();
    	for(int i=0;i<36000;i++)
    	{
          dice1=1+dices.nextInt(6);
          dice2=1+dices.nextInt(6);
          sum=dice1+dice2;
          ++sumOfDice[sum];
        }
    }

    public void displayMessage()
    {
    	message="The corrseponding frequencies of Dice sum:\n";
    	for(int i=2;i<13;i++)
    	{
    		message+=Integer.toString(i)+" : "+Integer.toString(sumOfDice[i])+"\n";
    	}
    	JOptionPane.showMessageDialog(null,message);
    }
   public void paintComponent(Graphics g)
   {
     super.paintComponent(g);
     g.drawLine(50,500,550,500);
     g.drawLine(50,500,50,50);

     for(int i=2;i<13;i++)
     {
     	sumOfDice[i]=sumOfDice[i]/15;
     	g.drawLine(50+i*20,500,50+i*20,500-(int)sumOfDice[i]);
     }
   }
    
}
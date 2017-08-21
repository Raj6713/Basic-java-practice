/*This program will create a class and flip a 6 faced dice and obtain 
frequency.*/
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.Random;
public class GraphicsRandom extends JPanel
{
    private	String message;
    private int count1,count2,count3,count4,count5,count6,rolls;
    public GraphicsRandom()
    {
    	count1=count2=count3=count4=count5=count6=rolls=0;
    }
    public void setRoll(int n){rolls=n;}
    private int getRoll(){return rolls;}

    private void calculation()
    {
    	   Random r1=new Random();
           message="Rolling dice and frequency:"+Integer.toString(rolls)+"\n";
           for(int i=1;i<=getRoll();i++)
           {
            frequencyCal(1+r1.nextInt(6));
           }
           message+="Frequency of 1: "+Integer.toString(count1)+"\n"+
                     "Frequency of 2: "+Integer.toString(count2)+"\n"+
                     "Frequency of 3: "+Integer.toString(count3)+"\n"+
                     "Frequency of 4: "+Integer.toString(count4)+"\n"+
                     "Frequency of 5: "+Integer.toString(count5)+"\n"+
                     "Frequency of 6: "+Integer.toString(count6)+"\n";
    }

    private void frequencyCal(int num)
    {
       switch(num)
       {
       	case 1:
       	++count1;
       	break;

       	case 2:
       	++count2;
       	break;

       	case 3:
       	++count3;
       	break;

       	case 4:
       	++count4;
       	break;

       	case 5:
       	++count5;
       	break;

       	case 6:
       	++count6;
       	break;
       }
    }
    public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    }
    public void paintComponent(Graphics g)
    {
      super.paintComponent(g);
      {
        int h=getHeight();
        int w=getWidth();
        g.drawLine(100,400,400,400);
        //g.drawLine();
        //g.drawLine();
        //g.drawLine();
        //g.drawLine();
        //g.drawLine();
      }
    }

    



}
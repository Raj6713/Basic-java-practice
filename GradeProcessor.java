/*Write a program which will take grades of a class and then process
it and show various results*/
import javax.swing.JOptionPane;
import java.awt.Graphics;
import javax.swing.JPanel;
public class GradeProcessor extends JPanel 
{
	private String message,inp;
	private int arr[],size;
	public GradeProcessor()
	{
		message="";
		size=0;
	}
	public void setSize(int n){size=n;arr=new int[size];}
	public int getSiz(){return size;}

	public void setArray()
	{

       for(int i=0;i<getSiz();i++)
       {
       	message="Enter grade for Roll no:"+Integer.toString(i+1);
       	inp=JOptionPane.showInputDialog(message);
       	arr[i]=Integer.parseInt(inp);
       }
	}

	private String processing()
	{
		message="Specific details for class: ";
		int min,max,sum=0;
		double avg;
		min=Integer.MAX_VALUE;
		max=Integer.MIN_VALUE;
		for(int i=0;i<getSiz();i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
			sum+=arr[i];
		}
		avg=(double)sum/getSiz();
		message+="\n Maximum grade is: "+Integer.toString(max)+
		         "\nMinimum grade is: "+Integer.toString(min)+
		         "\nAverage of class is: "+Double.toString(avg);
        return message;
	}

	public void displayMessage()
	{
		processing();
      JOptionPane.showMessageDialog(null,processing());
	}

    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	g.drawLine(20,400,400,400);
    	g.drawLine(20,400,20,100);
    	for(int i=0;i<getSiz();i++)
    	{
    		g.drawLine(20+(i+1)*5,400,20+(i+1)*5,400-arr[i]);

    	}
    }
   














}
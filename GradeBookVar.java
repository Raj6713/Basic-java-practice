/*Write a program which will create a class and will allow a student
to take 3 test and will process average of all grades accumulated and
will show the class average using the random class for a class of
40 and show output and barchart using various inbuilt libraries*/
import javax.swing.JPanel;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JOptionPane;
public class GradeBookVar extends JPanel
{
	private String message,courseName;
	private double marks[][],studentAvg[],classAvg;
	private int rows,column,i,j;
	
    public GradeBookVar()
    {
    	classAvg=0.0;
    	rows=column=i=j=0;
    }

	public void setCourseName(String p){courseName=p;}
	private String getCourseName(){return courseName;}
      
	/*For columns and rows:*/
	public void setColRow(String p)
	{
		rows=Integer.parseInt(p.split(" ")[0]);
		column=Integer.parseInt(p.split(" ")[1]);
	}

	private int getRow(){return rows;}
	private int getCol(){return column;}

	private String setArray()
	{
		message="Class Student Marks: \n";
		marks=new double[getRow()][getCol()];
		Random markObtained=new Random();
		for(i=0;i<getRow();i++)
		{    message+=Integer.toString(i)+" : ";
			for(j=0;j<getCol();j++)
			{    
				marks[i][j]=1+markObtained.nextInt(100);
				message+=Double.toString(marks[i][j])+" ";
			}
			message+="\n";
		}
		return message;
	}

	private String calStudentAvg()
	{
		studentAvg=new double[getRow()];
		message="Class Student Average Marks:\n";
         for(i=0;i<getRow();i++)
         {
     	   studentAvg[i]=0.0;
     	    for(int j=0;j<getCol();j++)
     		   studentAvg[i]+=marks[i][j];
     	   studentAvg[i]=studentAvg[i]/getCol();
     	   message+=Integer.toString(i)+":"+Double.toString(studentAvg[i])+"\n";
        }

        return message;
	}

    private String calClassAvg()
    {
    	classAvg=0.0;
    	for(i=0;i<getRow();i++)
    		classAvg+=studentAvg[i];
    	classAvg=classAvg/getRow();
    	message="Overall class Average is :"+Double.toString(classAvg);
    	return message;
    }
    
    public void displayMessage()
    {
       message="Class Statistics for "+getCourseName();
      JOptionPane.showMessageDialog(null,message);
      JOptionPane.showMessageDialog(null,setArray());
      JOptionPane.showMessageDialog(null,calStudentAvg());
      JOptionPane.showMessageDialog(null,calClassAvg());
    }

    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
    	g.drawLine(10,190,180,190);
    	g.drawLine(10,190,10,50);
    	for(int i=0;i<getRow();i++)
    	{
    		g.drawLine(10+2*(i+1),190,10+2*(i+1),190-(int)studentAvg[i]);
    	}
    }    
}
















/*This program will check working of the switch case and show 
output*/
import javax.swing.JOptionPane;
public class Switcher 
{
	private String message;
	private int aCount,bCount,cCount,dCount,pCount,fCount,marks,classSize;
	private Double avg;

	public Switcher()
	{
		aCount=bCount=cCount=dCount=pCount=fCount=marks=classSize=0;
		avg=0.0;
	}

	public void setMarks(int n){marks=n;}
	private int  getMarks(){return marks;}

	public void setSize(int n){classSize=n;}
	public int getSize(){return classSize;}

	private void calculation()
	{
		String inp;
		message="CLass Statistics: "+"\n";
		for(int i=0;i<getSize();i++)
		{
           inp=JOptionPane.showInputDialog("Enter marks:");
           marks=Integer.parseInt(inp);
           gradeAccumulator(marks);
           avg+=(double)marks;
		}
		avg=avg/classSize;
		message+="Average class Performance:"+Double.toString(avg)+
		          "A grades: "+Integer.toString(aCount)+"\n"+
		          "C grades: "+Integer.toString(bCount)+"\n"+
		          "C grades: "+Integer.toString(cCount)+"\n"+
		          "D grades: "+Integer.toString(dCount)+"\n"+
		          "P grades: "+Integer.toString(pCount)+"\n"+
		          "F grades: "+Integer.toString(fCount);
	}

	private void gradeAccumulator(int marks)
	{
         switch(marks/10)
         {
         	case 10:
         	++aCount;
         	break;
         	case 9:
         	++aCount;
         	break;
         	case 8:
         	++bCount;
         	break;
         	case 7:
         	++cCount;
         	break;
         	case 6:
         	++dCount;
         	break;
         	case 5:
         	++pCount;
         	break;
         	case 4:
         	++fCount;
         	break;
         	case 3:
            ++fCount;
         	break;
         	case 2:
         	++fCount;
         	break;
         	case 1:
         	++fCount;
         	break;
         	case 0:
         	++fCount;
         	break;
         }
	}

	public void displayMessage()
    {
    	calculation();
    	JOptionPane.showMessageDialog(null,message);
    }

}
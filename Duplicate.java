/*This program will take number and will display them on screen.*/
import javax.swing.JOptionPane;
public class Duplicate 
{
	private String message,inp;
    private int numberCount[],size;
    public Duplicate()
    {
    	message="";
    	size=0;
    	numberCount=new int[101];
    }
    public void setSize(int n){size=n;}
    private int getSize(){return size;}

    public void setArrayElement()
    {
    	for(int i=0;i<getSize();i++)
    	{
           inp=JOptionPane.showInputDialog("Enter number: ");
           ++numberCount[Integer.parseInt(inp)];
    	}
    }
    public void displayMessage()
    {
    	message="Number who occured only once: \n";
    	for(int i=0;i<size;i++)
    	{
           if(numberCount[i]==1)
           	message+=Integer.toString(i)+" : ";
           	message+=Integer.toString(numberCount[i])+"\n";
    	}
       JOptionPane.showMessageDialog(null,message);
   }
}
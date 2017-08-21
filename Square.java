/*This program will print a square boardusing asterisk of the size given
by the user in JOptionPane;*/
import javax.swing.JOptionPane;
public class Square 
{
	private String message;
    private int size;
    public Square()
    {
    	size=0;
    }

    public void setSize(int n){size=n; formSquare();}
    private int getSize(){return size;}

    private void formSquare()
    {
      message="Square of size: "+Integer.toString(size)+"\n\n";
      if(size>0)
      {
             int i,j;
             
             for(i=0;i<getSize();i++)
             {
             	for(j=0;j<getSize();j++)
             	{
                 message+="*";
             	}
             	message+="\n";
             }
      }
      else
      	message+="negative size square is not possible";
    }

    public void displayMessage()
    {
       JOptionPane.showMessageDialog(null,message);
    }
}
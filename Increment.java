/*Write a program which will increment a number or decrement and 
show the result*/
import javax.swing.JOptionPane;
public class Increment 
{
	String message;
	private int num,val;
	public Increment(){}

	public void setNum(int n){num=n;}
	public int getNum(){return num;}

    public void postincrement()
    {
    	message="";
    	message+="Number: "+Integer.toString(num)+"\n";
    	val=num++;
    	message+="After postIncrement: "+Integer.toString(val);
    }
    public void preincrement()
    {
    	message="";
        message+="Number: "+Integer.toString(num)+"\n";
    	val=++num;
    	message+="After preIncrement: "+Integer.toString(val);
    }
    public void displayMessage()
    {
      JOptionPane.showMessageDialog(null,message);
    }
}
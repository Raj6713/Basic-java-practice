/*Write a program which will calculate factorial of a number*/
import javax.swing.JOptionPane;
public class Factorial 
{
	private String message;
	private int num;
	private long fact;

	public Factorial()
	{
		message="";
		fact=1;
	}
   
    public void setNum(int n){num=n;}
    public int getNum(){return num;}

    private void calculate()
    {
    	message="Number: "+Integer.toString(num);
    	while(num>0)
    	{
    		fact=fact*num;
    		num--;
    	}
    	message+="\nFactorial: "+Long.toString(fact);
    }

    public void displayMessage()
    {
    	calculate();
    	JOptionPane.showMessageDialog(null,message);
    }


}
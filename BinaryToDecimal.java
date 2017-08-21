/*This program will convert a binary String into its decimal 
equivalent and will show the result on screen.*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class BinaryToDecimal 
{
	private String message,str;
	private int total;
	public BinaryToDecimal()
	{
		total=0;
		str="";
	}
	public void setStr(String n){str=n; btd();}
	private String getStr(){return str;}
    private void btd()
    {
         message="Binary Number: "+str+"\n"+
                 "Decimal equivalent: ";

         for(int i=str.length()-1;i>=0;i--)
         {
         	total+=(Integer.parseInt()*((int)Math.pow(2,i));
         }

    }

    public void displayMessage()
    {
    	JOptionPane.showMessageDialog(null,message);
    }



}
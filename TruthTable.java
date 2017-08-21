/*Write a program which will show working of the truth table*/
import javax.swing.JOptionPane;
public class TruthTable 
{
	private String message;
    private boolean int1,int2;
    public TruthTable()
    {
    	int1=int2=false;
    }

    public void setInt1(String s1)
    {
    	if(s1.equals("true") || s1.equals("True"))
    		int1=true;
    	else if(s1.equals("false") || s1.equals("False"))
    		int1=false;
    }

    public void setInt2(String s1)
    {
    	if(s1.equals("true") || s1.equals("True"))
    		int2=true;
    	else if(s1.equals("false") || s1.equals("False"))
    		int2=false;
    }

    public void calculation()
    {
    	message="OR NOT and Negation operator: \n";
    	message+=Boolean.toString(int1)+" || "+Boolean.toString(int2)+" = "+
    	         Boolean.toString(int1 ||int2)+"\n"+
    	         Boolean.toString(int1)+" && "+Boolean.toString(int2)+" = "+
    	         Boolean.toString(int1 &&int2)+"\n"+
    	         Boolean.toString(int1)+" Negation "+Boolean.toString(!int1)+"\n"+
    	         Boolean.toString(int2)+" Negation "+Boolean.toString(!int2);
    }

    public void displayMessage()
    {
     calculation();
     JOptionPane.showMessageDialog(null,message);
    }
}
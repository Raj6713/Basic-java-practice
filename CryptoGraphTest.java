/*This class will check working of the CryptoGraph class and
show working of the following*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class CryptoGraphTest 
{
	/*public static void encryption()
	{
     	String input;
     	boolean proc=false;
     	do{
     	    input=JOptionPane.showInputDialog("Enter four digit number: ");
     	    if(input.length()==4)
     		c1.setFourDigit(input);
     	     else
     		{
     			input=JOptionPane.showInputDialog("Want to try again (y/n):");
     	        if(input.equals('y')|| input.equals('Y'))
                proc=true;
             }    
        }while(proc);
	}*/


	public static void main(String[] args) throws IOException 
	{
		CryptoGraph c1=new CryptoGraph();
		String input;
		boolean proceed=false;
		do {
		     input=JOptionPane.showInputDialog("1> Encryption 2>Decryption");
		     switch(Integer.parseInt(input))
		    {
			case 1:
			 String inp;
     	     boolean proc=false;
     	     do{
     	        inp=JOptionPane.showInputDialog("Enter four digit number: ");
     	        if(inp.length()==4)
     		    c1.setFourDigit(input);
     	        else
     		    {
     		     	inp=JOptionPane.showInputDialog("Want to try again (y/n):");
     	            if(inp.equals('y')|| inp.equals('Y'))
                    proc=true;
                }    
              }while(proc);
			break;

			//case 2:
			//break;

			default:
			JOptionPane.showMessageDialog(null,"No function allotted");
		    }
		   input=JOptionPane.showInputDialog("Do you want to proceed(y/n)");
		   if(input.equals('y') ||input.equals('Y'))
		       proceed=true;
		    else
		       proceed=false;   
		}while(proceed);
     

	}
}
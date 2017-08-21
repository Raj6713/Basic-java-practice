/*This program will take a four digit number and than will transform
the following into another number*/
import javax.swing.JOptionPane;
public class CryptoGraph 
{
	private String message,fourDigit;

	public CryptoGraph()
	{
		message="";
		fourDigit="0000";
	}

	public void setFourDigit(String s1){fourDigit=s1;}
	public String getFourDigit(){return fourDigit;}

	private void encrypt()
	{
		int k;
		char ch;
		message+="Original Message: "+getFourDigit();
		for(int i=0;i<getFourDigit.length();i++)
		{
            ch=getFourDigit().charAt(i);
            k=Integer.parseInt(ch);
		}
        

        }
  
	}

	public void displayMessage()
	{
		encrypt();

        JOptionPane.showMessageDialog(null,message);
	}

}

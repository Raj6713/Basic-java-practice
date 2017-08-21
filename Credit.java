/*Write a program which will show a credit test system for a customer
and show it on the screen and also review it*/
import javax.swing.JOptionPane;
public class Credit 
{
	private String message,name,accNo;
	private double openingBalance,totalItemCharged,creditLimit,creditApplied,newBal;
	public Credit()
	{
      openingBalance=0.0;
      totalItemCharged=0.0;
      creditLimit=0.0;
      creditApplied=0.0;
	}

	public void setName(String n1){name=n1;}
	public void setAccNo(String n1){accNo=n1;}
	public void setOpeningBalance(double bal){openingBalance=bal;}
	public void setTotalItemCharged(double it){totalItemCharged=it;}
	public void setCreditLimit(double p){creditLimit=p;}
	public void setCreditApplied(double p){creditApplied=p;}

	private String getName(){return name;}
	private String getAccNo(){return accNo;}
	private double getOpeningBalance(){return openingBalance;}
	private double getTotalItemCharged(){return totalItemCharged;}
	private double getCreditLimit(){return creditLimit;}
	private double getCreditApplied(){return creditApplied;}

	public void calculation()
	{
		message="";
		message+="Name: "+name+"\n"+
		         "Account number: "+accNo+"\n"+
		         "Opening balance: "+Double.toString(getOpeningBalance())+"\n"+
		         "Total item charged: "+Double.toString(getTotalItemCharged())+"\n"+
		         "credit Limit: "+Double.toString(getCreditLimit())+"\n"+
		         "creditApplied: "+Double.toString(getCreditApplied())+"\n";
        newBal=openingBalance+totalItemCharged-creditApplied;
        if(newBal>creditLimit)
        	message+="Credit Limit exceeded";
        else
        	message+="Credit Limit not exceeded.";
	}

    public void displayMessage()
    {
    	JOptionPane.showMessageDialog(null,message);
    }
}





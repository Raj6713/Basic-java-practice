
/*Write a program which will show the working of the sales person
program and will show the output on the screen.*/
import javax.swing.JOptionPane;
public class Salesperson 
{
	private String message,name,input;
    private double sales,totalPay;
    private int totalCount;

    public Salesperson()
    {
    	sales=0.0;
    	totalCount=0;
    }

    public void setName(String n){name=n;}
    public void setTotalCount(int n){totalCount=n;}

    public String getName(){return name;}
    public int getTotalCount(){return totalCount;}

    public void calculate()
    {
    	message="SalesPerson name: "+name+"\n";
    	for(int i=0;i<getTotalCount();i++)
    	{
          input=JOptionPane.showInputDialog("Enter sales: ");
          message+="Sales price: "+input+"\n";
          sales+=Double.parseDouble(input);
    	}
       totalPay=200.00+0.09*sales;
       message+="Total pay is: $"+Double.toString(totalPay);
    }

    public void displayMessage()
    {
    	JOptionPane.showMessageDialog(null,message);
    }
}
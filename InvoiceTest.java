/*Write a program which will show the working of the invoice class*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
public class InvoiceTest 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		Invoice invoice=new Invoice("","",0,0.0);
		invoice.displayMessage();
		String pName,pDesc,nu;
		int quant;
        double price;
        pName=JOptionPane.showInputDialog("Enter part number: ");
        pDesc=JOptionPane.showInputDialog("Enter part Description: ");
        nu=JOptionPane.showInputDialog("Enter qunatity ");
        quant=Integer.parseInt(nu);
        nu=JOptionPane.showInputDialog("Enter price ");
        price=Double.parseDouble(nu);
        invoice.setPartNumber(pName);
        invoice.setPartDesc(pDesc);
        invoice.setQuantity(quant);
        invoice.setPrice(price);
        invoice.displayMessage();
        JOptionPane.showMessageDialog(null,"End of program.");
	}

}
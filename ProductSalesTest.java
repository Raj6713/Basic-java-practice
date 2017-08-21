/*Write a program which will set case for Product Sales*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class ProductSalesTest 
{
	public static void main(String[] args) throws IOException 
	{
		ProductSales ps=new ProductSales();
		ps.setSalesMatrix();
        ps.displayMessage();
	} 
}
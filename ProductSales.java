/*This program will take procuct and their sales and will summarzie them*/
import javax.swing.JOptionPane; 
public class ProductSales 
{
	private String message,input;
	private double salesMatrix[][],productPrice[];
	private int i,j,salesMan,product;
	public ProductSales() 
	{
		message="";
		input="";
		salesMan=5;
		product=6;
		productPrice=new double[6];
		double[] productPrice={3.0,4.0,2.0,5.0,6.77,5.66};
		salesMatrix=new double[salesMan][product];
	}

	public void setSalesMatrix()
	{
		for(i=0;i<salesMan;i++)
		{
			message="Enter quantity sold for products "+Integer.toString(product)+"\n";
			input=JOptionPane.showInputDialog(message);
            for(j=0;j<product;j++)
            	salesMatrix[i][j]=Integer.parseInt(input.split(" ")[i]);
		}
	}

	private void setMessage()
	{
		double total1,total2;
	    for(i=0;i<salesMan;i++)
	    {    
	    	total1=0;
	    	for(j=0;j<product;j++)
	    	{
	    		message+="("+Double.toString(salesMatrix[i][j])+","+Double.toString(productPrice[i])+") ";
	            total1+=salesMatrix[i][j]*productPrice[i];   		
	    	}
	    	message+=Double.toString(total1)+"\n";
	    }

	    for(int i=0;i<product;i++)
	    {   total2=0;
	        for(int j=0;j<salesMan;j++)
	        total2+=salesMatrix[j][i]*productPrice[i];
	        message+=Double.toString(total2);	
	    }
	}

	public void displayMessage()
	{
		setMessage();
		JOptionPane.showInputDialog(message);
	}
}
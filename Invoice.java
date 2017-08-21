/*Create a class called Invoice that a hardware store might use to represent an invoice for an
item sold at the store. An Invoice should include four pieces of information as instance variables—
a part number (type String), a part description (type String), a quantity of the item being purchased
(type int) and a price per item (double). Your class should have a constructor that initializes
the four instance variables. Provide a set and a get method for each instance variable. In addition,
provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the
126 Chapter 3 Introduction to Classes and Objects
quantity by the price per item), then returns the amount as a double value. If the quantity is not
positive, it should be set to 0. If the price per item is not positive, it should be set to 0.0. Write a
test application named InvoiceTest that demonstrates class Invoice’s capabilities.*/
import javax.swing.JOptionPane;
public class Invoice 
{
	private String partNumber,partDesc;
	private int quantity;
    private double price;

    public Invoice(String partN,String partD,int quant,double value)
    {
    	partNumber=partN;
    	partDesc=partD;
    	quantity=quant;
    	price=value;
    }

    public void setPartNumber(String value)
    {
    	partNumber=value;
    }

    public void setPartDesc(String value)
    {
    	partDesc=value;
    }

    public void setQuantity(int value)
    {
    	quantity=value;
    }
    public void setPrice(double value)
    {
    	price=value;
    }    

    private String getPartNumber(){return partNumber;} 
    private String getPartDesc(){return partDesc;}
    private int getQuantity(){return quantity;}
    private double getPrice(){return price;}

    public void displayMessage()
    {
    	double totalPrice;
    	totalPrice=getQuantity()*getPrice();
    	String message;
    	message="Part Number: "+getPartNumber()+"\n"+"Part Description: "+getPartDesc()+
    	         "\nQuantity: "+Integer.toString(getQuantity())+"\nPrice: "+Double.toString(getPrice())+
    	         "\nTotal Cost: "+Double.toString(totalPrice);
     JOptionPane.showMessageDialog(null,message);
    } 
    
}

























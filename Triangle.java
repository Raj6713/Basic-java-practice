/*Write a program which will create a program to check whatever three
input size are determining the triangle*/
import javax.swing.JOptionPane;
public class Triangle 
{
	private String message;
	private double side1,side2,side3;

	public Triangle() 
	{
        side1=0.0;
        side2=0.0;
        side3=0.0;
	}

	public void setSide1(double n1){side1=n1;}
	public void setSide2(double n1){side2=n1;}
	public void setSide3(double n1){side3=n1;}

	private double getSide1(){return side1;}
	private double getSide2(){return side2;}
	private double getSide3(){return side3;}

	private void calculate()
	{
		message="";
     boolean t1,t2,t3;
     t1=t2=t3=false;
     t1=(side1)<(side2+side3)?true:false;
     t1=(side2)<(side3+side1)?true:false;
     t1=(side3)<(side1+side2)?true:false;
     if(t1 && t2 && t3)
     	{
     		message+="Triangle is possible with sides"+
                 Double.toString(getSide1())+" "+
                 Double.toString(getSide2())+" "+
                 Double.toString(getSide3())+" "+"\n";
        }
        else
        {
        	message+="Triangle is not possible with sides"+
                 Double.toString(getSide1())+" "+
                 Double.toString(getSide2())+" "+
                 Double.toString(getSide3())+" "+"\n";

        }
	} 

	public void displayMessage()
	{
		calculate();
		JOptionPane.showMessageDialog(null,message);
	}

}
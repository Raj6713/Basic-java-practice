/*This program will create a java program which will take and work on 
user specified data*/
import javax.swing.JOptionPane;
import java.lang.Math;
public class MyMathLibrary
{
	private String message;
	private double base,height,num,num1,num2,num3;
	public MyMathLibrary()
	{
		message="";
		base=height=num=num1=num2=num3=0.0;
	}
    
    public void setBase(double n){base=n;}
    public void setHeigh(double n){height=n;}
    public void setNum(double n){num=n;}
    public void setNum1(double n){num1=n;}
    public void setNum2(double n){num2=n;}
    public void setNum3(double n){num3=n;}

    private double getBase(){return base;}
    private double getHeigh(){return height;}
    private double getNum(){return num;}
    private double getNum1(){return num1;}
    private double getNum2(){return num2;}
    private double getNum3(){return num3;}
    
	public void hypotonuse()
	{
		message="Hypotonuse when:"+Double.toString(getBase())+" "+
		         Double.toString(getHeigh())+"\n";
		message+=Double.toString(Math.sqrt(Math.pow(getBase(),2)+Math.pow(getHeigh(),2)));
	}
	public void intToFloat()
	{
		message="Double: "+Double.toString(getNum())+"\n";
		message+="Integer: "+Integer.toString(((int)getNum()));
	}
	public void instruction()
	{
		message="This one does nothing"+"\n";
	}
	public void smallest()
	{
		message="Minimum among: "+Double.toString(getNum1())+" "+
                 Double.toString(getNum2())+" "+
                 Double.toString(getNum3())+"\n";
        message+=Double.toString(Math.min(getNum1(),Math.min(getNum2(), getNum3())));
	}
	public void displayMessage()
	{
		JOptionPane.showMessageDialog(null,message);
	}
}
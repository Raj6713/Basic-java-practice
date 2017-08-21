/*This program will check workng of the math library and show output*/
import javax.swing.JOptionPane;
import java.io.IOException;
public class MyMathLibraryTest 
{
	public static void main(String[] args) throws IOException 
	{
		MyMathLibrary ml=new MyMathLibrary();
		String inp;
		inp="Enter 1>Hypotonuse\n2>int to float\n3>instruction\n4>smallest";
		inp=JOptionPane.showInputDialog(inp);
		switch(Integer.parseInt(inp))
		{
			case 1:
			inp=JOptionPane.showInputDialog("Enter (Base,Height)");
			ml.setBase(Double.parseDouble(inp.split(" ")[0]));
			ml.setHeigh(Double.parseDouble(inp.split(" ")[1]));
			ml.hypotonuse();
			break;

			case 2:
			inp=JOptionPane.showInputDialog("Enter a double");
			ml.setNum(Double.parseDouble(inp));
			ml.intToFloat();
			break;

			case 3:
			ml.instruction();
			break;

			case 4:
			inp=JOptionPane.showInputDialog("Enter (num1,num2,num3)");
			ml.setNum1(Double.parseDouble(inp.split(" ")[0]));
			ml.setNum2(Double.parseDouble(inp.split(" ")[1]));
			ml.setNum3(Double.parseDouble(inp.split(" ")[2]));
			ml.smallest();
			break;

			default:
			JOptionPane.showMessageDialog(null,"Wrong input");
		}
		ml.displayMessage();
	}
}
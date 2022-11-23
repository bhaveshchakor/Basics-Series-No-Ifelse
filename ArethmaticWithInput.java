package week_2_ControlStatements_Loops;
import java.util.*;//By using * we can acess all the class present in the util. By using scanner we can acess only scanner.
public class ArethmaticWithInput{
	public static void main(String[] args){
		myCode();
	}
	public static void myCode(){
		Scanner sc	= new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1 =sc.nextInt();
		System.out.print("Enter 2nd number: ");
		double num2 =sc.nextInt();
		System.out.print("Enter 1-addition 2-Subtraction 3-Multiplication 4-division: ");
		int operation=sc.nextInt();
		
		if (operation==1)
		{
			System.out.println("Addition is "+(num1+num2));
		}
		else if (operation==2)
		{
			System.out.println("Subtraction is "+(num1-num2));
		}
		else if(operation==3)
		{
			System.out.println("Multiplication is "+(num1*num2));
		}
		else if(operation==4)
		{
			System.out.println("Division is "+(num1/num2));
		}
		else{
			System.out.println("Not valid input");
		}
		
		
	}
}
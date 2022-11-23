package week_2_ControlStatements_Loops;
import java.util.Scanner;
public class ifstatement{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st no: ");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd no: ");
		int num2=sc.nextInt();
		Mycode(num1,num2);
			
	}	
	public static void Mycode(int num1, int num2){
		if (num1 > num2){
			
			System.out.println(num1+" is grater than "+num2);
		}
		
		
	}
	
}
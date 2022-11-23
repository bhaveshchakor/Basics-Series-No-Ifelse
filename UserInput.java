package week_2_ControlStatements_Loops;
import java.util.*;
public class UserInput{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int num1=sc.nextInt();
			System.out.print("Enter 2nd number: ");
		int num2=sc.nextInt();
		int result=num1+num2;
		System.out.println("The sum is "+result);
	}
}
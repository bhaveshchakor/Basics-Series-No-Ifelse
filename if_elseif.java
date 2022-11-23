package week_2_ControlStatements_Loops;
import java.util.*;
public class if_elseif{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number: ");
		
		int num = sc.nextInt();
		Mycode(num);
	}
	public static void Mycode(int num){
		if (num > 0){
			System.out.println(num+" is positive number");
		}
		else if (num < 0){
			System.out.println(num+" is negative number");
		}
		else{
			System.out.println(num+" is zero");
		}
	}
}
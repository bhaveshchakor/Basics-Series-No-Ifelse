package week_2_ControlStatements_Loops;
import java.util.*;
public class switchCase{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your choice: ");
		int day=sc.nextInt();
		switch(day)
		{
			case 1: System.out.println("Monday");
					break;
			case 2: System.out.println("Tuesday");
					break;
			case 3: System.out.println("Wednesday");
					break;
			case 4: System.out.println("Thursday");
					break;
			case 5: System.out.println("Friday");
					break;
			case 6: System.out.println("Satueday");
					break;
			case 7: System.out.println("Sunday");
					break;
			default : System.out.println("Invalid choice");
			
		}
	}
}
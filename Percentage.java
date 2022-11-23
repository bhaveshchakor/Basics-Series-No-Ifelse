package week_2_ControlStatements_Loops;
import java.util.*;
public class Percentage{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter marks of Marathi: ");
		int mar=sc.nextInt();
		System.out.print("Enter marks of English: ");
		int eng=sc.nextInt();
		System.out.print("Enter marks of Maths: ");
		int math=sc.nextInt();
		System.out.print("Enter marks of Chemistry: ");
		int chem=sc.nextInt();
		System.out.print("Enter marks of Physics: ");
		int phy=sc.nextInt();
		
		int sum=mar+eng+math+chem+phy;
		int total=500;
		double perc=sum*100/total;
		System.out.println("Percentage is "+perc+"%");
		
	}
}
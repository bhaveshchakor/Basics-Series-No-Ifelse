package week_2_ControlStatements_Loops;
import java.util.*;
public class TableUsingFor{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no: ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" X "+i+" = "+(num*i));
			
		}
		
	}
}
package week_2_ControlStatements_Loops;
import java.util.*;
public class UpperLowerNoChar{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter character: ");
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z'){
			System.out.println(ch+" is Uppercase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" is Lowercase");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println(ch+" is number");
		}
		else 
		{
			System.out.println(ch+" is a special character");
		}
	}
}
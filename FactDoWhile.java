package week_2_ControlStatements_Loops;
public class FactDoWhile{
	public static void main(String[]args){
		
		int num=5;
		int fact=1;
		int temp=num;
		do
		{
			fact=fact*num;
			num--;
		}
		while(num>0);
		System.out.println("The factorial of "+temp+" is "+fact);
			
	}
}
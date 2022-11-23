package week_2_ControlStatements_Loops;
public class factorial{
	public static void main(String[] args)
	{
		int num=6;
		int fact=1;
		int temp=num;
		
		while(num>0)
		{
			fact=fact*num;
			num--;
		}
		System.out.println("The factorial of "+temp+" is: "+fact);
	}
}
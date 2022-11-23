package week_2_ControlStatements_Loops;
public class NoDigits
{
	public static void main(String[] args)
	{
		int num=46592;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count of digits is: "+count);
	}
}
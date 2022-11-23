package week_2_ControlStatements_Loops;
public class NoDigitDowhile{
	public static void main(String[] args)
	{
		int num=4563;
		int cnt=0;
		
		do
		{
			num=num/10;
			cnt++;
		}
		while(num>0);
		System.out.println("The no of digit is: "+cnt);
		
	}
}
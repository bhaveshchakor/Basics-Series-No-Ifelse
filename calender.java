package week_1;
public class calender
{
	public static void main(String[] args){
		int a =800;
		calculatecalen(a);
	}
	public static void calculatecalen(int a)
	{
		int years = a/365;
		System.out.println("Years: "+years);
		int rem1=a%365;
		int months = rem1/30;
		System.out.println("Months: "+months);
		int rem2 = rem1%30;
		int weeks = rem2/7;
		System.out.println("Weeks:"+weeks);
		int days = rem2%7;
		System.out.println("Days: "+days);
			
		
	}
}
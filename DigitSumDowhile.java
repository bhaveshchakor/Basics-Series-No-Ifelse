package week_2_ControlStatements_Loops;
public class DigitSumDowhile{
	public static void main(String[] args){
		int num=1234;
		int sum=0;
		
		do
		{
			sum=sum+num%10;
			num=num/10;
			
		}while(num>0);
			System.out.println("Sum of digits of number is: "+sum);
	}
}
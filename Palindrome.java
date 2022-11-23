package week_2_ControlStatements_Loops;
public class Palindrome{
	public static void main(String[] args){
		int n=121;
		int temp=n;
		int sum=0;
		int rem=0;
		
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is palindrome");
		}
		else
		System.out.println(temp+" is not a palindrome");
		
	}
}
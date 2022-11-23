package week_2_ControlStatements_Loops;
public class PrimeNum{
	public static void main(String[] args){
		int n=15;
		int cnt=0;
		
		for (int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				cnt++;
				break;
			}
		}
		if (cnt==0)
		{
			System.out.println("Prime Number");
		}
	    else
	    {
		System.out.println("Not a prime number");
		}
		
	}
}
package week_2_ControlStatements_Loops;

public class EvenOdd{
	public static void main(String [] args)
	{
		int num=10;
		Mycode(num);
	}
	public static void Mycode(int num){
		if (num % 2==0){
			System.out.println(num+" is an even number");
		}
		else
		{
			System.out.println(num+" is an odd number");
		}
		
	}
}

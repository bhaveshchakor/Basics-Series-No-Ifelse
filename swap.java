package week_1;
public class swap
{
	public static void main(String[] args)
	{
		int num1=5;
		int num2=1;
		//before swapping
		System.out.println("Before swapping:");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		//swap
		int temp=num1;
		 num1=num2;
		num2=temp;
		
		//After swapping
		System.out.println("After swapping:");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		
	}
}
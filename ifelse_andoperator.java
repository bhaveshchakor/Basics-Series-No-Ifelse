package week_2_ControlStatements_Loops;

public class ifelse_andoperator
{
	public static void main(String[] args)
	{
		
		int num1=10;
		
		int num2=20;
		
		int num3=30;
		
		Mycode(num1,num2,num3);
	
	}
	public static void Mycode(int num1,int num2,int num3){
		if(num1>num2 && num1>num3){
			System.out.println(num1+" is greater than "+num2+" & "+num3);
		}
		if(num2>num1 && num2>num3){
			System.out.println(num2+" is greater than "+num1+" & "+num3);
		}
		else{
			System.out.println(num3+" is greater than "+num1+" & "+num2);
		}
	}
}
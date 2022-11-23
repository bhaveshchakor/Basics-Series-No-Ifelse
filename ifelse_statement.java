package week_2_ControlStatements_Loops;

public class ifelse_statement{
	public static void main(String [] args){
		
		int num1=20;
		int num2=15;
		Mycode(num1,num2);
			
	}	
	public static void Mycode(int num1, int num2){
		if (num1 < num2){
			
			System.out.println(num1+" is smaller than "+num2);
		}
		else 
		{
			System.out.println(num2+" is smaller than "+num1);
		}
	}
	
}
package week_2_ControlStatements_Loops;
public class NoEndWith7{
	public static void main(String[] args){
		int start=100;
		int end=200;
		for (int i=start;i<=end;i++)
		{
			if(i%10==7)
			{
				System.out.println(i);
			}
		}
	}
}
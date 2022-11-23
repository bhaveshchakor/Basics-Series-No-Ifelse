package week_2_ControlStatements_Loops;
public class evenoddfor{
	public static void main(String[] args)
	{
		int start=100, end=120;
		// start and end are asummed to be included
		
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				System.out.println(i+" Even");
			else
				System.out.println(i+" odd");
		}
		
	}
}
package week_1;
public class triarea
{
	public static void main(String[] args)
	{
		int s = 5;
		calculatearea(s);
	}
	public static void calculatearea(int s)
	{
		double result = Math.sqrt(3);
		double area = result*s*s/4;
		System.out.println("Area is:"+area);
		
	}

}
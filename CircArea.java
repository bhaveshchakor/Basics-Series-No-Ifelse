package week_1;
public class CircArea
{
	public static void main(String[] args)
	{
		int r=5;
		calculatearea(r);
	}
	public static void calculatearea(int r)
	{
		double pi = 3.14;
		//Method 1 to print	
		double area = pi*r*r;
		System.out.println("Area of cicle is:"+area);
		//method 2 to print
		System.out.println("Area of cicle is:"+(pi*r*r));
		
		
	}
}
package week_2_ControlStatements_Loops;
public class TriangleCondition
{
	public static void main(String[] args)
	{
		
		int side1=10;
		int side2=20;
		int side3=10;
		myCode(side1, side2,side3);
	}
	public static void myCode(int side1,int side2,int side3)
	{
		if(side1==side2 && side2==side3 && side1==side3)
		{
			System.out.println("The trianlgle is equilateral");
		}
		else if(side1==side2 || side2==side3 || side1==side3)
		{
			System.out.println("The trianlgle is isoscale");
		}
		else
		{
			System.out.println("The trianlgle is scalen");
		}
	}
}
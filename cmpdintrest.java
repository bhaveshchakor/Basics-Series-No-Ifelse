package week_1;
public class cmpdintrest
{
	public static void main (String[] args)
	{
		int p=1000;
		double r=0.05;
		int n=12;
		int t=5;
		mycode(p,r,n,t);
	}
	public static void mycode(int p, double r, int n, int t)
	{
		//Compond intrest A=p(1+r/n)to power n*t
		double spart=(1+r/n);
		int tpart=n*t;
		double A =p*Math.pow(spart,tpart); //Math.pow is use to calculate raise to the power
		System.out.println("Compound Intrest is:"+A);
	}
}
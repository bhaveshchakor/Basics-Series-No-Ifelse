package week_1;
public class sumavg
{
	public static void main(String[] args)
	{
		int mar=56;
		int eng=65;
		int math=53;
		int subCnt=3;
		mycode(mar,eng,math,subCnt);
	}
	public static void mycode(int mar,int eng, int math, int subCnt)
	{
		int sum =mar+eng+math;
		System.out.println("Total marks:"+sum);
		double avg = sum/subCnt;
		System.out.println("Average marks:"+avg);
	}
}
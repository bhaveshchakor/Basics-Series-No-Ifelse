package week_2_ControlStatements_Loops;
public class FibonacciSeriesNo{
	public static void main(String[] args){
		int firstTerm=0;
		int secondTerm=1;
		int nextTerm=0;
		System.out.print(firstTerm+" "+secondTerm);
		for (int i=0;i<8;i++)
		{
			nextTerm=firstTerm+secondTerm;
			System.out.print(" "+nextTerm);
			
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
		
	}
}
/*
0 1 1 2 3 5 8 13 21 34
*/
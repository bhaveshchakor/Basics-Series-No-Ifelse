package week_2_ControlStatements_Loops;
import java.util.*;
public class SalaryCalculate{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Monthly Salary: ");
		int basicSal=sc.nextInt();
		int hra=0;
		int da=0;
		
		if (basicSal<=10000)
		{
			hra=20;
			da=80;
		}
		else if(basicSal<=20000)
		{
			hra=25;
			da=90;
		}
		else{
			hra=30;
			da=95;
		}
		double calhra=basicSal*hra*1.0/100;
		double calda=basicSal*da*1.0/100;
		double grossSal=basicSal+calda+calhra;
		System.out.println(grossSal);
	}
}
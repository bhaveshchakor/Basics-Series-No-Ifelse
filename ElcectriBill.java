package week_2_ControlStatements_Loops;

public class ElcectriBill{
	public static void main(String[] args)
	{
		int unit=160;
		double bill;
		
		if (unit<=50)
		{
			bill=(unit*0.50);
		}
		else if (unit<=150)
		{
			bill=(50*0.50)+((unit-50)*0.75);
		}
		else if (unit<=250)
		{
			bill=(50*0.50)+(100*0.75)+((unit-150)*1.2);
		}
		else
		{
			bill=(50*0.50)+(100*0.75)+(100*1.2)+((unit-250)*1.5);
		}
		System.out.println("Bill is "+bill);
		double totalBill=bill*1.2; //20%surcharge
		System.out.println("Total bill is "+totalBill);
		
		
	}
}
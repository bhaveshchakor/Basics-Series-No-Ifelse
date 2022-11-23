package week_2_ControlStatements_Loops;
import java.util.*;
public class CompareString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a day: ");
		String sg=sc.nextLine();
		//String mon="Monday";
		
		/*if(sg.equals("Monday")||sg.equals("monday")){
			System.out.println("Working day :(");
		}
		else if(sg.equals("Sunday")||sg.equals("sunday"))
		{System.out.println("Holiday :)");}*/
	
	switch(sg)
	{
		case "monday": System.out.println("Working day :("); 
		break;
		case "tuesday": System.out.println("Working day :("); 
		break;
		case "wednesday": System.out.println("Working day :(");
		break;
		case "thursday": System.out.println("Working day :(");
		break;
		case "friday": System.out.println("Working day :(");
		break;
		case "saturday": System.out.println("Working day :(");
		break;
		case "Sunday": System.out.println("Holiday :)");
		break;
		default:System.out.print("na");
		

	}
	}
}
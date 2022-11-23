package week_2_ControlStatements_Loops;
public class ProfitLoss{
	public static void main(String[] args){
		
		int pp = 1500;
		int sp =1800;
		
		myCode(sp, pp);
		
	}
	public static void myCode(int sp, int pp){
		if (sp>pp){
			System.out.println("Profit of "+(sp-pp));
		}
		else if(pp>sp){
			System.out.println("Loss of "+(pp-sp));
		}
		else{System.out.println("No Profit No Loss");}
	}
}
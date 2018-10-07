package ControlStatements;

public class ForLoopCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forLoopCondition(15);

		String a = "SeleniumAutomation";
		int b = a.length();
		String rev = "";
		
		System.out.println("The length of the string is " + b);
		
		for (int i = b - 1; i >= 0; i --){
			rev = rev + a.charAt(i);
			System.out.println(rev);
						
		}
		System.out.println(rev);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void forLoopCondition (int number){
		
		for (int i = 0; i <= number; i ++){
			System.out.println(i);
			if (i == 8){
				System.out.println("The for loop condition is satisfied at number 8");
				break;
			}
		}
	}
		
		public static void forLoopCondition2 (int number){
			
			for (int i = 20; i >= number; i --){
				System.out.println(i);
			}
		
	}

}

package ControlStatements;

public class WhileCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileCondition(6);

	}
	
	public static void whileCondition (int number){
		int i = 1;
		
		while (i <= number){
			System.out.println("I am printing i value " + i);
			i ++;
		}
	}

}

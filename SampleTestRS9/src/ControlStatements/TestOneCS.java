package ControlStatements;

public class TestOneCS {

	public static void main(String[] args) {
		
		switchCase("Tuesday");
	}
	
	public static void switchCase (String day){
		
		switch (day){
		
		case "Monday" : 
			System.out.println("This is Monday");
			break;
		case "Tuesday":
			System.out.println("This is Tuesday");
			break;
		case "Wednesday":
			System.out.println("This is Wednesday");
			break;
		case "Thursday":
			System.out.println("This is Thursday");
			break;
		case "Friday" :
			System.out.println("This is Friday");
			break;
		case "Saturday" :
			System.out.println("This is Saturday");
			break;
		case "Sunday" :
			System.out.println("This is Sunday");
			break;
						
		default :
			System.out.println("Invalid day!");
			
		}
			
	}
}

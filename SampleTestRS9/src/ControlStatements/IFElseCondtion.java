package ControlStatements;

public class IFElseCondtion {

	public static void main(String[] args) {
		
		ifelsemethod(18);

	}
	
	public static void ifelsemethod (int age){
		   
		    if(age>18){  
		        System.out.print("Age is greater than 18");  
		    } 
		    else if (age < 18) {
		    	System.out.println("Age is lesser than 18");
		    }
		    else if (age == 18) {
		    	System.out.println("Age is equal to 18");
		    }
		    else {
		    	System.out.println("Age is invalid");
		    }
	}

}

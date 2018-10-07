package TestOne;

public class TestTwo {
	
	public static void main(String[] args) {  
		
		//test1();
		
		test2();
		test3();
	    
	}
	
	
	
	public static void test1 (){
		int age=23;  
	    if(age>18){  
	        System.out.println("Age is greater than 18");  
	    }  
	}
	
	public static void test2 (){
		int age=15;  
	    if(age>18){  
	        System.out.println("Age is greater than 18");  
	    } 
	    else {
	    	System.out.println("Age is lesser than 18");
	    }
	}
	
	public static void test3(){
		String a = "Tsting";
		if (a.equalsIgnoreCase("testing")){
			System.out.println("The given string is same");
		}
	}
	

}

package StaticMethods;

public class StaticClass {
	
	public static void main (String args[]){
		
		sum ();
		sub();
		
	}

	public static void sum (){
		int a = 10;
		int b = 20;
		int c = b - a;
		System.out.println("This is a sum method result - " + c);
	}
	
	public static void sub () {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("This is a sub method result - " + c);
	}

	public static void play () {
		System.out.println("This is a play method");
	}



}

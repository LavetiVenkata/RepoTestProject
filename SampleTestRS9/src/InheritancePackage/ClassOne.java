package InheritancePackage;

public class ClassOne {

	public static void sum (int a, int b, int c){
		int d = a + b + c;
		System.out.println("This is class one sum method result " + d);
	}
	
	//non void method
	public static int sub (int a, int b){
		int c = a - b;
		System.out.println("This is class one sub method result - " + c);
		return c;
	}
	
	//non static method
	public void play (String a){
		System.out.println("This is class one play method result - " + a);
	}

}

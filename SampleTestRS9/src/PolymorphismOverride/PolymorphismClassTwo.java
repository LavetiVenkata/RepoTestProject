package PolymorphismOverride;

public class PolymorphismClassTwo extends PolymorphismClassOne {
	
	public static void sum (int a, int b){
		int d = a + b;
		System.out.println("This is class two sum method result " + d);
	}
	
	//non void method
	public static int sub (int a, int b){
		int c = a - b;
		System.out.println("This is class two sub method result - " + c);
		return c;
	}
	
	//non static method
	public void play (String a){
		System.out.println("This is class two play method result - " + a);
	}
	
	

}

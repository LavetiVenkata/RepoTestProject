package InheritancePackage;

import ControlStatements.ForLoopCondition;

public class ClassTwo extends ClassOne{

	public static void main(String[] args) {
		
		ForLoopCondition ab = new ForLoopCondition();
		ab.forLoopCondition2(67);
		
		ClassTwo aa = new ClassTwo();
		
		aa.temps();
		game(789);
		String s = add("Software", "Testing");
		System.out.println("Thisi s class two method " + s);
		
		//class one methods
		sum(89, 66, 33);
		sub(899, 554);
		aa.play("Training");
		
		aa.temp1();
		aa.temp2();
		aa.temp3();
		aa.temps();
		

	}
	
	public static void game (int a){
		System.out.println("This is class two method value - " + a);
	}

	public static String add (String a, String b){
		String x = a + " " + b;
		return x;
	}
	
	public void temps (){
		System.out.println("This is a class two method value");
	}
	
	public int temp1 (){
		System.out.println("This is a class two method value");
		return 9;
	}
	
	public void temp2 (){
		System.out.println("This is a class two method value");
	}
	public void temp3 (){
		System.out.println("This is a class two method value");
	}
	
}

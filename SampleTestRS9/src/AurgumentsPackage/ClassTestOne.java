package AurgumentsPackage;

public class ClassTestOne {
	
	public static void main (String args[]){
		//oneMethod();

		twoMethod(78, 90);
		twoMethod(14, 90);
		twoMethod(8, 9);
		twoMethod(66, 88);
		
		threeMethod("THreeee");
		threeMethod("Software");
		threeMethod("Testing");
	}
	
	public static void oneMethod (){
		int a = 10;
		int b = 20;
		int c = b - a;
		System.out.println("Print c value - " + c);
	}

	public static void twoMethod (int a, int b){
		int c = a + b;
		System.out.println("Print c value in twoMethod- " + c);
	}
	
	public static void threeMethod (String a){
		System.out.println("This is threeMethod value - "+ a);
	}
}

package VoidMethods;

public class NonVoidMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = game();
		System.out.println(a);
		
		int b = play();
		System.out.println(b);
	}
	
	public static String game () {
		return "This is good method";
	}
	
	public static int play () {
		String c = "test";
		return 898;
	}

}

package StaticMethods;

public class NonStaticVariable {

	int a = 10;
	public static int b = 29;
	
	public static void main(String[] args) {
		
		NonStaticVariable ns = new NonStaticVariable ();
		ns.game();

	}
	
	public void game () {
		System.out.println("THis is a game method " + a);
		System.out.println("THis is a game method " + b);
	}

}

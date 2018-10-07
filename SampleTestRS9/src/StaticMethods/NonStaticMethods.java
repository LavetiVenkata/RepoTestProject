package StaticMethods;

public class NonStaticMethods {

	public static void main(String[] args) {
		
		//creating object or constructor
		NonStaticMethods nsM = new NonStaticMethods();
		nsM.add();
		nsM.subt();

	}
	
	public void add (){
		System.out.println("This is a non static add method");
	}

	public void subt () {
		System.out.println("This is a non static subt method");
	}
}

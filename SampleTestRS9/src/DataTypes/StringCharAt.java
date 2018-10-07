package DataTypes;

public class StringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "SeleniumAutomation";
		
		System.out.println("Character at 3rd position = " + s.charAt(3));
		System.out.println("Character at 7rd position = " + s.charAt(7));
		System.out.println("Character at 1rd position = " + s.charAt(1));
		System.out.println("Character at 9rd position = " + s.charAt(9));
		
		char a = s.charAt(10);
		System.out.println("Character at x th position = " + a);
	}

}

package StringMethods;

public class StringTrim {
	
	
	public static void main (String args[]){
		
		/*String a = "  testing ";
		System.out.println(a.trim());*/
		
		String b = "testing-class-is-my-first-classss";
		String[] splitData = b.split("-");
		
		for (int i = 0; i < splitData.length; i ++){
			System.out.println(splitData[i]);
		}
	}

}

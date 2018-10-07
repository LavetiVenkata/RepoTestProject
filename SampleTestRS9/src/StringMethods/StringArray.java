package StringMethods;

public class StringArray {
	
	public static void main (String args[]){
		int a = 5;
		int[] b = {34, 35, 36, 37, 38, 39};
		//System.out.println(b[3]);
		
		String c[] = {"hfj", "sf", "sfsdfs", "aff", "sfsd", "sffsd"};
		
		int numCount = b.length;
		System.out.println("The length of the int array is - " + numCount);
		
		for (int i = 0; i < numCount; i ++){
			
			System.out.println("The array index wise value is " + b[i]);
			System.out.println("The array index wise value is " + c[i]);
		}
	}

}

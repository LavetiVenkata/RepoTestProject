package CollectionPackage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {
	
	public static void main (String args[]){
		
		Set<String> set = new HashSet<String>();
		set.add("TestingA");
		set.add("TestingB");
		set.add("TestingA");
		set.add("TestingD");
		
		System.out.println(set);
		
		Set<Integer> set1 = new TreeSet<Integer>();
		set1.add(3423);
		set1.add(898);
		set1.add(898);
		set1.add(34);
		
		System.out.println(set1);
	}

}

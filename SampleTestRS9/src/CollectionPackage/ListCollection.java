package CollectionPackage;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
	
	public static void main (String args[]) {
		
		int bb = 90;
			
		int a [] = {89, 67, 66, 77, 88, 99};
		for (int i = 0; i < a.length; i ++){
			System.out.println(a[i]);
		}
		
		List<String> list = new ArrayList<String>();
		list.add("TestingA");
		list.add("TestingB");
		list.add("TestingA");
		list.add("TestingD");
		
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(232);
		list1.add(232);
		list1.add(898);
		list1.add(876);
		
		System.out.println(list1);
		
	}
	
	public static void add(){
		System.out.println("This is another package method");
	}

}

package CollectionPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapCollection {
	
	public static void main (String args[]){
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Testing A");
		map.put(200, "Testing B");
		map.put(300, "Testing A");
		map.put(400, "Testing C");
		map.put(500, "Testing D");
		
		System.out.println(map.get(400));
		
	}

}

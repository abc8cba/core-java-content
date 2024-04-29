package required.db.content;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MyCollections {

	public static List<Integer> getIntegerList() {

		return Arrays.asList(5, 4, 3, 2, 1, 5, 4, 3, 2, 5, 4, 3, 5, 4, 5);
	}

	public static List<Integer> getUniqueIntegerList() {

		return Arrays.asList(5, 4, 3, 2, 1, 6, 8, 7, 9);
	}
	
	public static List<String> getStringList() {

		return Arrays.asList("aa","bb","cc","bb","cc","aa","bb","cc","bb");
	}
	
	public static List<String> getUniqueStringList() {

		return Arrays.asList("INDIA","NEWZELAND","AMERICA","SRILANKA","RUSSIA","AFRIKA","NEPAL");
	}
	
	public static Map<String, Integer> getMap(){
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("k2", 30);
		map.put("k1", 60);
		map.put("k6", 20);
		map.put("k8", 90);
		map.put("k5", 50);
		map.put("k7", 70);
		map.put("k4", 40);
		return map;
	}
}

package courses;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _11_Map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "donook");
		map.put("002", "donguk");
		map.put("001", "uki");
		System.out.println(map.size());
		
		System.out.println(map.get("001"));
		
		Set<String> mappingData = map.keySet();
		Iterator<String> iter = mappingData.iterator();
		
		while(iter.hasNext()){
			String key = iter.next();
			String value = map.get(key);
			System.out.println(key+" " + value);
		}
	}
}

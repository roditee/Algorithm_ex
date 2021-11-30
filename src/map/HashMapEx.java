package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// °´Ã¼ ÀúÀå
		map.put("È«±æµ¿", 85);
		map.put("ÀÌ¸ù·æ", 90);
		map.put("È«±æµ¿", 80);
		map.put("¼ºÃáÇâ", 95);
		
		System.out.println("ÃÑ Entry ¼ö : " + map.size());
		System.out.println(map);
		
		// key·Î °Ë»ö -> value ¹İÈ¯
		System.out.println("\nÈ«±æµ¿ °Ë»ö : " + map.get("È«±æµ¿"));
		System.out.println();
		
		// Å° °ª Ãâ·Â
		System.out.println(map.keySet());
		System.out.println();
		
		// key¿Í value Ãâ·Â
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		// °´Ã¼ »èÁ¦ remove(key)
		map.remove("È«±æµ¿");
		System.out.println("\nÃÑ Entry ¼ö : " + map.size());
		
		// ÀüÃ¼ °´Ã¼ »èÁ¦
		map.clear();
		System.out.println("\nÃÑ Entry ¼ö : " + map.size());
	}
}

package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("ȫ�浿", 85);
		map.put("�̸���", 90);
		map.put("ȫ�浿", 80);
		map.put("������", 95);
		
		System.out.println("�� Entry �� : " + map.size());
		System.out.println(map);
		
		// key�� �˻� -> value ��ȯ
		System.out.println("\nȫ�浿 �˻� : " + map.get("ȫ�浿"));
		System.out.println();
		
		// Ű �� ���
		System.out.println(map.keySet());
		System.out.println();
		
		// key�� value ���
		for (String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		// ��ü ���� remove(key)
		map.remove("ȫ�浿");
		System.out.println("\n�� Entry �� : " + map.size());
		
		// ��ü ��ü ����
		map.clear();
		System.out.println("\n�� Entry �� : " + map.size());
	}
}

package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		// 중복된 값은 한 번만 저장됨
		set.add("Java");
		set.add("C++");
		set.add("Python");
		set.add("Java");
		set.add("SQL");
		
		System.out.println("총 객체 수 : " + set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //들어 있는 객체 수 만큼 반복
			System.out.println(iterator.next());
		}
		
		set.remove("C++");
		set.remove("SQL");
		
		System.out.println();
		for(String element : set) {
			System.out.println(element);
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println();
			System.out.println("비어 있음");
		}
	}

}

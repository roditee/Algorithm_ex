package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		// �ߺ��� ���� �� ���� �����
		set.add("Java");
		set.add("C++");
		set.add("Python");
		set.add("Java");
		set.add("SQL");
		
		System.out.println("�� ��ü �� : " + set.size());
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { //��� �ִ� ��ü �� ��ŭ �ݺ�
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
			System.out.println("��� ����");
		}
	}

}

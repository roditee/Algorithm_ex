package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {
	public static void main(String[] args) {
		// ���׸� String Ÿ��
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servelt/JSP");
		list.add("���ѹα� ����");
		
		System.out.println("\n��ü ���� ���");
		for (int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		System.out.println("\n��ü ���� ���2");
		for (String item : list) {
			System.out.println(item);
		}
		
		// �� ��° ��ҿ� ����� ���� ���
		System.out.println("\n�� ��° ��� : " + list.get(2));
		System.out.println("\n�� ��° ��� ���� : " + list.get(2).length()); // ���� ��
		
		// �� ��° ��ҿ� ����� ���� ���
		System.out.println("\n�� ��° ��� : " + list.get(3));
		System.out.println("\n�� ��° ��� ���� : " + list.get(3).length()); // ���� ��
		
		// Ư�� ��ġ�� ����
		list.add(2, "Database");
		
		// �� ��ü �� ���
		System.out.println("\n�� ��ü �� : " + list.size());
		
		// ��ü ���� �ⷰ3
		System.out.println("\n��ü ���� ���3");
		for (String item : list) {
			System.out.println(item);
		}
		
		// Ư�� ��� ����
		list.remove("JDBC");
		
		// Ư�� ��� ���� ����
		System.out.println("\nJava ���� ���� : " + list.contains("Java"));
	}
}

package list;

import java.util.ArrayList;

public class ArrayListEmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> lst = new ArrayList<Employee>(5);
		
		Employee e1 = new Employee(100, "����", 3000.55);
		Employee e2 = new Employee(101, "�ڴ븮", 4000.55);
		Employee e3 = new Employee(102, "�ְ���", 5000.55);
		
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		
		System.out.println(lst.size()); // 3
		
		// ����ϴ� �پ��� ���
		System.out.println(lst);
		
		System.out.println();
		
		for (int i=0; i<lst.size(); i++) {
			Employee emp = lst.get(i);
			System.out.println(emp);
		}
		
		System.out.println();
		
		for (int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
	}

}

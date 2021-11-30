package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsEx {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add("�͹̳�����");
		myList.add("�ƹ�Ÿ");
		
		System.out.print("����Ʈ ���� : ");
		for(String movie : myList) {
			System.out.print(movie + " | ");
		}
		
		System.out.println("\n�������� ���� : ");
		Collections.sort(myList);
		printList(myList);
		
		// �˻�
		int index = Collections.binarySearch(myList, "��Ÿ����");
		System.out.println("��Ÿ�����(��) " + (index+1) + "��° �Դϴ�.");
		
		System.out.println("\n�������� ���� : ");
		Collections.reverse(myList);
		printList(myList);
	}
	
	static void printList(List<String> list) {
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String element = it.next();
			String sep;
			if(it.hasNext())
				sep = " -> ";
			else
				sep = "\n";
			
			System.out.print(element + sep);
		}
	}

}

package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> dict = new HashMap<String, String>();
		
		dict.put("apple", "���");
		dict.put("summer", "����");
		dict.put("candy", "����");
		dict.put("school", "�б�");
		dict.put("water", "��");
		dict.put("exit", "�����մϴ�...");
		
		while (true) {
			System.out.print("ã�� ���� �ܾ��?");
			String str = sc.nextLine();
			
			if(dict.equals("exit")) break;
			else {
				if (dict.containsKey(str)) System.out.println(dict.get(str));
				else System.out.println(str + "��(��) ���� �ܾ��Դϴ�");
			}
		}
		
		System.out.println("�����մϴ�...");
		sc.close();
	}
}

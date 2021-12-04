package map;

import java.util.HashMap;

public class HashMapEx03 {

	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		
		phone.put("ģ��1", new String[] {"010-1111-1111", "02-1111-1111", "fr1@multi.com"});
		phone.put("ģ��2", new String[] {"010-2222-2222", "02-2222-2222", "fr2@multi.com"});
		phone.put("��â", new String[] {"010-3333-3333", "02-3333-3333", "fr3@multi.com"});
		phone.put("�����", new String[] {"010-4444-4444", "02-4444-4444", "boss@multi.com"});
		phone.put("ȸ�絿��", new String[] {"010-5555-5555", "02-5555-5555", "col@multi.com"});
		
		System.out.println("�� �׷� �� : " + phone.size());
		
		// �� ����ó ��� ���� ��ȸ
		for (String k : phone.keySet()) {
			System.out.println(k + " : ");
			String[] phoneList = phone.get(k);
			for (String one : phoneList) {
				System.out.print(one + " | ");
			}
			System.out.println();
		}
		
		System.out.print("ȸ�� ���� �˻� : ");
		if(phone.containsKey("ȸ�絿��")) {
			for (String one : phone.get("ȸ�絿��")) {
				System.out.print(one + " | ");
			}
		}
		
		System.out.print("����� �˻� : ");
		if(phone.containsKey("�����")) {
			for (String one : phone.get("�����")) {
				System.out.print(one + " | ");
			}
		}
		else System.out.println("����ó ����");
	}
}

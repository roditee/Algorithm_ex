package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArray {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		
		System.out.println("������ 4�� ����");
		dq.add("����");
		System.out.println(dq);
		dq.add("��");
		System.out.println(dq);
		dq.add("����");
		dq.offer("���");
		System.out.println(dq);
		
		System.out.println("\n�� �ʿ� ����");
		dq.addFirst("�ٳ���");
		System.out.println(dq);
		
		System.out.println("\n����");
		dq.add("������");
		System.out.println(dq);
		dq.addLast("��");
		System.out.println(dq);
		// add = addLast
		
		System.out.println("\npeek ���� : " + dq.peek());
		System.out.println("\n��ũ ������ : "+ dq.size());
		
		System.out.println("\n��ũ ��ȸ");
		for(String item : dq) {
			System.out.print(item + " ");
		}
		
		System.out.println("\n������ ������");
		System.out.println("remove : " + dq.remove()); // �տ������� ����
		System.out.println(dq);
		
		// ã�Ƽ� ����
		System.out.println("��� remove : " + dq.remove("���"));
		System.out.println(dq);
		
		// ���°� �����غ��� (false)
		System.out.println("���� remove : " + dq.remove("����"));
		System.out.println(dq);
		
		// ���� ������ �����Ͱ� �տ��� �ڿ��� �ִ� ���, �ش� ������ �˻��Ͽ� �����ϸ�?
		System.out.println("\n�� �ʿ� ����");
		dq.addFirst("������");
		System.out.println(dq);
		System.out.println("������ remove : " + dq.remove("������"));
		System.out.println(dq);
		// �ߺ� �����͵� �� �� �� ������ �� ���� ������
		
		System.out.println("remove all : " + dq.removeAll(dq));
		System.out.println(dq);
		
		// ----------------------------------------
		System.out.println("������ 4�� ����");
		dq.add("����");
		System.out.println(dq);
		dq.add("��");
		System.out.println(dq);
		dq.add("����");
		dq.offer("���");
		System.out.println(dq);
		
		System.out.println("poll : " + dq.poll()); // �տ��� ����
		System.out.println(dq);
		
		System.out.println("pollFirst : " + dq.pollFirst()); // �տ��� ����. poll�� ����
		System.out.println(dq);
		
		System.out.println("pollLast : " + dq.pollLast()); // �ڿ��� ����
		System.out.println(dq);
		
		// ��ũ�� ����ó�� ����� ��
		System.out.println("push ����");
		dq.push("��"); //addFirst()�� ����
		dq.push("��");
		System.out.println(dq);
		
		System.out.println("pop ���� : " + dq.pop()); // �� �� ����
		System.out.println(dq);
	}
}

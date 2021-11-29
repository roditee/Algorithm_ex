package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		// ť�� �� �߰�
		System.out.println("ť�� �� 4�� ����");
		q.add("ȫ�浿");
		q.add("�̸���");
		q.add("������");
		
		q.offer("��ö��");
		
		System.out.println("\nť�� ���� ���");
		System.out.println(q);
		System.out.println(q.toString());
		
		System.out.println("\nť�� ũ�� : " + q.size()); // ��ü ũ�Ⱑ �ƴ� ������ ��
		System.out.println("\npeek ����. ù ��° �� ��� : " + q.peek());
		
		System.out.println("\nù ��° �� ���� : " + q.poll());
		System.out.println(q);
		
		// �Ǵ� remove() ���
		System.out.println("\nù ��° �� ���� : " + q.remove());
		System.out.println(q);
		
		// remove("�˻���")�� �˻��Ͽ� ���� ����
		System.out.println("\n�˻��� �� ���� (���� ���) : " + q.remove("���浿"));
		System.out.println("\n�˻��� �� ���� (ã�� ���) : " + q.remove("��ö��"));
		System.out.println(q);
	}

}

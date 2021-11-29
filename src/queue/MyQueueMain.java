package queue;
public class MyQueueMain {

	public static void main(String[] args) {
		int queueSize = 5;
		MyQueue q = new MyQueue(queueSize);
		
		q.showQueue(); //Queue Empty
		System.out.println("������ : " + q.numOfData()); // ������ : 0
		
		
		System.out.println("\na, b, c enqueue ����");
		q.enqueue('a');
		q.enqueue('b');
		q.enqueue('c');
		q.showQueue();    // Queue items : 0:a 1:b 2:c 
		System.out.println("\n������ : " + q.numOfData()); // ������ : 3
		
		System.out.println("\npeek ���� (ù ��° ��) : " + q.peek());
		// peek ���� (ù ��° ��) : a
		
		System.out.println("\ndequeu ����");
		System.out.println("������ �� : " + q.dequeue()); // ������ �� : a
		q.showQueue();  // Queue items : 1:b 2:c 
		System.out.println("\n������ : " + q.numOfData());  //������ : 2
		
		System.out.println("\npeek ���� (ù ��° ��) : " + q.peek());
		// peek ���� (ù ��° ��) : b
		
		System.out.println("\nd, e enqueue ����");
		q.enqueue('d');
		q.enqueue('e');
		q.showQueue();    // Queue items : 1:b 2:c 3:d 4:e 
		System.out.println("\n������ : " + q.numOfData()); // ������ : 4
		
		// ���� ť ���� : 0�� �����, 1~4���� 4�� �����Ͱ� ��� ����
		System.out.println("\nf enqueue ����");
		q.enqueue('f');   // Queue Full!
		q.showQueue();    // Queue items : 1:b 2:c 3:d 4:e 
		System.out.println("\n������ : " + q.numOfData()); // ������ : 4
		
		// �� ������ ������� rear�� stackSize(�ε��� 4, 5��)�� �����ϸ� �����÷ο� �߻�
		// --> �ذ�1 : �̵� ť, �ذ�2 : ���� ��	
		
		System.out.println("\nclear ����");
		q.clear();
		q.showQueue(); // Queue Empty
		
		System.out.println("\ng enqueue ����");
		q.enqueue('g');
		q.showQueue(); // Queue items : 0:g 
	}
}

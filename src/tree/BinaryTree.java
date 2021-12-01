package tree;

public class BinaryTree {
	Node rootNode = null;
	
	// ���ο� ��� ����
	public void insertNode(int element) {
		// ��Ʈ�� �� ���, ��� ����
		if (rootNode == null) rootNode = new Node(element);
		else {
			Node head = rootNode;
			Node currentNode;
			
			while(true) {
				currentNode = head;
				
				// ���� ��Ʈ���� ���� ���, �������� Ž��
				if (head.value > element) {
					head = head.leftChild;
					
					// ���� �ڽ� ��尡 ����ִ� ���, �ش� ��ġ�� �߰��� ��� ����
					// ���� currentNode�� head�� ����Ű�� ����
					if (head == null) {
						currentNode.leftChild = new Node(element);
						break;
					}
				}
					else { // ���� ��Ʈ���� ū ���, ���������� Ž��
						head = head.rightChild;
						
						// ������ �ڽ� ��尡 ����ִ� ���, �ش� ��ġ�� �߰��� ��� ����
						// ���� currentNode�� head�� ����Ű�� ����
						if (head == null) {
							currentNode.rightChild = new Node(element);
							break;
						}
					}
				}
			}
		System.out.println();
	}
	
	// ���� ���� (��ȸ) : root - left - right
	public void preorderTree(Node root, int depth) {
		if (root != null) {
			for (int i=0; i<depth; i++) {
				System.out.print("��");
			}
			
			System.out.println(root.value);  // root
			preorderTree(root.leftChild, depth+1);  // left
			preorderTree(root.rightChild, depth+1);  // right
		}
	}
	
	// ���� ���� : left - root - right
	public void inorderTree(Node root, int depth) {
		if (root != null) {
			inorderTree(root.leftChild, depth+1);  // left
			
			for (int i=0; i<depth; i++) {
				System.out.print("��");
			}
			
			System.out.println(root.value);  // root
			
			inorderTree(root.rightChild, depth+1);  // right
		}
	}
	
	// ���� ���� : left - right - root
		public void postorderTree(Node root, int depth) {
			if (root != null) {
				postorderTree(root.leftChild, depth+1);  // left
				postorderTree(root.rightChild, depth+1);  // right
				
				for (int i=0; i<depth; i++) {
					System.out.print("��");
				}
				
				System.out.println(root.value);  // root
			}
		}
		
		// ���� �˻�
		public void searchBTree(Node n, int target) {
			try {
				// target ���� ���� ����� ������ (n.value)���� ������ ��
				if (target < n.value) {
					System.out.println("target�� " + n.value + "���� ����");
					searchBTree(n.leftChild, target);
				} else if (target > n.value) {
					System.out.println("target�� " + n.value + "���� ŭ");
					searchBTree(n.rightChild, target);
				} else System.out.println("ã����");
				
			} catch (Exception e) {
				System.out.println("Ʈ���� ����");
			}
		}
}

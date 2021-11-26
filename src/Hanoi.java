import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("���� ���� �Է� : ");
        int n = sc.nextInt();
        
        hanoi(1, 2, 3, n); //1�� ����� n���� 3�� ������� �ű�
	}
	
	static void hanoi(int from, int m, int to, int n) { // from -> to�� ���� n�̵�
		System.out.printf("f:%d m:%d t:%d n:%d\n", from, m, to, n);
		
		if(n == 0)
			return;
		
		hanoi(from, to, m, n-1); // ���� n-1�� from -> m���� �̵�
		System.out.printf("���� [%d]�� %d���� %d�� �̵�\n", n, from, to);//���� n�� from -> to�� �̵�
		hanoi(m, from, to, n-1); // ���� n-1�� m -> to�� �̵�
	}
}

import java.util.Scanner;

public class exGreedyCoinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ� �Է� : ");
		int charge = sc.nextInt();
		int[] unit = {5000, 1000, 500, 100, 50, 10};
		
		for (int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "�� : " + charge/unit[i]); //�������� ��
			charge%=unit[i];
		}
		System.out.println("������ : " + charge);
		
		sc.close();
	}

}

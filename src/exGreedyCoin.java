import java.util.Scanner;

public class exGreedyCoin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ� �Է� : ");
		int charge = sc.nextInt();
		
		int cnt_5000 = 0;
		int cnt_1000 = 0;
		int cnt_500 = 0;
		int cnt_100 = 0;
		int cnt_50 = 0;
		int cnt_10 = 0;
		
		while(charge > 10) {
			if (charge >= 5000) {
				cnt_5000++;
				charge-=5000;
			}
			else if (charge >= 1000) {
				cnt_1000++;
				charge-=1000;
			}
			else if (charge >= 500) {
				cnt_500++;
				charge-=500;
			}
			else if (charge >= 100) {
				cnt_100++;
				charge-=100;
			}
			else if (charge >= 50) {
				cnt_50++;
				charge-=50;
			}
			else if (charge >= 10) {
				cnt_10++;
				charge-=10;
			}
		}
		
		System.out.printf("5000�� : %d\n", cnt_5000);
		System.out.printf("1000�� : %d\n", cnt_1000);
		System.out.printf("500�� : %d\n", cnt_500);
		System.out.printf("100�� : %d\n", cnt_100);
		System.out.printf("50�� : %d\n", cnt_50);
		System.out.printf("10�� : %d\n", cnt_10);
		System.out.printf("������ : %d\n", charge);
		
		sc.close();
	}
}

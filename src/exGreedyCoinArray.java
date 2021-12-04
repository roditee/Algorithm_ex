import java.util.Scanner;

public class exGreedyCoinArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 : ");
		int charge = sc.nextInt();
		int[] unit = {5000, 1000, 500, 100, 50, 10};
		
		for (int i=0; i<unit.length; i++) {
			System.out.println(unit[i] + "원 : " + charge/unit[i]); //나누기한 몫
			charge%=unit[i];
		}
		System.out.println("나머지 : " + charge);
		
		sc.close();
	}

}

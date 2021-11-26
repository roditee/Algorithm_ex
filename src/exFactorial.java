import java.util.Scanner;

public class exFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		System.out.printf("%d! = ", n);
		System.out.print("1 = " + factorial(n));
		
		sc.close();
	}
	
	static int factorial(int n) {
		if (n == 0 || n == 1) return 1;
		else {
			System.out.print(n + " * ");
			return  n * factorial(n-1);
		}
	}
}
package sort;

public class ShellSortEx {

	public static void main(String[] args) {
		int[] arr = {10, 8, 6, 20, 4, 3, 22, 1, 0, 15, 16};
		shellSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	static void shellSort(int[] arr) {
		int N = arr.length;
		
		for(int h=N/2; h > 0; h/=2) {
			//System.out.println(h); // ���� h Ȯ��
			for(int i=h; i<N; i++) { // ���� ������ �ϱ� ���� ���� ����Ʈ�� �� ��° ���� ������ ���� ��
				int index = i-h;
				
				int temp = arr[i]; 
				
				// ���� ���� ����
				while(index >=0 && arr[index] > temp) {
					arr[index+h] = arr[index];
					index -= h;
				}
				
				arr[index + h] = temp;
			}
			
			// �� ���ݸ��� ���� ��� (5���� / 2���� / 1����)
			for(int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

}

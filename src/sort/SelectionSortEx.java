package sort;

public class SelectionSortEx {

	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 3, 1};
		selectionSrot(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	static void selectionSrot(int[] arr) {
		int temp;
		
		// �� ���� : �迭ũ�� - 1 �� ����
		for(int i=0; i<arr.length-1; i++) {
			// i �������� ������ ��
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
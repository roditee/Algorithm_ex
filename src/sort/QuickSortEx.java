package sort;

public class QuickSortEx {

	public static void main(String[] args) {
		int[] arr = {5, 2, 8, 3, 1};
		quickSort(arr, 0, arr.length-1);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	static void quickSort(int[] arr, int low, int high) {
		if(low >= high) {  // �����ϰ��� �ϴ� ������ ���Ұ� 1���� ���
			return;
		}
		
		int pivot = low;
		int i = low + 1;
		int j = high;
		int temp;
		
		while(i <= j) {// ������ ������ �ݺ�. j�� i���� ũ�� while�� ����
			
			// �ǹ����� ū ���� ���� ������ �ݺ�
			while(i<=high && arr[i] < arr[pivot]) {
				i++;
			}
			
			// �ǹ����� ���� ���� ���� ������ �ݺ�
			while(j>low && arr[j] >= arr[pivot]) {
				j--;
			}
			
			if(i > j) { //������ ���°� �Ǹ� : �Ǻ��� j�� ��ȯ
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;				
			} else { // i�� j ��ȯ
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		
		quickSort(arr, low, j-1);
		quickSort(arr, j+1, high);
	}

}
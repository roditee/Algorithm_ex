package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lst = new ArrayList<String>(4);
		
		for (int i=0; i<4; i++) {
			String str = sc.nextLine();
			lst.add(str);
		}
		
		String maxVal = null;
		int maxLen = lst.get(0).length();
		for (int i=0; i<lst.size(); i++) {
			if(lst.get(i).length() > maxLen) {
				maxLen = lst.get(i).length();
				maxVal = lst.get(i);
			}
		}
		
		System.out.println("�ܾ� ����Ʈ : " + lst);
		System.out.println("���� �� �ܾ� : " + maxLen);
		System.out.println("���� �� �ܾ��� ���� : " + maxVal);
	}
}

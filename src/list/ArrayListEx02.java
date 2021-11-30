package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {
	public static void main(String[] args) {
		// 제네릭 String 타입
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servelt/JSP");
		list.add("대한민국 만세");
		
		System.out.println("\n전체 내용 출력");
		for (int i=0; i<list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		System.out.println("\n전체 내용 출력2");
		for (String item : list) {
			System.out.println(item);
		}
		
		// 세 번째 요소와 요소의 길이 출력
		System.out.println("\n세 번째 요소 : " + list.get(2));
		System.out.println("\n세 번째 요소 길이 : " + list.get(2).length()); // 글자 수
		
		// 네 번째 요소와 요소의 길이 출력
		System.out.println("\n네 번째 요소 : " + list.get(3));
		System.out.println("\n네 번째 요소 길이 : " + list.get(3).length()); // 글자 수
		
		// 특정 위치에 삽입
		list.add(2, "Database");
		
		// 총 객체 수 출력
		System.out.println("\n총 객체 수 : " + list.size());
		
		// 전체 내용 출럭3
		System.out.println("\n전체 내용 출력3");
		for (String item : list) {
			System.out.println(item);
		}
		
		// 특정 요소 제거
		list.remove("JDBC");
		
		// 특정 요소 포함 여부
		System.out.println("\nJava 포함 여부 : " + list.contains("Java"));
	}
}

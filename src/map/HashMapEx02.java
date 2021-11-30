package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> dict = new HashMap<String, String>();
		
		dict.put("apple", "사과");
		dict.put("summer", "여름");
		dict.put("candy", "사탕");
		dict.put("school", "학교");
		dict.put("water", "물");
		dict.put("exit", "종료합니다...");
		
		while (true) {
			System.out.print("찾고 싶은 단어는?");
			String str = sc.nextLine();
			
			if(dict.equals("exit")) break;
			else {
				if (dict.containsKey(str)) System.out.println(dict.get(str));
				else System.out.println(str + "은(는) 없는 단어입니다");
			}
		}
		
		System.out.println("종료합니다...");
		sc.close();
	}
}

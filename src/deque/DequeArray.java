package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeArray {
	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		
		System.out.println("데이터 4개 삽입");
		dq.add("포도");
		System.out.println(dq);
		dq.add("배");
		System.out.println(dq);
		dq.add("수박");
		dq.offer("사과");
		System.out.println(dq);
		
		System.out.println("\n앞 쪽에 삽입");
		dq.addFirst("바나나");
		System.out.println(dq);
		
		System.out.println("\n삽입");
		dq.add("복숭아");
		System.out.println(dq);
		dq.addLast("귤");
		System.out.println(dq);
		// add = addLast
		
		System.out.println("\npeek 수행 : " + dq.peek());
		System.out.println("\n데크 사이즈 : "+ dq.size());
		
		System.out.println("\n데크 순회");
		for(String item : dq) {
			System.out.print(item + " ");
		}
		
		System.out.println("\n데이터 꺼내기");
		System.out.println("remove : " + dq.remove()); // 앞에서부터 삭제
		System.out.println(dq);
		
		// 찾아서 삭제
		System.out.println("사과 remove : " + dq.remove("사과"));
		System.out.println(dq);
		
		// 없는거 삭제해보기 (false)
		System.out.println("딸기 remove : " + dq.remove("딸기"));
		System.out.println(dq);
		
		// 같은 내용의 데이터가 앞에도 뒤에도 있는 경우, 해당 데이터 검색하여 삭제하면?
		System.out.println("\n앞 쪽에 삽입");
		dq.addFirst("복숭아");
		System.out.println(dq);
		System.out.println("복숭아 remove : " + dq.remove("복숭아"));
		System.out.println(dq);
		// 중복 데이터들 중 맨 앞 데이터 한 개만 삭제됨
		
		System.out.println("remove all : " + dq.removeAll(dq));
		System.out.println(dq);
		
		// ----------------------------------------
		System.out.println("데이터 4개 삽입");
		dq.add("포도");
		System.out.println(dq);
		dq.add("배");
		System.out.println(dq);
		dq.add("수박");
		dq.offer("사과");
		System.out.println(dq);
		
		System.out.println("poll : " + dq.poll()); // 앞에서 삭제
		System.out.println(dq);
		
		System.out.println("pollFirst : " + dq.pollFirst()); // 앞에서 삭제. poll과 동일
		System.out.println(dq);
		
		System.out.println("pollLast : " + dq.pollLast()); // 뒤에서 삭제
		System.out.println(dq);
		
		// 데크를 스택처럼 사용할 때
		System.out.println("push 수행");
		dq.push("밤"); //addFirst()와 동일
		dq.push("밤");
		System.out.println(dq);
		
		System.out.println("pop 수행 : " + dq.pop()); // 맨 앞 삭제
		System.out.println(dq);
	}
}

package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		
		// 큐에 값 추가
		System.out.println("큐에 값 4개 삽입");
		q.add("홍길동");
		q.add("이몽룡");
		q.add("성춘향");
		
		q.offer("김철수");
		
		System.out.println("\n큐의 내용 출력");
		System.out.println(q);
		System.out.println(q.toString());
		
		System.out.println("\n큐의 크기 : " + q.size()); // 전체 크기가 아닌 데이터 수
		System.out.println("\npeek 수행. 첫 번째 값 출력 : " + q.peek());
		
		System.out.println("\n첫 번째 값 삭제 : " + q.poll());
		System.out.println(q);
		
		// 또는 remove() 사용
		System.out.println("\n첫 번째 값 삭제 : " + q.remove());
		System.out.println(q);
		
		// remove("검색어")로 검색하여 삭제 가능
		System.out.println("\n검색한 값 삭제 (없는 경우) : " + q.remove("강길동"));
		System.out.println("\n검색한 값 삭제 (찾은 경우) : " + q.remove("김철수"));
		System.out.println(q);
	}

}

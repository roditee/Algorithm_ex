package map;

import java.util.HashMap;

public class HashMapEx03 {

	public static void main(String[] args) {
		HashMap<String, String[]> phone = new HashMap<String, String[]>();
		
		phone.put("친구1", new String[] {"010-1111-1111", "02-1111-1111", "fr1@multi.com"});
		phone.put("친구2", new String[] {"010-2222-2222", "02-2222-2222", "fr2@multi.com"});
		phone.put("동창", new String[] {"010-3333-3333", "02-3333-3333", "fr3@multi.com"});
		phone.put("부장님", new String[] {"010-4444-4444", "02-4444-4444", "boss@multi.com"});
		phone.put("회사동기", new String[] {"010-5555-5555", "02-5555-5555", "col@multi.com"});
		
		System.out.println("총 그룹 수 : " + phone.size());
		
		// 내 연락처 모든 정보 조회
		for (String k : phone.keySet()) {
			System.out.println(k + " : ");
			String[] phoneList = phone.get(k);
			for (String one : phoneList) {
				System.out.print(one + " | ");
			}
			System.out.println();
		}
		
		System.out.print("회사 동기 검색 : ");
		if(phone.containsKey("회사동기")) {
			for (String one : phone.get("회사동기")) {
				System.out.print(one + " | ");
			}
		}
		
		System.out.print("사장님 검색 : ");
		if(phone.containsKey("사장님")) {
			for (String one : phone.get("사장님")) {
				System.out.print(one + " | ");
			}
		}
		else System.out.println("연락처 없음");
	}
}

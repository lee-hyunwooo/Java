package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UserMamExam {

	public static void main(String[] args) {
		//HashMap 생성 UserAge
		Map<String, Integer> User = new HashMap<>();
		//유저의 이름과 나이
		User.put("GG", 27);
		User.put("KK", 30);
		User.put("TT", 24);
		User.put("QQ", 21);
		User.put("UU", 36);
		//특정 유저 검색
		String UserName = "GG";
		
		if (User.containsKey(UserName)) {
			int age = User.get(UserName);
			System.out.println(UserName + "의 나이 : " + age);
		} else {
			System.out.println("유저 정보를 찾을 수 없습니다.");
		}
		//모든 유저와 나이 출력
			for (Map.Entry<String, Integer> entry : User.entrySet()) {
				String name = entry.getKey();
				int age = entry.getValue();
				System.out.println(name + " : " + age);
			}
		//유저 나이 수정
		String UserUpdate = "QQ";
		int UserAge = 29;
		User.put(UserUpdate, UserAge);
		System.out.println(UserUpdate + "의 나이를 " + UserAge + "로 수정했습니다.");
		//유저 탈퇴
		String removeUser = "UU";
		User.remove(removeUser);
		
		System.out.println(removeUser + "의 정보를 삭제했습니다.");
		//최종 유저 출력
		System.out.println("최종 유저 정보 : ");
		for (Map.Entry<String, Integer> entry : User.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
	}

}

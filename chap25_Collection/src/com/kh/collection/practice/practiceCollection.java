package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practiceCollection {

	public static void main(String[] args) {
		practiceCollection p = new practiceCollection();
			p.practiceMap();
	}

	public void practiceList () {
		List<String> myList = new ArrayList<>();
		//String add 해보고 포문 출력
		myList.add("햄버거");
		myList.add("피자");
		myList.add("고기");
		for(String food : myList) {
			System.out.println(food);
		}
	}
	
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add 해보고 포문 출력 중복된값 add 해야함
		pSet.add("기린");
		pSet.add("코끼리");
		pSet.add("사자");
		pSet.add("호랑이");
		pSet.add("기린");
		
		for(String animal : pSet) {
			System.out.println(animal);
		}
		
		
		
	}
	
	public void practiceMap() {
		//키와 값을 이용해서 map put 한다음 향상된 포문으로 출력하기
		Map<String, Integer> my = new HashMap<>();
		my.put("식당", 1);
		my.put("피시방", 2);
		my.put("영화관", 3);
		my.put("아쿠아리움", 4);
		my.put("피시방", 354);//중복으로 인해 가장 아래에 있는 문구 출력
		
		for(String country : my.keySet()) {
			int code = my.get(country);
			System.out.println(country + " : " + code);
		}
	}
	/* 회원가입 예상 for(String country : my.keySet()) {
						int code = my.get(country);
					 if () {
						country == name ???
	//     	   	   " 중복된 이름입니다. 다시 입력해주세요."
	// 			else 
	" 사용 가능한 이름입니다."
	*/			
	
}

package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class practiceCollection {

	public static void main(String[] args) {
		practiceCollection p = new practiceCollection();
			p.practiceSet();
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
	
	
	
}

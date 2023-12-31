package com.kh.genericspractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T 사용하여 출력
		PracticeMain pm = new PracticeMain();
			pm.practice1();
		
	}

	public void practice1() {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(42);
		intList.add(30);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("안녕하세요");
		strList.add("좋은 점심입니다.");
		
		printList(intList);
		printList(strList);
	}
	
	
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}
	
	public void practice2() {
		//Box 객체를 밑에 생성
		//정수형 데이터를 저장하는 box 인스턴스 생성
		//문자열 데이터를 저장하는 box 인스턴스 생성
		Box<Integer> intBox = new Box<>();
		intBox.add(40);
		intBox.add(50);
		int intValue = intBox.get();
		
		
			
		Box<String> strBox = new Box<>();
		
		strBox.add("하하");
		strBox.add("허허");
		strBox.add("gggg");
		String strValue = strBox.get();
		

		System.out.println(intValue);
		System.out.println(strValue);
		
		}
		
		
		
		
	
	
	
	
}

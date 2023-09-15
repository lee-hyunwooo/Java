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
}

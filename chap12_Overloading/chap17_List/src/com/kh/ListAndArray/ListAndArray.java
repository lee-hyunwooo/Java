package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1(); //static
		ListAndArray LAA = new ListAndArray();
		LAA.ListArray2();
	}
	public static void ListArray1() {
		// Array 예제
		int[] intArray = new int[2]; //크기가 2인 정수 배열 생성
		intArray[0]=1;
		intArray[1]=2;
	//	intArray[2]=3;
	
		// Array 출력
		System.out.println("Array 요소 : ");
		for(int a=0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
	
		System.out.println(); //개행문자 포함돼있어 enter같은 역할을 ㅏㅁ
		// List 예제 Integer = int
							//  빈 배열 리스트 생성
		List<Integer> intList = new ArrayList<>(); //Integer 객체를 저장하는 ArrayList 생성
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		//List 출력
		System.out.println("List 요소 : ");
		for (int num : intList) {
			System.out.print(num + " ");
		}

	}
	
	public void ListArray2() {
		// Array 예제
		String[] strArray = new String[2]; //크기가 2인 정수 배열 생성
		strArray[0]="1";
		strArray[1]="2";
	//	intArray[2]=3;
	
		// Array 출력
		System.out.println("Array 요소 : ");
		for(int a=0; a < strArray.length; a++) {
			System.out.print(strArray[a] + " ");
		}
	
		System.out.println(); //개행문자 포함돼있어 enter같은 역할을 ㅏㅁ
		// List 예제 Integer = int
							//  빈 배열 리스트 생성
		List<String> StringList = new ArrayList<>(); //Integer 객체를 저장하는 ArrayList 생성
		StringList.add("1");
		StringList.add("2");
		StringList.add("3");
		StringList.add("4");
		//List 출력
		System.out.println("List 요소 : ");
		for (String num : StringList) {
			System.out.print(num + " ");
		}
	}
}

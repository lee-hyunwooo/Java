package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {}
		
		public void ListArray1() {
		// Array 예제
		int[] intArray = new int[2]; //크기가 2인 정수 배열 생성
		intArray[0]=1;
		intArray[1]=2;
		
		// Array출력
		System.out.println("Array 요소 : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		System.out.println(); //개행문자 포함되어있어 enter 같은 역할을 해줌
	//List 예제
		List<Integer> intList = new ArrayList<>();
									//Integer 객체를 저장하는 ArrayList 생성
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List 출력
		System.out.println("List 요소 : ");
		for (int num : intList) {
			System.out.print(num + " ");
		 }
		}
		public void ListArray2() {
		//String 으로 변환 후 Array와 List 출력해보기
		String[] StringArray = new String[3];
		StringArray[0]="이";
		StringArray[1]="현";
		StringArray[2]="우";
		
		System.out.println();
		System.out.println("Array 요소 : ");
		for(int i = 0; i < StringArray.length; i++) {
			System.out.print(StringArray[i] + " ");
		}
		System.out.println();
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("리");
		stringList.add("스");
		stringList.add("트");
		
		System.out.println("List 요소 : ");
		for (String str : stringList) {
			System.out.print(str + " ");
			
		}
		
	}
  
}

package com.kh.arraySample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple", "Banana","cherry"},
				{"Grapes","Orange","Strawberry"},
				{"Kiwi","Mango","pineApple"}
		};
		System.out.println("fruits.length : " + fruits.length);
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("첫번째 포문 : " + i);
			for(int a = 0; a < fruits[i].length; a++) {
				System.out.print(fruits[i][a] + " ");
				System.out.println("두번째 포문 : " + a);
			}
			System.out.println(); //다음행으로 이동할 수 있게 enter용 출력메소드 입력
		}
	}

}

package com.kh.arraySample;

public class TwoArray {

	public static void main(String[] args) {
		// ���� ���ڿ� �迭 ����� �ʱ�ȭ
		String[][] fruits = {
				{"Apple", "Banana","cherry"},
				{"Grapes","Orange","Strawberry"},
				{"Kiwi","Mango","pineApple"}
		};
		System.out.println("fruits.length : " + fruits.length);
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("ù��° ���� : " + i);
			for(int a = 0; a < fruits[i].length; a++) {
				System.out.print(fruits[i][a] + " ");
				System.out.println("�ι�° ���� : " + a);
			}
			System.out.println(); //���������� �̵��� �� �ְ� enter�� ��¸޼ҵ� �Է�
		}
	}

}

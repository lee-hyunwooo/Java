package com.kh.genericspractice;

import java.util.ArrayList;

public class PracticeMain {

	public static void main(String[] args) {
		// String Integer T ����Ͽ� ���
		PracticeMain pm = new PracticeMain();
			pm.practice1();
		
	}

	public void practice1() {
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(42);
		intList.add(30);
		
		ArrayList<String> strList = new ArrayList<>();
		strList.add("�ȳ��ϼ���");
		strList.add("���� �����Դϴ�.");
		
		printList(intList);
		printList(strList);
	}
	
	
	public static <T> void printList(ArrayList<T> list) {
		for (T item : list) {
			System.out.println(item);
		}
	}
}

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
		//String add �غ��� ���� ���
		myList.add("�ܹ���");
		myList.add("����");
		myList.add("���");
		for(String food : myList) {
			System.out.println(food);
		}
	}
	
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add �غ��� ���� ��� �ߺ��Ȱ� add �ؾ���
		pSet.add("�⸰");
		pSet.add("�ڳ���");
		pSet.add("����");
		pSet.add("ȣ����");
		pSet.add("�⸰");
		
		for(String animal : pSet) {
			System.out.println(animal);
		}
		
		
		
	}
	
	
	
}

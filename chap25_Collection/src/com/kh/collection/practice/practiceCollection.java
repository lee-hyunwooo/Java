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
	
	public void practiceMap() {
		//Ű�� ���� �̿��ؼ� map put �Ѵ��� ���� �������� ����ϱ�
		Map<String, Integer> my = new HashMap<>();
		my.put("�Ĵ�", 1);
		my.put("�ǽù�", 2);
		my.put("��ȭ��", 3);
		my.put("����Ƹ���", 4);
		my.put("�ǽù�", 354);//�ߺ����� ���� ���� �Ʒ��� �ִ� ���� ���
		
		for(String country : my.keySet()) {
			int code = my.get(country);
			System.out.println(country + " : " + code);
		}
	}
	/* ȸ������ ���� for(String country : my.keySet()) {
						int code = my.get(country);
					 if () {
						country == name ???
	//     	   	   " �ߺ��� �̸��Դϴ�. �ٽ� �Է����ּ���."
	// 			else 
	" ��� ������ �̸��Դϴ�."
	*/			
	
}

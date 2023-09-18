package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<>();
		food.add("����");
		food.add("���̽�ũ��");
		food.add("���");
		
		Iterator<String> iter = food.iterator();
		
		while(iter.hasNext()) {
			String fd = iter.next();
			System.out.println(fd);
		}
		//��� ����
		iter = food.iterator();
		while (iter.hasNext()) {
			String fd = iter.next();
			if(fd.equals("���")) {
				iter.remove();
			}
			System.out.println(fd);
			
		}
		
		System.out.println("���� ��");
		for(String a : food) {
			System.out.println(a);
		}
	
	
	}
	
}

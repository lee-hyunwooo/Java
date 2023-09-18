package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<>();
		food.add("과자");
		food.add("아이스크림");
		food.add("라면");
		
		Iterator<String> iter = food.iterator();
		
		while(iter.hasNext()) {
			String fd = iter.next();
			System.out.println(fd);
		}
		//요소 삭제
		iter = food.iterator();
		while (iter.hasNext()) {
			String fd = iter.next();
			if(fd.equals("라면")) {
				iter.remove();
			}
			System.out.println(fd);
			
		}
		
		System.out.println("삭제 후");
		for(String a : food) {
			System.out.println(a);
		}
	
	
	}
	
}

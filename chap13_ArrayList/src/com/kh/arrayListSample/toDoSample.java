package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//할일만들고
		list.add("숙제");
		list.add("밥먹기");
		list.add("설거지");
		
		//수정하고
		System.out.println(list);
		list.set(1, "청소");
		list.set(2, "방정리");
		System.out.println(list);
		
		//지우고
		list.remove(1);
		System.out.println(list);
		
		//전부 삭제
		list.clear();
		System.out.println(list);
	
	}

}

package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<>();
		//할일추가하기
		toDoList.add("숙제");
		System.out.println(toDoList);
		toDoList.add("밥먹기");
		System.out.println(toDoList);
		toDoList.add("설거지");
		System.out.println(toDoList);
		
		//수정하고
		System.out.println(toDoList);
		toDoList.set(1, "청소");
		toDoList.set(2, "방정리");
		System.out.println(toDoList);
		
		//지우고
		toDoList.remove(1);
		System.out.println(toDoList);
		
		//순회해서 요소출력
		for(String aaa : toDoList) {
			System.out.println("할일 : " + aaa);
		}
		//중복된 할일 제거
		
		
		
		//전부 삭제
		toDoList.clear();
		System.out.println(toDoList);
	
	}

}

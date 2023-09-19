package com.kh.practice;

import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		// stack에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("stack에서 사라질 값 : " + stack.pop()); //가장 위에있는 4 삭제
		System.out.println("stack에서 사라질 값 : " + stack.pop()); //가장 위에있는 3 삭제
		
		System.out.println("현재 stack 가장 위에 있는 값은? : " +stack.peek()); //가장 위에는 2
		
		System.out.println("stack의 현재 사이즈는? : " + stack.size()); //현재 사이즈 2
		
		System.out.println("stack이 비었는가 : " +stack.empty()); //아직 수가 남음 false
		
		System.out.println("현재 stack에 ()안 값이 남아있는가" + stack.contains(1)); //현재 1은 남아있으므로 true
		
		System.out.println("stack 출력 : " + stack); //1,2
		
		stack.clear(); //스택 초기화
		
		
		System.out.println("stack이 비었는가 : " +stack.empty()); //초기화로 인해 비어있음 true
		
		
		
		
		
	}
	
}

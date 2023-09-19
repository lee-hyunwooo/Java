package com.kh.practice;

import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		PracticeMain pm = new PracticeMain();
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.pop()); //���� �����ִ� 4 ����
		System.out.println(stack.pop()); //���� �����ִ� 3 ����
		
		System.out.println(stack.peek()); //���� ������ 2
		
		System.out.println(stack.size()); //���� ������ 2
		
		System.out.println("stack�� ����°�" +stack.empty()); //���� ���� ���� false
		
		System.out.println(stack.contains(1)); //���� 1�� ���������Ƿ� true
		
		System.out.println("stack ��� : " + stack); //1,2
		
		stack.clear(); //���� �ʱ�ȭ
		
		
		System.out.println("stack�� ����°�" +stack.empty()); //�ʱ�ȭ�� ���� ������� true
		
		
		
		
		
	}
	
}

package com.kh.practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {

	public static void main(String[] args) {
		
		PracticeMain pm = new PracticeMain();
			pm.PracticeQueue();
	}
	public void PracticeStack() {
		// stack�� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
		
				Stack<Integer> stack = new Stack<>();
				stack.push(1);
				stack.push(2);
				stack.push(3);
				stack.push(4);
				System.out.println("stack���� ����� �� : " + stack.pop()); //���� �����ִ� 4 ����
				System.out.println("stack���� ����� �� : " + stack.pop()); //���� �����ִ� 3 ����
				
				System.out.println("���� stack ���� ���� �ִ� ����? : " +stack.peek()); //���� ������ 2
				
				System.out.println("stack�� ���� �������? : " + stack.size()); //���� ������ 2
				
				System.out.println("stack�� ����°� : " +stack.empty()); //���� ���� ���� false
				
				System.out.println("���� stack�� ()�� ���� �����ִ°�" + stack.contains(1)); //���� 1�� ���������Ƿ� true
				
				System.out.println("stack ��� : " + stack); //1,2
				
				stack.clear(); //���� �ʱ�ȭ
				
				
				System.out.println("stack�� ����°� : " +stack.empty()); //�ʱ�ȭ�� ���� ������� true
		
	}
	
	public void PracticeQueue() {
		//ť�� ��� �߰� ��ȯ �����ϰ� while ����غ���
		Queue<String> queue = new LinkedList<>();
		queue.offer("���");
		queue.offer("�ٳ���");
		queue.offer("ü��");
		queue.offer("�޷�");
		
		String removedElement = queue.poll();
		System.out.println("���� ��� : " +removedElement+", front ��� : " + queue.peek());
		
		while(!queue.isEmpty()) {
			removedElement = queue.poll();
			System.out.println(queue);
		}
		
		
	}
	
}

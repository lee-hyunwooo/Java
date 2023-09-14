package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
			//p.ArithException();
			p.NumFormatException();
	}

	public void ArithException() {
		//int dividend / divisor �������� �� ����ó��
		int dividend = 100;
		int divisor = 0;
		try {
		int result = dividend/divisor;
		System.out.println("result : " + result);
	} catch (ArithmeticException e) {
		System.out.println("��� ���� ����"+e.getMessage());
	}
	}
	
	public void NPException() {
		
		try{
			//indexOf subText �� �ִ� null ���� ������ ���ڿ� �˻�
			String text = "Hello World";
			String subText = null;
			int length = text.indexOf(subText);
		} catch(NullPointerException e) {
			System.out.println("NullPointerException : " + e.getMessage());
		}
	}
	
	public void NumFormatException() {
		try {
		String text = "123.45";
		int number = Integer.parseInt(text);
		//�������� ������ ���ڿ��� ������ ��ȯ
		System.out.println(number);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException ���� ���� ����" +e.getMessage());
		}
		}
	
	
}

package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class PracticeMain4 {
	
	public void practice1 () {
	
	String name = "KH";
	int age = 25;
	String formatString = String.format("�̸�: %s, ����:%d",name,age);
	System.out.println(formatString);
	}
	

	
	public void practice2() {
		//��¥ ���� ���
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String formatStr = String.format("���� ���� : %s", smDateFormat.format(currentDate));
	}

	public void practice3() {
		int num1 = 123;
		int num2 = 7;
		
		//String ������ = String.format("����1:    , ����2:     ",    ,    );
		//System.out.println(������);
		String number = String.format("����1:%d, ����2:%d",num1,num2);
		System.out.println(number);
		//���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�.
		//��µǴ� ������ �ּ� �ʺ� �ڸ� 5�ڸ��� �ϰ�ʹ�.
		//String number = String.format("����1:%05d, ����2:%d",num1,num2);
		
		
	}
	
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10�� �ּ� �ʺ� �ּ� 10�ڸ��� ������ ����
		//���� ���ڿ��� 10�ڸ����� ª�ٸ� ���ʿ� �������� ä����
		//���� ���ڿ��� -10�ڸ����� ª�ٸ� �����ʿ� �������� ä����
		//	' ����ǥ�� �ѷ��׾ƾ���
		String format = String.format("'%-10s' '%10s'",text1, text2);
		System.out.println(format);
	}
	
	
	public static void main(String[] args) {
		PracticeMain4 p = new PracticeMain4();
		 p.practice4();
		
	}
	
}

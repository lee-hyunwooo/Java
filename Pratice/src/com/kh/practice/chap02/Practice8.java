package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice8 {
	/*
	 ����ڷκ��� �Է� ���� ������ ���� ����ϼ���
	 * */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("�� �Է��ϼ���.");
       int num = sc.nextInt();
       
       System.out.println(num + "��");//Ű����� �Է��� ���ڰ� ���� ��
       for(int i = 1; i <= 9; i++) { //1 2 3 4 5 6 7 8 9
    	   int result = num * i;
    	   System.out.println(i + "�� �� " + result);
    	   
       }
    }
}





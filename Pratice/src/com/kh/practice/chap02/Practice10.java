package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice10 {
/*
 ����ڷκ��� �Է� ���� ������ ���� ��� 
 * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("���ڸ� �Է��ϼ���: ");
        int num = sc.nextInt();
        
        System.out.println(num + "��:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        
    }
}

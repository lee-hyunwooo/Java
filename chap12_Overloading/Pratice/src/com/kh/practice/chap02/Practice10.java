package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice10 {
/*
 사용자로부터 입력 받은 숫자의 단을 출력 
 * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();
        
        System.out.println(num + "단:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        
    }
}

package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice8 {
	/*
	 사용자로부터 입력 받은 숫자의 단을 출력하세요
	 * */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("단 입력하세요.");
       int num = sc.nextInt();
       
       System.out.println(num + "단");//키보드로 입력한 숫자가 들어가게 함
       for(int i = 1; i <= 9; i++) { //1 2 3 4 5 6 7 8 9
    	   int result = num * i;
    	   System.out.println(i + "일 때 " + result);
    	   
       }
    }
}





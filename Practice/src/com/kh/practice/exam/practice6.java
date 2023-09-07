package com.kh.practice.exam;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num < 1) {//만일 1미만의 숫자가 입력되거나, 입력한 수는 1보다 크거나 같아야한다.
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}

}

package com.kh.practice.exam;

import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("첫번째 숫자를 입력하세요");
			int start = sc.nextInt();
			System.out.println("두번째 숫자를 입력하세요");
			int end =sc.nextInt();
			
			int start1 = Math.min(start, end);
			//start에는 둘 중 상대적으로 더 작은값이 들어간다.
			int end2 = Math.max(start, end);
			//end 에는 둘 중 상대적으로 더 큰 값이 들어간다.
		
			
			for (int i = start1; i <= end2; i++) {
				System.out.println(i);
			}
			
			//Math 자바에 내장 클래스
			//min (가장 작은 값) 주어진 두개의 숫자 중에서 더 작은 값을 반환 
			//max (가장 큰 값) 주어진 두개의 숫자 중에서 더 큰 값을 반환
		/*	int a = 5;
			int b = 8;
			int minValue = Math.min(a, b); //minVaule = 5가 저장됨
			System.out.println("minValue : " + minValue );
			int maxValue = Math.max(a, b); //maxVaule = 8가 저장됨
			System.out.println("maxValue : " + maxValue);
		*/
		/*
			int reStart = end; //end가 start보다 작을 때 reStart로 넣어준다
			int reEnd = start; //start가 end보다 클 때 reEnd로 넣어준다.
			System.out.println(start + "부터" + end +"까지 숫자");
			if (start < end) {
				
			for (int i = start; i <= end; i++) {
				System.out.println(i);
			  }
			} else if (reStart < reEnd) {
				System.out.println(start + "부터" + end +"까지 숫자");
			}
				for(int i = reStart; i <= reEnd; i++) {
					System.out.println(i);
		 }
					
		if(start < end) {
			 reStart = start;
			 reEnd = end;
		} else if (end < start) {
			reStart =end;
			reEnd = start;
		}
		for  (int i = reStart; i <= reEnd; i++) {
			System.out.println(i);
		}
		 */
	
	
	
	
	
	
	}

}

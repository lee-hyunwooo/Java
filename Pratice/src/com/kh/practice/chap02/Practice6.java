package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice6 {

    /*
     사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
    
    ex.
		첫 번째 숫자 : 8 첫 번째 숫자 : 4 첫 번째 숫자 : 9
		두 번째 숫자 : 4 두 번째 숫자 : 8 두 번째 숫자 : 0
		4 5 6 7 8 4 5 6 7 8
    */
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.print("첫 번째 숫자를 입력하세요: ");
	    int firstNumber = sc.nextInt();
	    
	    System.out.print("두 번째 숫자를 입력하세요: ");
	    int secondNumber = sc.nextInt();
		
	    int start = Math.min(firstNumber, secondNumber);
	    //start에는 둘 중 상대적으로 더 작은값이 들어간다
	    int end = Math.max(firstNumber, secondNumber);
	    //end에는 둘 중 상대적으로 더 큰값이 들어간다.
	    
	    for(int i = start; i <=end; i++) {
	    	System.out.println(i);
	    }

	        System.out.print("첫 번째 숫자를 입력하세요: ");
	       // int firstNumber = scanner.nextInt();
	        
	        System.out.print("두 번째 숫자를 입력하세요: ");
	      //  int secondNumber = scanner.nextInt();
	        
	        
	    	int reStart = end; //end가 start보다 작을 때 restart로 넣어준다
	    	int reEnd = start; //start가 end보다 클 때 reEnd로 넣어준다.
	    	
	    	if (start < end) {
	    		System.out.println(start + " 부터 "+ end + "까지 숫자");
	        	for (int i = start; i <= end; i++ ) {
	        		System.out.println(i);
	        	}
	    	} else if (reStart <reEnd) {
	    		System.out.println(reStart + " 부터 "+ reEnd + "까지 숫자");
	    		for (int i = reStart; i <= reEnd; i++ ) {
	        		System.out.println(i);
	    		}
	    	}
	    	
	    	if(start < end) { //마지막 출력이 첫출력보다 클 
	    		reStart = start;
	    		reEnd = end;
	    	} else if (end < start) {
	    		reStart = end;
	    		reEnd = start;
	    	}
	    	//int reStart, reEnd;
	    	for (int i = reStart; i <= reEnd; i++ ) {
	    		System.out.println(i);
			}
    }
}


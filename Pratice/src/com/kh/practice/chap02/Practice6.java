package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice6 {

    /*
     ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
    
    ex.
		ù ��° ���� : 8 ù ��° ���� : 4 ù ��° ���� : 9
		�� ��° ���� : 4 �� ��° ���� : 8 �� ��° ���� : 0
		4 5 6 7 8 4 5 6 7 8
    */
	
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
	    int firstNumber = sc.nextInt();
	    
	    System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
	    int secondNumber = sc.nextInt();
		
	    int start = Math.min(firstNumber, secondNumber);
	    //start���� �� �� ��������� �� �������� ����
	    int end = Math.max(firstNumber, secondNumber);
	    //end���� �� �� ��������� �� ū���� ����.
	    
	    for(int i = start; i <=end; i++) {
	    	System.out.println(i);
	    }

	        System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
	       // int firstNumber = scanner.nextInt();
	        
	        System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
	      //  int secondNumber = scanner.nextInt();
	        
	        
	    	int reStart = end; //end�� start���� ���� �� restart�� �־��ش�
	    	int reEnd = start; //start�� end���� Ŭ �� reEnd�� �־��ش�.
	    	
	    	if (start < end) {
	    		System.out.println(start + " ���� "+ end + "���� ����");
	        	for (int i = start; i <= end; i++ ) {
	        		System.out.println(i);
	        	}
	    	} else if (reStart <reEnd) {
	    		System.out.println(reStart + " ���� "+ reEnd + "���� ����");
	    		for (int i = reStart; i <= reEnd; i++ ) {
	        		System.out.println(i);
	    		}
	    	}
	    	
	    	if(start < end) { //������ ����� ù��º��� Ŭ 
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


package com.kh.arrayListSample;

public class ArrayList04 {

	public static void main(String[] args) {
		//문자열 배열을 사용해서 향상된 for loop로 문자열 배열의 요소중  가장 긴 문자열을 찾아 출력
		
		String[] ss = {"apple", "banana", "cherry", "elderBerry"};
		String longss = "";
		//가장 긴 문자열 찾아서 출력하자
	
	for(String str : ss) {
		//str.length 
		if (str.length()>longss.length()) {
			longss = str;  
		}
	}
	System.out.println("가장 긴 문자열은 : " + longss);

	}
	
}

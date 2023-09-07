package com.kh.practice10.func;

public class Practice10 {

	public static void main(String[] args) {
		//주민번호 뒷자리 성별이후 *표시 처리하기
		//1.주민번호 만들기
		String jumin = "123456-1234567";//14자리
		
		//2.성별자리 이후 별표 만들기
		String makestar = "*";
		
		//주민번호 성별자리 이후부터 *로 가리고 출력
		//to char Array를 사용해서 String -> char Array로 변경
		char[] juminStar = jumin.toCharArray();
		//{'1','2','3','4','5','6','-','1','2','3','4,'5','6','7'}
		for(int a = 8; a <= 13; a++) {//인덱스(자리값) 값은 0부터 시작한다.
			juminStar[a] = '*';
			
		}	
		System.out.println(juminStar);
	}

}

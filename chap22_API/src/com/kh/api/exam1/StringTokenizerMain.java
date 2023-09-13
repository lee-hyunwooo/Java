package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer 클래스 : 문자열을 분리하는데 사용
 						주어진 구분자(기본:공백)를 기준으로 문자열을 토큰으로 분리
 */
	public static void main(String[] args) {
		 StringTokenizerMain stm = new StringTokenizerMain();
		 //stm.STExame();
		 stm.stExam2();
		}
	public void STExam() {
		String text = "apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);

		//hasMoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
	public void stExam2() {
		String text = "apple, banana, grape, orange";
		StringTokenizer tokenizer = new StringTokenizer(text,",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
					System.out.println(fruit);
		}
	}
		public void stExam3() {
			//- 구분자를 사용해서 text 만들고  - 구분자로 끊어서 출력하기
			String text1 = "apple-banana-grape-orange";
			StringTokenizer tokenizer1 = new StringTokenizer(text1,"-");
			
			while(tokenizer1.hasMoreTokens()) {
				String fruit1 = tokenizer1.nextToken();
					System.out.println(fruit1);
			}
		}
	
}

package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer Ŭ���� : ���ڿ��� �и��ϴµ� ���
 						�־��� ������(�⺻:����)�� �������� ���ڿ��� ��ū���� �и�
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
			//- �����ڸ� ����ؼ� text �����  - �����ڷ� ��� ����ϱ�
			String text1 = "apple-banana-grape-orange";
			StringTokenizer tokenizer1 = new StringTokenizer(text1,"-");
			
			while(tokenizer1.hasMoreTokens()) {
				String fruit1 = tokenizer1.nextToken();
					System.out.println(fruit1);
			}
		}
	
}

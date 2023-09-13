package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceMain rm = new ReplaceMain();
		rm.replaceAll();
	}
	public void replace1() {
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-","");
		System.out.println("input2 : " + input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		//world를 Java로 교체
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}
	
	public void replace3() {
		String originName = "Hello world";
		// o로 적혀있는 문자열들 x로 변경하기
		String reorginName = originName.replace("o","x");
		System.out.println(reorginName);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jups overthe lazy dog";
		//fox를 cat으로 바꾸기
		String reoriginString = originString.replace("fox", "cat");
		System.out.println(reoriginString);
		
	}
	
	public void replace5() {
		String originString = "The quick brown fox jups overthe lazy dog";
		//모든 공백 제거하기
		String reoriginString = originString.replace(" ", "");
		System.out.println(reoriginString);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		//replace 대신 replaceAll 을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)world", "Java");
		System.out.println(reAllstr);
	}
	
	
}

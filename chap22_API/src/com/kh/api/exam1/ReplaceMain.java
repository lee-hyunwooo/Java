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
		//world�� Java�� ��ü
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}
	
	public void replace3() {
		String originName = "Hello world";
		// o�� �����ִ� ���ڿ��� x�� �����ϱ�
		String reorginName = originName.replace("o","x");
		System.out.println(reorginName);
	}
	
	public void replace4() {
		String originString = "The quick brown fox jups overthe lazy dog";
		//fox�� cat���� �ٲٱ�
		String reoriginString = originString.replace("fox", "cat");
		System.out.println(reoriginString);
		
	}
	
	public void replace5() {
		String originString = "The quick brown fox jups overthe lazy dog";
		//��� ���� �����ϱ�
		String reoriginString = originString.replace(" ", "");
		System.out.println(reoriginString);
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		//replace ��� replaceAll �� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)world", "Java");
		System.out.println(reAllstr);
	}
	
	
}

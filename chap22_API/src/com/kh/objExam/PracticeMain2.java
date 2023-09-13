package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pt = new PracticeMain2();
		
		pt.practice4();
		
	}
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ");//Àú³áÀ» ¹¹¸ÔÁö
		sb.append("Àú³áÀ» ");
		sb.append("¹¹¸ÔÁö");
		System.out.println(sb);
	}
	
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â reverse
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		System.out.println(str1);
	}
	
	public void practice3() {
		//¹®ÀÚ¿­ »ğÀÔ insert ? ¤¾¤¾
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer str1 = new StringBuffer(str);
		str1.insert(10, "? ¤¾¤¾");
		System.out.println(str1);
	}
	
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(,,);
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer str1 = new StringBuffer(str);
		str1.replace(3,5,"Á¡½É");
		System.out.println(str1);
	}
	
	public void practice5() {
		//¹®ÀÚ¿­ »èÁ¦ delete(,,);
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		StringBuffer str1 = new StringBuffer(str);
		str1.delete(0,3);
		System.out.println(str1);
	}
	
	
	
}	

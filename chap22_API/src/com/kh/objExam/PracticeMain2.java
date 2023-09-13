package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pt = new PracticeMain2();
		
		pt.practice5();
		
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
		StringBuffer str = new StringBuffer();
		str.append("¿À´Ã Àú³áÀ» ¹¹¸ÔÁö");
		str.reverse();
		System.out.println(str);
	}
	
	public void practice3() {
		//¹®ÀÚ¿­ »ğÀÔ insert ? ¤¾¤¾
		StringBuffer str = new StringBuffer();
		str.append("¿À´Ã Àú³áÀ» ¹¹¸ÔÁö");
		str.insert(10, "¤¾¤¾");
		System.out.println(str);
		
	}
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(,,);
		StringBuffer str = new StringBuffer();
		str.append("¿À´Ã Àú³áÀ» ¹¹¸ÔÁö");
		str.replace(3,5,"Á¡½É");
		System.out.println(str);
	}
	
	public void practice5() {
		//¹®ÀÚ¿­ »èÁ¦ delete(,,);
		StringBuffer str = new StringBuffer();
		str.append("¿À´Ã Àú³áÀ» ¹¹¸ÔÁö");
		str.delete(0,3);
		System.out.println(str);
	}
	
}	

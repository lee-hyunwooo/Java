package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		pm.practice2();
	}
	Date currentDate = new Date();
	public void practice1() {
		//년월일 yyy-MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 된 날짜" + forDate);
	}

	public void practice2() {
		//시분초 HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("a:HH:mm:ss");//
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 된 시간" + forDate);
		
	}
	
	public void practice3() {
		//월일 MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 날짜" + forDate);
		
	}
	
	public void practice4() {
		//연도-시간 yyyy-HH
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 연도와 시간" + forDate);
	}
	
	public void practice5() {
		// 년-월-일 요일 yyyy-MM-dd (E)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E)");
		String forDate = sdf.format(currentDate);
		System.out.println("포멧팅 날짜와 요일" + forDate);
	}
}

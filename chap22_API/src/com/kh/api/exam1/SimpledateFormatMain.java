package com.kh.api.exam1;



import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpledateFormatMain {
/*
 SimpleDateFormat 
 	날짜와 시간을 원하는 형식으로 포멧팅 하거나 문자열로부터 날짜와 시간을 파싱하는데 사용되는 클래스
 	
 	yyyy-MM-dd HH:mm:ss
 	y : 연도
 	M : 월
 	d : 일
 	H : 24시간 형식의 시간
 	m : 분
 	s : 초
 	a : 시간앞에 붙일 시 오전/오후를 표시해줌
   (E): 요일
 */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//포멧팅 
		String forDate = sdf.format(currentDate);
		
		//결과출력
		System.out.println("포멧팅 된 날짜 및 시간 : " + forDate);
	}

}

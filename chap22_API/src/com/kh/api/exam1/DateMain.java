package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : 날짜와 시간 정보를 나타내는데 사용
 		java1.1 이후 권장되지 않음
 			java.time 패키지 LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
		//import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜 시간 : " + currentDateTime);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + futureDate);
		
		//minus plus 이용해서 각각 2개씩 만들어보기 총 4개
		
		LocalDate futureWeek = today.plusWeeks(3);
		System.out.println("3주 후 날짜 : " + futureWeek);
		LocalDate futureyear = today.plusYears(2);
		System.out.println("2년 후 날짜 : " + futureyear);
	
		LocalDate minusmonth = today.minusMonths(5);
		System.out.println("5달 전 날짜 : " + minusmonth);
		
		LocalDateTime day = LocalDateTime.now();
		LocalDateTime minusday = day.minusDays(3);
		System.out.println("3일 전 날짜와 시간 : " + minusday);
		
		LocalTime nowTime = LocalTime.now();
		LocalTime laterTime = nowTime.plusHours(3);
		System.out.println("3시간 후 시간 : " + laterTime);
		
		
		//특정 날짜와 시간 생성하기
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 20);
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		if(date1.isBefore(date2)) {
			System.out.println(date1 + " 은 " + date2 + "이전입니다.");
		} else if (date1.isAfter(date1)) {
			System.out.println(date1 + " 은 " + date1 + "같은 날짜입니다.");
		} else {
			System.out.println(date2 + " 은 " + date1 + "이후입니다.");
		}
		
	}

}

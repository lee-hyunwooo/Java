package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*
 Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
 		java1.1 ���� ������� ����
 			java.time ��Ű�� LocalDate LocalTime LocalDateTime
 */
	public static void main(String[] args) {
		//import java.time.LocalDate;
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("���� ��¥ �ð� : " + currentDateTime);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);
		
		//minus plus �̿��ؼ� ���� 2���� ������ �� 4��
		
		LocalDate futureWeek = today.plusWeeks(3);
		System.out.println("3�� �� ��¥ : " + futureWeek);
		LocalDate futureyear = today.plusYears(2);
		System.out.println("2�� �� ��¥ : " + futureyear);
	
		LocalDate minusmonth = today.minusMonths(5);
		System.out.println("5�� �� ��¥ : " + minusmonth);
		
		LocalDateTime day = LocalDateTime.now();
		LocalDateTime minusday = day.minusDays(3);
		System.out.println("3�� �� ��¥�� �ð� : " + minusday);
		
		
	}

}

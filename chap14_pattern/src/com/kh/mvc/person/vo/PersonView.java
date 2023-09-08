package com.kh.mvc.person.vo;

public class PersonView {
	
	public void displayInfo(String personName, int personAge) {
		System.out.println("사람 정보");
		System.out.println("이름 : " + personName);
		System.out.println("나이 : " + personAge);
	}
	
}

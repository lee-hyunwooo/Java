package com.kh.pattern.mvc.model;

public class StudentModel {
	/* 1. 유저 정보 표현
	  	private 이름 나이
	  	getter setter 만들기
	 */
	private String name;//학생이름
	private int age;//학생의 나이

	public StudentModel(String name, int age) {
		this.name =name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

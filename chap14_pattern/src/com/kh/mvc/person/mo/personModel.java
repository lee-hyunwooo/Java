package com.kh.mvc.person.mo;

public class personModel {
	private String name; //사람 이름
	
	private int age; //학생 나이
	
	public personModel(String name, int age) {
		this.name = name;
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

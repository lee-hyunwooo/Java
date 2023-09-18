package com.kh.practice;
//ComparExam -> User Student actor rename
//implement Compare
//
public class User implements Comparable<User> {

	private String name;
	private int age;
	
	public User(String name, int age) {
	this.name = name;
	this.age = age;
	}
	
	@Override
	public int compareTo(User otherUser) {
		
		return this.age -otherUser.age;
	}
	
	@Override
	public String toString() {
		return "USer : " +  name + ", age : " + age;
	}

}

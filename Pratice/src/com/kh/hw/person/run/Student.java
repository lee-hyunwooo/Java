package com.kh.hw.person.run;

public class Student extends Person{
	private String major;
	private int grade;
	
	public Student() {
	
	}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age,height,weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}

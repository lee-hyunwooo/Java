package com.kh.example.practice1.model.vo;

public class Member {
	//1.멤버변수
	String memberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;// int String 차이점
	String email;
//            2.생성자           //
	//public Member(char gender)
	//this.gender = gender;
public Member() {
   }	

public void changeName(String memberName) {
   this.memberName = memberName;
}
	public void printName() {
		System.out.println("이름 : " + memberName);
	}
}
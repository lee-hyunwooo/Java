package com.kh.example.practice1.model.vo;

public class Member {
	//1.�������
	String memberId;
	String memberPwd;
	String memberName;
	int age;
	char gender;
	String phone;// int String ������
	String email;
//            2.������           //
	//public Member(char gender)
	//this.gender = gender;
public Member() {
   }	

public void changeName(String memberName) {
   this.memberName = memberName;
}
	public void printName() {
		System.out.println("�̸� : " + memberName);
	}
}
package com.kh.example.practice4.model.vo;

public class Student {
	/*
	
	+ Student()
	+ information() : void
	*/
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//�ʱ�ȭ ���� �̿��� �� �ʵ带 �ʱ�ȭ �ʱ�ȭ ��{}
	public Student() {
		{
		grade = 1;//grade 1�� �ʱ�ȭ
		classroom = 2;//classroom 2�� �ʱ�ȭ
		name = "�ڼ�ö"; //name �̸� �ʱ�ȭ
		height = 180.5;//Ű �ʱ�ȭ
		gender = '��';//���� '��'���� �ʱ�ȭ
		}
	}
	public void information() {
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classroom);
		System.out.println("�̸� : " + name);
		System.out.println("Ű : " + height);
		System.out.println("���� : " + gender);
	}
	
}

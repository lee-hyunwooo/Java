package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// �л��� ��ü ����
		Student student1 = new Student("������", 27, "1�г�");
		// �л� ���� ���
		student1.displayInfo();
		//Student(class)�� �ִ� displayInfo()ī�װ����� �����ͼ� ���
	//�л��� 3�� ���� 3�� ����ϱ�
		//student2, student3, student4
		//������ �̸��� ���̿� �г��� displayinfo();�� ����ؼ� ����ϼ���.
		
		Student student2 = new Student("��", 27, "2�г�");
		Student student3 = new Student("��", 28, "3�г�");
		Student student4 = new Student("��", 29, "4�г�");
		
		student2.displayInfo();//������ ���� student2�� displayInfo�� ���뿡 �����Ͽ� ���
		student3.displayInfo();
		student4.displayInfo();
	}

}

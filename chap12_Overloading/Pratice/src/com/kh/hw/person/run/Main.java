package com.kh.hw.person.run;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		Employee employee[] = new Employee[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==�����Դϴ�.==");
		students[0] = new Student("������",20,170.0,55,1,"���������а�");
		
		for(Student student : students) {
			System.out.println(student.information());
		}
		
		//while �̿��ؼ� �ݺ����ǻ��
		char ch;
		String name,dept;
		int age, salary,count=0;
		double height,weight;
		while(true) {
			System.out.print("1/6 �̸�:");
			name = sc.nextLine();
			
			System.out.print("2/6 ����:");
			age = sc.nextInt();
			
			System.out.print("3/6  Ű:");
			height = sc.nextDouble();
			
			System.out.print("4/6 ������");
			weight = sc.nextDouble();
			
			System.out.print("5/6 �޿�");
			salary = sc.nextInt();
			
			System.out.print("6/6 �μ�");
			dept = sc.nextLine();
			employee[count] = new Employee(name, age, height,weight,salary, dept);
			count++;
			System.out.println("��� �Է��Ͻðڽ��ϱ� ? (y/n) : ");
			ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'N') {
				break;
			}
		}
		for (int i = 0; i < count; i++) {
			System.out.println(employee[i].information());
		}
	}

}

package com.kh.classSample;

public class Car {
	//1. ���� �ʵ� �������
	String brand; 	  //�귣��
	String model; 	  //��
	int speed;	  	  //�ӵ�
	boolean engineOn; //���� ����
	/**************************************
	������� �ؿ��� ��� �޼���� ����
	*/
	//2. �����ڴ� �޼����� �Ѱ��� ����
	// ���� �� �� �ʼ��� ���� �Ķ���ʹ� ����� ��
	public Car(String brand, String model) {
		this.brand = brand;//���� (brand)������ ���ڴ�.
		this.model = model;//(brand)���� �پ��� �𵨸� ���ڴ�.
		this.speed = 50;
		this.engineOn = true;
		System.out.println("Car ����");
	}
	
	// ���� ���� �޼���
	public void startEngine() { //
		//���࿡ ������ true�� ���� �õ�
		System.out.println("������" + brand + "�Դϴ�.");
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");//��� �޼��� �ۼ�
		} else {//���࿡ ������ false�� �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
		
	}
	//���� �޼���
	public void acclerate(int amount) {
		if(engineOn) {
			//������ ture�� ���� �ӵ��� �󸶴�.

			System.out.println("�ӵ�" + speed + "�Դϴ�.");
		} else {
			System.out.println("�ӵ��� �� �� ����");
		}
		//������ false�� ������ ���� �־� �ӵ��� �� �� ����.
		
				
	}
	
}

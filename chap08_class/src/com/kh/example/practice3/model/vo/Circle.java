package com.kh.example.practice3.model.vo;

public class Circle {
	//�ʵ�(�������)
	double Pi = 3.14;//������
	int radius = 1; //������
	
	
	//������
	public Circle() {
		//�⺻ ������, �ƹ��� �ʱ�ȭ�� �������� �ʴ´�.
	}  
	public double getPi() {
		return Pi;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setPi(double pi) {
		Pi = pi;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	} 
	
	public void incrementRadius() {
		radius++;
		System.out.println(radius +radius);
	}
	public void getAreaOfCircle() {
		double area = Pi * radius * radius; 
		System.out.println("area : " + area);
	}
	public void getSizeOfCircle() {
		System.out.println("���� ������ : " + radius);
		
	}
}

package com.kh.example.practice3.model.vo;

public class Circle {
	//필드(멤버변수)
	double Pi = 3.14;//원주율
	int radius = 1; //반지름
	
	
	//생성자
	public Circle() {
		//기본 생성자, 아무런 초기화를 진행하지 않는다.
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
		System.out.println("원의 반지름 : " + radius);
		
	}
}

package com.kh.example.practice2.model.vo;

public class Product {
	//멤버변수
	private String pName;
	private int price;
	private String brand;
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	public void information() {
		System.out.println("상품 이름  :" + pName);
		System.out.println("상품 가격  :" + price + "원");
		System.out.println("상품 브랜드 : " + brand);
	}
}

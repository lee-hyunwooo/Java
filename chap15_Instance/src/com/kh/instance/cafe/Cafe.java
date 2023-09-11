package com.kh.instance.cafe;

public class Cafe {
	private String type;
	private int size;
	private boolean isSugar;
	
	public Cafe(String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	
	public void coffee() {
		System.out.println(type + "를 만듭니다.");
		System.out.println("크기" + size);
		if (isSugar) {
			System.out.println("설탕을 추가합니다");
		}
		
	}
}

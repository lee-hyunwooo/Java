package com.kh.genericsMain;

//제너릭 클래스 정의	
//T Type의 약자 t 대신 다른것도 가능
public class Book<T> {
	T content;
	
	public void put(T item) {
		this.content=item;
	}
	
	public T get() {
		return content;
	}
	
}

package com.kh.genericspractice;

public class Box<T> {
	T content;
	
	public void add(T item) {
		this.content=item;
	}
	
	public T get() {
		return content;
	}
}

package com.kh.genericsMain;

//���ʸ� Ŭ���� ����	
//T Type�� ���� t ��� �ٸ��͵� ����
public class Book<T> {
	T content;
	
	public void put(T item) {
		this.content=item;
	}
	
	public T get() {
		return content;
	}
	
}

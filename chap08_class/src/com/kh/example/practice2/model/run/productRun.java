package com.kh.example.practice2.model.run;

import com.kh.example.practice2.model.vo.Product;

public class productRun {

	public static void main(String[] args) {
		System.out.println("��ǰ����");
		
		Product product1 = new Product("���", 1000, "�Ե�");
		Product product2 = new Product("����", 1500, "���");
		Product product3 = new Product("���̽�ũ��", 2000, "�Ե�");
		product1.information();
		product2.information();
		product3.information();
	}

}

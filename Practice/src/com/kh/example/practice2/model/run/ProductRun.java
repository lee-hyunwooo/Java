package com.kh.example.practice2.model.run;

//import�� ���� 1ȸ�� �ۼ�
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// Product ���� 3�� �ϰ�, ���� ��ǰ�� ���� �귣��� ���
		System.out.println("Product ���� : " );
		Product product1 = new Product("���", 1000, "�Ե�");
		Product product2 = new Product("����", 1500, "���");
		Product product3 = new Product("���̽�ũ��", 2000, "�Ե�");
		product1.information();
		product2.information();
		product3.information();

	}

}

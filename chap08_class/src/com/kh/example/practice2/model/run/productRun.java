package com.kh.example.practice2.model.run;

import com.kh.example.practice2.model.vo.Product;

public class productRun {

	public static void main(String[] args) {
		System.out.println("상품정보");
		
		Product product1 = new Product("라면", 1000, "롯데");
		Product product2 = new Product("과자", 1500, "농심");
		Product product3 = new Product("아이스크림", 2000, "롯데");
		product1.information();
		product2.information();
		product3.information();
	}

}

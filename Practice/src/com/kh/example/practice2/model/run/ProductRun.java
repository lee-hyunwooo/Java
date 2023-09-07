package com.kh.example.practice2.model.run;

//import는 최초 1회만 작성
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// Product 생성 3개 하고, 각각 상품명 가격 브랜드명 출력
		System.out.println("Product 정보 : " );
		Product product1 = new Product("라면", 1000, "롯데");
		Product product2 = new Product("과자", 1500, "농심");
		Product product3 = new Product("아이스크림", 2000, "롯데");
		product1.information();
		product2.information();
		product3.information();

	}

}

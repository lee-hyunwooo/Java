package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		//1부터 100까지 합 구하기
		int sum = 0;// 최종 합
		int num = 1;
		
		while(num <=3) {//true
			System.out.println("num 은 : " + num);
			sum += num;
		// 	sum += 1
			num = num +1;
			
			//System.out.println("sum 은 : " +1);
			//sum 합계를 주기적으로 보고 싶다면 while문 안에 작성하기
			
		}
		System.out.println("sum 은 : " + sum);
	
	//while이 종료되었다고해서 클래스가 종료된 것은 아님
	//while문이 종료된 후 남아있는는 System.out.println(sum)이 출력됨
	}
	

}

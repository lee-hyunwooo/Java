package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		//1���� 100���� �� ���ϱ�
		int sum = 0;// ���� ��
		int num = 1;
		
		while(num <=3) {//true
			System.out.println("num �� : " + num);
			sum += num;
		// 	sum += 1
			num = num +1;
			
			//System.out.println("sum �� : " +1);
			//sum �հ踦 �ֱ������� ���� �ʹٸ� while�� �ȿ� �ۼ��ϱ�
			
		}
		System.out.println("sum �� : " + sum);
	
	//while�� ����Ǿ��ٰ��ؼ� Ŭ������ ����� ���� �ƴ�
	//while���� ����� �� �����ִ´� System.out.println(sum)�� ��µ�
	}
	

}

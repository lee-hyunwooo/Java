package com.kh.staticVar;

public class StudentMain {
	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStuedentName("kh�л�1");
		System.out.println(stKim.serialNum);
		stKim.serialNum++;
		//�츮 ���� ����å 11�� ĭ
		//�츮 ���� ����å 2��° 11�� ĭ
		
		StaticVar khLee = new StaticVar();
		khLee.setStuedentName("����å 1");
		System.out.println("kh stKim : ");
		System.out.println(stKim.serialNum);
		System.out.println("����å 2 : ");
		System.out.println(khLee.serialNum);
		
		
	}
}

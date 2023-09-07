package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		//1. �ڵ�����ȯ(�Ͻ�������ȯ, ����������ȯ)
		int intNum = 100;
		System.out.println(intNum);//���� 100�� �ǹ�
		long longNum = intNum;//int�� long�� �ڵ� ����ȯ
		System.out.println(longNum);
		
		
		float floatNum = 3.14f;
		double doubleNum = floatNum;// float�� double�� �ڵ� ����ȯ
		System.out.println(doubleNum);
		
		//int -> long �����ϴ� ����ȯ 2���� ����� ����ϱ�
		int intNum1 = 100;
		System.out.print("intNum1 : ");
		System.out.println(intNum1);
		long longNum1 = intNum;
		System.out.println(longNum1);
		
		int intNum2 = 200;
		System.out.print("intNum2 : ");
		System.out.println(intNum2);
		long longNum2 = intNum2;
		System.out.println(longNum2);
		
		//short -> int �����ϴ� ����ȯ 1���� ����� ����ϱ�
		short shortNum1 = 100;
		System.out.print("shortNum1 : ");
		System.out.println(shortNum1);
		int intNum3 = shortNum1;
		System.out.println(intNum3);
		
		
		//float -> double �����ϴ� ����ȯ 1���� ����� ����ϱ�
		float floatNum1 = 3.13f;
		System.out.print("floatNum1 : ");
		System.out.println(floatNum1);
		double doubleNum2 = floatNum1;
		System.out.println(doubleNum2);
		
		//2. ����� ����ȯ(���� ����ȯ)
		
		//long -> int
		long largeLong = 12345L;
		System.out.print("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt); //long�� int�� ���� ����ȯ �� ��� ���� �����ȿ� ���� ������ �Ϻ� �����ʹ� �սǵȴ�.
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //�Ǽ��� int�� ���� ����ȯ �� �� (���� �κи� �����ȴ�.)
		
		//���ڿ� ���ڰ��� ����ȯ 2�� ���
		//���ڴ� char charBlaue = 'Z'; -> int�� ����
		char charBlaue1 = 'Z';
		System.out.print("charBlaue1 : ");
		System.out.println(charBlaue1);
		int int1 = charBlaue1;
		System.out.println(int1);
		
		char charBlaue2 = 'A';
		System.out.print("charBlaue2 : ");
		System.out.println(charBlaue2);
		int int2 = charBlaue2;
		System.out.println(int2);
		
		
		//double ->int�� ����ȯ ��� 1��
		double double1 = 987.654321;
		System.out.print("double1 : ");
		System.out.println(double1);
		int int3 =(int) double1;
		System.out.println(int3);
		
		//int�� short�� ����ȯ 1�� ���
		int int4 = 123456789;
		System.out.print("int4 : ");
		System.out.println(int4);
		short short3 =(short) int4;
		System.out.println(short3);
		
		
		
	}
}

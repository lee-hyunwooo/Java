package com.kh.practice3.userScanner;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		// ����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� �����Ѵ���,
		// ���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ���
		
		//���� �Է¹޴� scanner �����
		Scanner sc = new Scanner(System.in);
		System.out.println("5���� ������ �Է��ϼ���.");
		
		//�迭���ٰ� 5���� ������ �Է��ϴ� for��
		//�ε��� 0���� �����ؼ� �ϳ��� ����;0����~(5-1)���� ����ְ���;�ϳ��� �������Ѽ�
		int[] numbers = new int[5];
		for(int i = 0; i <= 4; i++) {
			System.out.println("���� index " + (i)+ " : ");
			//System.out.println("���� �ڸ��� " + (i+1)+ " : ");
			numbers[i] = sc.nextInt();
			//ArrayList ��� colors.get(0)
			//�迭��[] �ȿ� ����
			/*
			  �ٵ� �迭�� �ڸ��� ����? �迭�� �ڸ����� �������߰ڴ�
			  ���?
			  �ٱ����ٰ� int numbers �� �迭�� �������߰ڴ�
			  for�� �������� ��ü���� ��ٱ��ϸ� ������
			 */
			
			
			
		}
		//�迭�� ��� ��Ҹ� ���� ��� ���
		//������ �������� ���ϴ� ���̱� ������ ���� for�� ���
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		//�ջ�� ��� ���
		System.out.println("�迭�� ��� ��Ҹ� ���� ��� : " + sum);
			
		
		//�Ǵ� �⺻for���� ����ϰ� �ʹٸ� length�� �̿��ؼ� ��� ����
		
		
	}

}

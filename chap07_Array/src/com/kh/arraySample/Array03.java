package com.kh.arraySample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 1.���ڿ��� �Է¹޾�
		 2.���� �ϳ��ϳ� �迭�� �ְ�
		 3.�˻��� ���� scanner
		 4.���ڿ��� �� �� �� �ִ��� ������
		 5.�� ��° �ε����� ��ġ�ϴ���
		 6.�ε��� ����ϱ�
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���");//���ڿ��� �Է�
		String inputString = sc.next();
		//2. ���� �ϳ��ϳ� �迭�� �ִ´�
		//String �ȿ� �ִ� ���ڵ��� �迭�� ��´�.
		//char�� ���ڸ� ���� ���� ���ڵ��� �迭�� �ִ´�.
		//String �ȿ� char�迭�� ������ش� ->toCharArrey
		//ex) String �ȳ��ϼ��� = {'��' '��' '��' '��' '��'}
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.");//�˻��� ����
		char searchChar = sc.next().charAt(0); //ù����
		
		//���ڿ��� -> ���ڷ� ��ȯ
		//toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ����
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length;
		System.out.println("���ڿ� ���� üũ : " +charCount);
		
		
		//���ڿ��� �� �� �� �ִ��� ���� -> length
		//�� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� -> �ε��� ���
		//�� ���̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		int count = 0;//�˻��� ���� ���� ī��Ʈ
		System.out.println(inputString + " �� " + searchChar + "�� �����ϴ� ��ġ(�ε���)");
		//�ݺ����� ����ؼ� ��ġ ã��
		for (int i = 0; i < charCount; i++) {
		//���࿡ ���� �� ���ڸ� �˻������� �� ���ڴ¸� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ�
			if (charString[i] == searchChar) {
				//charString[i] �������� �ƴ϶� i���� �Ǿ�� �ϴ� ������
				//searchChar �츮�� �˻��ؼ� ���ڰ��� �������ֱ� ������ ���� �����Ǿ� �վ����
			//���� �迭�� ���� �˻��� ���ڿ� ��ġ�ϴ���
			   System.out.println(i);
			   count++;
			}
			
			
			
		}
		
	}

}

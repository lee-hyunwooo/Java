package com.kh.arraySample;

public class Array02 {

	public static void main(String[] args) {
		//1.�迭�� ���̸� ����
	/*	int[] num = new int[10];//���̰� 3�� �迭 ����
		//1~10������ �ݺ����� �̿��ؼ� 
		
		for(int i = 0; i<num.length; i++) {
			num[i] = i +1;
			//System.out.println(num[i]);
		}
		//������� �迭 �ε����� ���� �� �� ���� ���
		
		//�� ���� ���
		for (int i = 1; i < num.length; i++) {
			System.out.println(num[i]);
			// 1~10������ ���� �ݺ����� �̿��ؼ� ���
			//�������� �迭 �ε����� ���� �� �� ���� ����ϱ�
			//��°� : 10 9 8 7 6 5 4 3 2 1
		}
		*/
		int[] numbers =new int[10];//���̰� 10�� �迭�� ����
		//1���� 10���� ���� �������� �迭�� �Ҵ�
		int value = 10;
		//       0       0 < 10             i + 1
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = value--;
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}

		
		//2. ���̰� 5�� String �迭����
		//"���" "��" "����" "������" "����"�� �ʱ�ȭ �� ��
		//�迭 �ε����� Ȱ���ؼ� ���� ����ϱ�
		
		
		String[] fruits = {"���", "��", "����", "������", "����"};
		/*fruits[0] = "���";
	  	  fruits[1] = "��";
	 	  fruits[2] = "����";
		  fruits[3] = "������";
		fruits[4] = "����";
		*/
		System.out.println("�迭 �ε��� 1�� �� : " + fruits[1]);
			
		
	}

}

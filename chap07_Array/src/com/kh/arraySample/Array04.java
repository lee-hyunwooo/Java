package com.kh.arraySample;

public class Array04 {

	public static void main(String[] args) {
		// Array ����
		//                        0       1      2       3      4
		String[] inturnArray = {"��泭","�踻��","ȫ�浿","��ö��","������"};
		
		inturnArray[3] = "���ѳ�";
		System.out.println("��ö�� ��� " + inturnArray[3]);
		
		
		
		//���� String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		//������� �ٳ���
		//���⿡�� ����
		//Ű������ ����
		//�޷п��� ��
		//�ֿ��� ������
		
		// length �� 5�� (1~5)
		// index                 1     2     3     4    5 
		String[] fruitArray = {"���","����","Ű��","�޷�","��"};
		
		fruitArray[0] = "�ٳ���";//������� �ٳ���
		fruitArray[1] = "����";//���⿡�� ����
		fruitArray[2] = "����";//Ű������ ����
		fruitArray[3] = "��";  //�޷п��� ��
		fruitArray[4] = "������";//�ֿ��� ������
	    for (int i = 0; i < fruitArray.length; i++)
		System.out.println(fruitArray[i]); //i ��� ���ڸ� ������ ���ڸ��� �ش��ϴ� ���ڿ� ���
				
				
				
		
		
		
		
		

	}

}

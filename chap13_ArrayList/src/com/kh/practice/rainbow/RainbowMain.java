package com.kh.practice.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		//System.out.println("colors : " + colors);
		
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		colors.add("��");
		//System.out.println("colors : " + colors);
		
		colors.set(1, "��");
		colors.set(3, "����");
		colors.set(4, "�׸�");
		//System.out.println("colors : " + colors);
		colors.add(2,"���ο�");
		/*   1����� ��� ���� ���� //
		colors.remove(3);//���
		System.out.println("�� ���� : " + colors);
		colors.remove(3);//����� ��������Ƿ� ������ 3
		System.out.println("���� ���� : " + colors);
		colors.add(4,"�����Ķ�");
		System.out.println("���� : " + colors);
		*/
		
			//2�����
		colors.add(6, "�����Ķ�");
		//System.out.println("���� : " + colors);
		
		
		for(String AAA : colors) {
			//System.out.println(AAA);
		}

		//1. �ε��� �̿��ؼ� �ڸ����
		colors.set(7, "��");
		//System.out.println("���� ���"+colors.get(0)+ " " +colors.get(7)+" "+colors.get(8));
		
		//2.�ʱ�ȭ �� ���
		colors.clear();
		colors.add("��");
		colors.add("��");
		colors.add("��");
		//System.out.println("���� ���" + colors.get(0)+ colors.get(1) + colors.get(2));
		
	}

}

package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pt = new PracticeMain2();
		
		pt.practice4();
		
	}
	public void practice1() {
		//���ڿ� �� ���̱� ��� append
		StringBuffer sb = new StringBuffer();
		sb.append("���� ");//������ ������
		sb.append("������ ");
		sb.append("������");
		System.out.println(sb);
	}
	
	public void practice2() {
		//���ڿ� ������ reverse
		String str = "���� ������ ������";
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		System.out.println(str1);
	}
	
	public void practice3() {
		//���ڿ� ���� insert ? ����
		String str = "���� ������ ������";
		StringBuffer str1 = new StringBuffer(str);
		str1.insert(10, "? ����");
		System.out.println(str1);
	}
	
	public void practice4() {
		//���ڿ� ��ü replace(,,);
		String str = "���� ������ ������";
		StringBuffer str1 = new StringBuffer(str);
		str1.replace(3,5,"����");
		System.out.println(str1);
	}
	
	public void practice5() {
		//���ڿ� ���� delete(,,);
		String str = "���� ������ ������";
		StringBuffer str1 = new StringBuffer(str);
		str1.delete(0,3);
		System.out.println(str1);
	}
	
	
	
}	

package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pt = new PracticeMain2();
		
		pt.practice5();
		
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
		StringBuffer str = new StringBuffer();
		str.append("���� ������ ������");
		str.reverse();
		System.out.println(str);
	}
	
	public void practice3() {
		//���ڿ� ���� insert ? ����
		StringBuffer str = new StringBuffer();
		str.append("���� ������ ������");
		str.insert(10, "����");
		System.out.println(str);
		
	}
	public void practice4() {
		//���ڿ� ��ü replace(,,);
		StringBuffer str = new StringBuffer();
		str.append("���� ������ ������");
		str.replace(3,5,"����");
		System.out.println(str);
	}
	
	public void practice5() {
		//���ڿ� ���� delete(,,);
		StringBuffer str = new StringBuffer();
		str.append("���� ������ ������");
		str.delete(0,3);
		System.out.println(str);
	}
	
}	

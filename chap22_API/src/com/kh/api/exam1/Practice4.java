package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		pm.practice2();
	}
	Date currentDate = new Date();
	public void practice1() {
		//����� yyy-MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("������ �� ��¥" + forDate);
	}

	public void practice2() {
		//�ú��� HH:mm:ss
		SimpleDateFormat sdf = new SimpleDateFormat("a:HH:mm:ss");//
		String forDate = sdf.format(currentDate);
		System.out.println("������ �� �ð�" + forDate);
		
	}
	
	public void practice3() {
		//���� MM-dd
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println("������ ��¥" + forDate);
		
	}
	
	public void practice4() {
		//����-�ð� yyyy-HH
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println("������ ������ �ð�" + forDate);
	}
	
	public void practice5() {
		// ��-��-�� ���� yyyy-MM-dd (E)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E)");
		String forDate = sdf.format(currentDate);
		System.out.println("������ ��¥�� ����" + forDate);
	}
}

package com.kh.api.exam1;



import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpledateFormatMain {
/*
 SimpleDateFormat 
 	��¥�� �ð��� ���ϴ� �������� ������ �ϰų� ���ڿ��κ��� ��¥�� �ð��� �Ľ��ϴµ� ���Ǵ� Ŭ����
 	
 	yyyy-MM-dd HH:mm:ss
 	y : ����
 	M : ��
 	d : ��
 	H : 24�ð� ������ �ð�
 	m : ��
 	s : ��
 	a : �ð��տ� ���� �� ����/���ĸ� ǥ������
   (E): ����
 */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//������ 
		String forDate = sdf.format(currentDate);
		
		//������
		System.out.println("������ �� ��¥ �� �ð� : " + forDate);
	}

}
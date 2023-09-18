package com.kh.randomMain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Random : ������ �����ϱ� ���� ���Ǵ� Ŭ����
 	���� : �������� ������� ��
 */
public class RandomMain {

	public static void main(String[] args) {
		// �ζ� ��ȣ ������
		RandomMain rm = new RandomMain();
		rm.Lotto();
		
	}
	public void Lotto() {
		Random rd = new Random();//���� ��ü ����
		//ArratList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		//�ߺ��� ���ϱ� ���� Set�� ����� �� ����
		//6 ���ڸ� �� ��
		int six = 6;//�ζ� ��ȣ � ���� ������ ����
		while(lottoNum.size() < six) {//�ε��� 6�ڸ�
			//1 ~ 45 ������ �����ؼ� ���� ����
			int ranNumber = rd.nextInt(45)+1; //0~44�ڸ��� �������� ��ȣ �ϳ�
			lottoNum.add(ranNumber);
			
			//�ߺ��� ���� list�� ����� �� ����
			if(!lottoNum.contains(ranNumber)) {//!�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ���
				lottoNum.add(ranNumber);
			}
		}
		System.out.println("�ζ� ��ȣ " + lottoNum);
		
		
		
	}
	
	public void RandomExam() {
		Random rd = new Random();//���� ��ü ����
		
		//1. ���� ���� ������ ������ ������ �����߰ڴ�.
		int ranInt = rd.nextInt(100);//0~99 ���̿� 1��
		System.out.println(ranInt);
		
		//2. �Ǽ� ���� ������ ������ ������ �����߰ڴ�.
		double ranD = rd.nextDouble();
		System.out.println(ranD);
		
		//3. boolean �� �����Ƿ� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);
	}
}

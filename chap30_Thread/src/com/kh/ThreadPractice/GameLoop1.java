package com.kh.ThreadPractice;

import java.util.Random;

import com.kh.ThreadPractice.PracticeMain;
public class GameLoop1 implements Runnable{
	

	@Override
	public void run() {
		boolean isGameOver = false;
		while(!isGameOver) {
			
			int randomValue = new Random().nextInt(10);
			System.out.println("������ ���� : " + randomValue);
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("������ �����Ϸ��� Enter�� ��������");
		}
	}
}
	
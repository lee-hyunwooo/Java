package com.kh.ThreadPractice;

import java.util.Random;

import com.kh.ThreadPractice.PracticeMain;
public class GameLoop1 implements Runnable{
	

	@Override
	public void run() {
		boolean isGameOver = false;
		while(!isGameOver) {
			
			int randomValue = new Random().nextInt(10);
			System.out.println("임의의 숫자 : " + randomValue);
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("게임을 종료하려면 Enter를 누르세요");
		}
	}
}
	
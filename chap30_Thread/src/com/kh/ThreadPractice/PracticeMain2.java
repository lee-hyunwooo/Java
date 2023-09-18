package com.kh.ThreadPractice;

import java.io.IOException;
import java.util.Random;

public class PracticeMain2 {
	private static boolean isGameOver = false;
	public static void main(String[] args) {
		
		PracticeMain2 s = new PracticeMain2();
		
		Thread gameThread = new Thread(s.new Loop());
		gameThread.start();
	try {
		System.in.read();
		
		isGameOver = true;
	} catch (IOException e) {
		e.printStackTrace();
	}
	}


public class Loop implements Runnable {
	@Override
	public void run() {
		while(!isGameOver) {
			
			int randomValue = new Random().nextInt(10);
			System.out.println("임의의 숫자 : " + randomValue);
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
				System.out.println("게임 종료");
			}
	}
}
}

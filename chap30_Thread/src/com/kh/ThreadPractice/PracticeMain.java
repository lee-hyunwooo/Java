package com.kh.ThreadPractice;

import java.io.IOException;
import com.kh.ThreadPractice.GameLoop1;

public class PracticeMain extends GameLoop1{
	private static boolean isGameOver = false;
	public static void main(String[] args) {
		PracticeMain p = new PracticeMain();
		Thread gameThread = new Thread(new GameLoop1());
		gameThread.start();
		
		try {
			System.in.read();
			
			isGameOver = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


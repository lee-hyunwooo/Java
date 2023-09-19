package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {
	private static boolean isGameOver = false;
	public static void main(String[] args) {
		//�ܺ� Ŭ������ �ν��Ͻ��� ����
		SimpleGame s = new SimpleGame();
		
		// ���� ���� ������ ����
		Thread gameThread = new Thread(s.new Gm());
		gameThread.start();
		
		//���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {//����ڰ� Ű����� �Է��� ����Ʈ�� ����
			 //����ڰ� Enter Ű�� ���� �� ���� ���α׷� �Ͻ� ����
			System.in.read();
			
			isGameOver = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public class Gm implements Runnable {
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);
				System.out.println("������ ���� : " + randomValue);
				
				//���� ���� ���� �ð�
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//���� ���� ����
				//EnterŰ�� ������ ������ ���� �˴ϴ�.
				System.out.println("������ �����Ϸ��� Enter�� ��������.");
			}
		}
	}
	
	
	 public class GameLoop implements Runnable{
		
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);//������ ���� ����
				System.out.println("������ ���� : " + randomValue);
				
				//���� ���� ���� �ð�
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
					System.out.println("���� ����");
				
				
				
			}
		}
		
	}
}
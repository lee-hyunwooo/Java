package com.kh.goodEaxm.game;

public class GameView {
	private String StartMsg = ("���� ���߱� ���� �����մϴ�.");
	private String StartNum = ("1���� 100 ������ ���ڸ� ���纸����!");
	private String Choice = ("������ ���ڸ� �Է��ϼ���.");
	private String Corrcet = ("���ڸ� ������ϴ�");
	private String InCorrcet = ("Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
	private String GameOver = ("��������!");
	public void displayMessage() {
		System.out.println(StartMsg);
		System.out.println(StartNum);
	}
	//���ڸ� �����ϴ� �� �Է��ϰ� ������� Ʋ�ȴ��� ���°Ŷ� �õ�Ƚ�� ��������
	//1. ���� �����ϴ� �� �Է��ϱ�
	public void displayGuessPromt() {
		System.out.println(Choice);
	}
	
	public void displayCorrectGuess() {
		System.out.println(Corrcet);
	}
	public void displayIncorrectGuess() {
		System.out.println(InCorrcet);
		
	}
	
	public void displayAttempts(int attempts) {
		System.out.println("�õ�Ƚ�� : " + attempts);
	}

	public void displayGameOver() {
		System.out.println(GameOver);
	}
}


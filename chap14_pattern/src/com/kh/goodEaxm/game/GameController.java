package com.kh.goodEaxm.game;

import java.util.Scanner;

public class GameController {
	// 		String    
	private	GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		//���� �޼��� �����ִ°� ����ϰ�
		view.displayMessage();
		//��ĳ�� �Է��ؼ� �Է°� ȣ��
		Scanner sc = new Scanner(System.in);
		
		//���� �����ϴ� ���� �Է�����
		
		
		
		//���࿡ ��ǻ�Ͱ� ������ ���ڸ� ������ �� �ҷ��� view
		//boolean isTrue = true;
		while(true) {//false�� �� �� ���� �ݺ�
			view.displayGuessPromt();
			int guess = sc.nextInt();
			if (model.inCorrectGuess(guess)) {
				view.displayCorrectGuess();
				view.displayAttempts(model.getAempts());
				//isTrue = false;
				break;
			} else {
			
			//��ǻ�Ͱ� ������ ���ڿ� ���� �Է��� ���ڰ� Ʋ���� �� view
			view.displayIncorrectGuess();
			view.displayAttempts(model.getAempts());
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m, v);
	
		c.runGame();
	}
	
}

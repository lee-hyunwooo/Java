package com.kh.gettersetter;

import com.kh.gettersetter.goodEaxm.GoodPlayer;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		
		player1.setName("KH");
		
		player1.setHealth(-10);
		player1.ValidHealth();
		//-10이 무결성(내가 만든 코드가 결점이 없는지)인지 검증한다.
		player1.setAttackPower(20);
		
		player1.displayInfo();
		// GameRun에서 player2에 Valid 적용하기
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("ㅎㅎㅎ");
		player2.ValidName();

		player2.setHealth(80);
		player2.ValidHealth();
		
		player2.setAttackPower(10);
		player2.ValidAttackPower();
		
		player2.displayInfo();
		
		System.out.println("Attack!!!! 후");
		
		
	}

}

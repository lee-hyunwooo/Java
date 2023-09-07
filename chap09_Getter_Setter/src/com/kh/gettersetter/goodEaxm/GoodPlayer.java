package com.kh.gettersetter.goodEaxm;

public class GoodPlayer {
	private String name; //캐릭터 이름
	private int health; //체력
	private int attackPower; //공격파워
	
	public void setName(String name) { //이름이 변경되면 저장될 set
		this.name = name;
	}
	//검증하는 valid 
	public void ValidName() { // 캐릭터 이름에 공백이 없는지 검증!
		if(this.name == "") {
			//System.out.println("이름을 넣지 않았습니다.");
			this.name = "No name";
		}
	}
	public String getName() { //캐릭터 이름을 반환
		return name;
	}
	
	
	
	public void setHealth(int health) { //매개변수에 저장된 체력 저장하는 곳
		this.health = health;
	}
	
	public void ValidHealth() {
		if(this.health <= 0) {
			this.health = 0;
			System.out.println("체력이 없습니다");
		}
	}
	public int getHealth() {
		return health;
	}
	
	
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void ValidAttackPower() {//무결성되게 검증
		//만약에 파워가 0보다 작을경우
		if(this.attackPower <= 0) {
			this.attackPower = 0;
			System.out.println("공격력 수치가 올바르지 않습니다.");
		}
	}
	public int getAttackPower() {
		return attackPower;
	}
	//출력메소드 작성
	public void displayInfo() {
		System.out.println("캐릭터 정보 : " + this.name);
		System.out.println("체력 정보 : " + this.health);
		System.out.println("공격 파워 : " + this.attackPower);
	}
	
}

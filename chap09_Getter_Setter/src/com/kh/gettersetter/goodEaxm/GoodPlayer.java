package com.kh.gettersetter.goodEaxm;

public class GoodPlayer {
	private String name; //ĳ���� �̸�
	private int health; //ü��
	private int attackPower; //�����Ŀ�
	
	public void setName(String name) { //�̸��� ����Ǹ� ����� set
		this.name = name;
	}
	//�����ϴ� valid 
	public void ValidName() { // ĳ���� �̸��� ������ ������ ����!
		if(this.name == "") {
			//System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
			this.name = "No name";
		}
	}
	public String getName() { //ĳ���� �̸��� ��ȯ
		return name;
	}
	
	
	
	public void setHealth(int health) { //�Ű������� ����� ü�� �����ϴ� ��
		this.health = health;
	}
	
	public void ValidHealth() {
		if(this.health <= 0) {
			this.health = 0;
			System.out.println("ü���� �����ϴ�");
		}
	}
	public int getHealth() {
		return health;
	}
	
	
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	public void ValidAttackPower() {//���Ἲ�ǰ� ����
		//���࿡ �Ŀ��� 0���� �������
		if(this.attackPower <= 0) {
			this.attackPower = 0;
			System.out.println("���ݷ� ��ġ�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
	public int getAttackPower() {
		return attackPower;
	}
	//��¸޼ҵ� �ۼ�
	public void displayInfo() {
		System.out.println("ĳ���� ���� : " + this.name);
		System.out.println("ü�� ���� : " + this.health);
		System.out.println("���� �Ŀ� : " + this.attackPower);
	}
	
}

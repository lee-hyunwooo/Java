package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {

		Cafe client1 = new Cafe("���ν����",2,false);
		client1.coffee();
		System.out.println("");
		Cafe client2 = new Cafe("ī���ī",1,true);
		client2.coffee();
		System.out.println("");
		Cafe client3 = new Cafe("�����",3,false);
		client3.coffee();
	}

}

package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {

		Cafe client1 = new Cafe("¾ÆÀÎ½´Æä³Ê",2,false);
		client1.coffee();
		System.out.println("");
		Cafe client2 = new Cafe("Ä«Æä¸ğÄ«",1,true);
		client2.coffee();
		System.out.println("");
		Cafe client3 = new Cafe("µş±â¶ó¶¼",3,false);
		client3.coffee();
	}

}

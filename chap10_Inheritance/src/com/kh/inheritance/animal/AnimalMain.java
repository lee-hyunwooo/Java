package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("�����");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat mycat = new Cat("��߹�");
		mycat.run();
		mycat.eat();
		
		Monkey mk = new Monkey("������");
		mk.eat();
		
		Lion lion = new Lion("����");
		lion.eat();
	}

}

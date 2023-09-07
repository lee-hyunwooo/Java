package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("大大捞");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat mycat = new Cat("绊具固");
		mycat.run();
		mycat.eat();
		
		Monkey mk = new Monkey("盔备府");
		mk.eat();
		
		Lion lion = new Lion("荤磊");
		lion.eat();
	}

}

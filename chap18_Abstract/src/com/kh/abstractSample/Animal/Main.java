package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("강아지");
		System.out.println("Dog sound : " + dog.makeSound());
		
		Cat ct = new Cat("고양이");
		
		Animal[] animal = new Animal[2];
		animal[0] = dog;
		animal[1] = ct;
		
		System.out.println(animal[1]);
		//1.cat 만들기
		//Cat ct = new Cat("고양이");
		//2.객체 배열로 Animal 정의해서 출력하기 다형성을 활용한 객체 다루기
		//Animal animal = new Animal[2];
	}

}

package com.kh.abstractSample.Animal;

public class Cat extends Animal {
	//积己磊
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println("具克");
	}
}

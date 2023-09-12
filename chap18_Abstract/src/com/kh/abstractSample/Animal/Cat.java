package com.kh.abstractSample.Animal;

public class Cat extends Animal{
	private String name;
	
	public Cat(String name) {
		super(name);
		this.name = name;
	}
	@Override
	public String makeSound() {
		System.out.println("¾ß¿Ë");
		return name;
	}
	
}

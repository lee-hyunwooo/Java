package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	@Override
	public void eat() {
		System.out.println(getName() + "고기가 더 먹고싶다!");
	}
	
}

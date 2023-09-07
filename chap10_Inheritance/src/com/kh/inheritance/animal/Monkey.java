package com.kh.inheritance.animal;

public class Monkey extends Animal {
	public Monkey(String name) {
		super(name);
	}
	@Override
	public void eat() {
		System.out.println(getName() + "하나만 더 집어 먹을까?");
	}
	
}

package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("������");
		System.out.println("Dog sound : " + dog.makeSound());
		
		Cat ct = new Cat("�����");
		
		Animal[] animal = new Animal[2];
		animal[0] = dog;
		animal[1] = ct;
		
		System.out.println(animal[1]);
		//1.cat �����
		//Cat ct = new Cat("�����");
		//2.��ü �迭�� Animal �����ؼ� ����ϱ� �������� Ȱ���� ��ü �ٷ��
		//Animal animal = new Animal[2];
	}

}

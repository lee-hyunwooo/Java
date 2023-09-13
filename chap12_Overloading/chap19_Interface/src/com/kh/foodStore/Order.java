package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//�ֹ� ��ü
public class Order implements FoodStore{
	private List<Menu> ordermenus;
	
	public Order() {
		ordermenus = new ArrayList<>();//�ֹ��� �����
	}
	
	@Override
	public void addMenu(String menu) {
		Menu menuA = new Menu(menu);
		ordermenus.add(menuA);
	}
	
	@Override
	public void removeMenu(String menu) {
		System.out.println(menu);
	}
	@Override
	public void printMenu() {
		System.out.println("�ֹ�����");
		//menuA.getItem();
		for (Menu menuA: ordermenus) {
			System.out.println(menuA.getItem());
		}
		
	}
}




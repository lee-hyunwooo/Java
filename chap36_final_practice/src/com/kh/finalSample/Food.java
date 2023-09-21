package com.kh.finalSample;

import java.io.Serializable;

public class Food implements Serializable{
	private String name;
	private int kcal;
	
	public Food() {
		
	}
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
	public int getKcal() {
		return kcal;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name + kcal;
	}
}

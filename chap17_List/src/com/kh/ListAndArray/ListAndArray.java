package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1(); //static
		ListAndArray LAA = new ListAndArray();
		LAA.ListArray2();
	}
	public static void ListArray1() {
		// Array ����
		int[] intArray = new int[2]; //ũ�Ⱑ 2�� ���� �迭 ����
		intArray[0]=1;
		intArray[1]=2;
	//	intArray[2]=3;
	
		// Array ���
		System.out.println("Array ��� : ");
		for(int a=0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
	
		System.out.println(); //���๮�� ���Ե��־� enter���� ������ ����
		// List ���� Integer = int
							//  �� �迭 ����Ʈ ����
		List<Integer> intList = new ArrayList<>(); //Integer ��ü�� �����ϴ� ArrayList ����
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		//List ���
		System.out.println("List ��� : ");
		for (int num : intList) {
			System.out.print(num + " ");
		}

	}
	
	public void ListArray2() {
		// Array ����
		String[] strArray = new String[2]; //ũ�Ⱑ 2�� ���� �迭 ����
		strArray[0]="1";
		strArray[1]="2";
	//	intArray[2]=3;
	
		// Array ���
		System.out.println("Array ��� : ");
		for(int a=0; a < strArray.length; a++) {
			System.out.print(strArray[a] + " ");
		}
	
		System.out.println(); //���๮�� ���Ե��־� enter���� ������ ����
		// List ���� Integer = int
							//  �� �迭 ����Ʈ ����
		List<String> StringList = new ArrayList<>(); //Integer ��ü�� �����ϴ� ArrayList ����
		StringList.add("1");
		StringList.add("2");
		StringList.add("3");
		StringList.add("4");
		//List ���
		System.out.println("List ��� : ");
		for (String num : StringList) {
			System.out.print(num + " ");
		}
	}
}

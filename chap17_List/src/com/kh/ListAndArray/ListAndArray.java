package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {}
		
		public void ListArray1() {
		// Array ����
		int[] intArray = new int[2]; //ũ�Ⱑ 2�� ���� �迭 ����
		intArray[0]=1;
		intArray[1]=2;
		
		// Array���
		System.out.println("Array ��� : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		System.out.println(); //���๮�� ���ԵǾ��־� enter ���� ������ ����
	//List ����
		List<Integer> intList = new ArrayList<>();
									//Integer ��ü�� �����ϴ� ArrayList ����
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		//List ���
		System.out.println("List ��� : ");
		for (int num : intList) {
			System.out.print(num + " ");
		 }
		}
		public void ListArray2() {
		//String ���� ��ȯ �� Array�� List ����غ���
		String[] StringArray = new String[3];
		StringArray[0]="��";
		StringArray[1]="��";
		StringArray[2]="��";
		
		System.out.println();
		System.out.println("Array ��� : ");
		for(int i = 0; i < StringArray.length; i++) {
			System.out.print(StringArray[i] + " ");
		}
		System.out.println();
		
		List<String> stringList = new ArrayList<>();
		
		stringList.add("��");
		stringList.add("��");
		stringList.add("Ʈ");
		
		System.out.println("List ��� : ");
		for (String str : stringList) {
			System.out.print(str + " ");
			
		}
		
	}
  
}

package com.kh.arrayListSample;

import java.util.ArrayList;

public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//���ϸ����
		list.add("����");
		list.add("��Ա�");
		list.add("������");
		
		//�����ϰ�
		System.out.println(list);
		list.set(1, "û��");
		list.set(2, "������");
		System.out.println(list);
		
		//�����
		list.remove(1);
		System.out.println(list);
		
		//���� ����
		list.clear();
		System.out.println(list);
	
	}

}

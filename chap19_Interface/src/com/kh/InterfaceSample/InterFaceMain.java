package com.kh.InterfaceSample;

import java.util.ArrayList;
import java.util.List;

public class InterFaceMain {

	public static void main(String[] args) {
		/*
		MyInterface myin ;
		myin = new MyInterface();
	    MyInterface ������ = new MyInterface(); 
	                         ��ü�� �ƴϱ� ������ ������ �� ����
		*/
 List<String> StringList = new ArrayList<>();
		MyInterface myin = new MyClass();
		myin.doMyInterFace();

	}

}

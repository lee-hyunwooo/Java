package com.kh.practice;

import java.io.File;

public class Practice_mkdirs {

	public static void main(String[] args) {
		Practice_mkdirs pm = new Practice_mkdirs();
			pm.practice1();
	}

	public void practice1() {
		//���� �������� 2������� C:\\Users\\user1\\Desktop/�̸�1/�̸�2
		String dirPath = "C:\\Users\\user1\\Desktop/test1/test2";
				
		File dir = new File(dirPath);
		
		boolean success = dir.mkdirs();
		
		if(success) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
				
		//���� �������� 3�� �����C:\\Users\\user1\\java_workspace\\chap25_
		String dirPath2 = "C:\\Users\\user1\\java_workspace\\chap25_";
		
		File dir2 = new File(dirPath2);
		
		boolean success2 = dir2.mkdir();
		
		if(success2) {
			System.out.println("2����");
		} else {
			System.out.println("2����");
		}
		//���� �������� 5�� �����C:\\Users\\user1\\Documents\\myPlace\\Music\\Korean\\kPop\\Group
		String dirPath3 = "C:\\Users\\user1\\Desktop\\myPlace\\Music\\Korean\\kPop\\Group";
		
		File dir3 = new File(dirPath3);
		
		boolean success3 = dir3.mkdirs();
		
		if(success3) {
			System.out.println("3����");
		} else {
			System.out.println("3����");
		}
	
	}
	
	
}

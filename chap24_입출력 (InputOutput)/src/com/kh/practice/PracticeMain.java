package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain m = new PracticeMain();
			m.practice1();
	}

	public void practice1() {//��μ����ؼ� ���� �����
	//	File f = new File
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop/ p1.txt");
			//���Ͼ���
			w.write("���ã��!");
			//���ϴݱ�
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}

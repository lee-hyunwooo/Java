package com.kh.fleIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
	/*	String filePath =  "���� �ۼ� ��/�����IO.txt";
		System.out.println("����");
		//FileWriter fWriter = new FileWriter(filePath,true);
		//true : ���� ���� �̾��
		//false : ���� �����
		 */
		//���࿡ ��¥�� ���� ��¥�� ������ ���� ��
		//������ �����
		mk
		File f = new File("new.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("������ �����߽��ϴ�.");
			}else {
				System.out.println("�̹� �����ϴ� �����Դϴ�.");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String fileName = f.getName();
		//FileReader fReader = new FileReader(f,true);

	}

}

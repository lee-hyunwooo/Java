package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain m = new PracticeMain();
			m.practice2();
		
	}

	public void practice1() {//��μ����ؼ� ���� �����
	//	File f = new File
		final String wpath = "C://Users//user1//Desktop// p1.txt";
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop// p1.txt");
			//���Ͼ���
			w.write("���Ȯ��");
			//���ϴݱ�
			w.close();
			
			//��� ������ ��ΰ� Ȯ���� ��� ������
			FileReader reader = new FileReader("C://Users//user1//Desktop// p1.txt");
			BufferedReader bReader = new BufferedReader(reader);
			
			String line;
			while((line=bReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void practice2() {
		//������ ����� ���� �ȿ� ������ �����
				//���� �ȿ� ���� �ۼ��ϱ�
				
				// File.separtor 
				// window : \
				// Linux or MacOs : /
				
				
				final String folderPath = "C:\\Users\\user1\\Desktop\\new_folders";//���ϴ� ��� ����
				String wpath = folderPath + "\\.git";
				File f = new File(wpath);
				// exists �̹� �����ϴ��� Ȯ��
				if(!f.exists()) {
					f.mkdir();
					System.out.println("Initialized empty Git repository in " +folderPath+"\\.git");
					
				} else {
					System.out.println("Reinitialized existing Git repository in C:/Users/user1/Desktop/new_folders/.git/");
				}
				
				FileWriter w;
				try {
					w = new FileWriter(wpath+"\\newTxt.txt");
					w.write("���ο� ������ ������ �Է��մϴ�.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
	
	}
}

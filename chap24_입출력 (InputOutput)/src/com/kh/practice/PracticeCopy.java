package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {
//�̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ ��
		//����ȭ�鿡�ٰ� ������ ���� 
		//�����ȿ� ������ �̹��� �����ϱ�!
	public static void main(String[] args) {
		
		PracticeCopy pc = new PracticeCopy();
			pc.Copy2();
		
	}

	public void Copy1() {
		String inputFile = "C:\\Users\\user1\\Desktop\\love.jpg";
		String outputFile = "C:\\Users\\user1\\Desktop\\RealLove.png";
		
	try	(FileInputStream fis = new FileInputStream(inputFile);
		FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024];
			int byteRead;
		
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("���� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void Copy2() {
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png"; //���� �ҷ�����
		String newFolder = "C:\\Users\\user1\\Desktop//img";  //���� ������ ���
		File dir = new File(newFolder);			
		boolean success = dir.mkdirs();						//���� ����
		String outputFile = "C:\\Users\\user1\\Desktop//img//Realcute.jpg";// ���� ������ ���
		
		try (FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("���ϻ���");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

package com.kh.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PracticeCopy {
//이미지파일 jpg 또는 png 파일을 바탕화면에 저장한 후
		//바탕화면에다가 폴더를 만들어서 
		//폴더안에 복사한 이미지 저장하기!
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
			System.out.println("복사 성공");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void Copy2() {
		String inputFile = "C:\\Users\\user1\\Desktop\\cute.png"; //사진 불러오기
		String newFolder = "C:\\Users\\user1\\Desktop//img";  //폴더 생성할 경로
		File dir = new File(newFolder);			
		boolean success = dir.mkdirs();						//폴더 생성
		String outputFile = "C:\\Users\\user1\\Desktop//img//Realcute.jpg";// 사진 복사할 경로
		
		try (FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile)) {
			byte[] buffer = new byte[1024];
			int byteRead;
			
			while((byteRead = fis.read(buffer)) != -1) {
				fos.write(buffer,0,byteRead);
			}
			System.out.println("파일생성");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

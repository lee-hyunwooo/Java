package com.kh.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain m = new PracticeMain();
			m.practice1();
	}

	public void practice1() {//경로설정해서 파일 만들기
	//	File f = new File
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop// p1.txt");
			//파일쓰기
			w.write("경로확인");
			//파일닫기
			w.close();
			
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
	
	
	
	
	
}

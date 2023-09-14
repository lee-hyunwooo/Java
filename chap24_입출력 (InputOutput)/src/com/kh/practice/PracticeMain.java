package com.kh.practice;

import java.io.File;
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
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop/ p1.txt");
			//파일쓰기
			w.write("경로찾기!");
			//파일닫기
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}

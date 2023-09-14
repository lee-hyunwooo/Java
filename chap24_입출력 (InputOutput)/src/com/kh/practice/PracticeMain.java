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

	public void practice1() {//경로설정해서 파일 만들기
	//	File f = new File
		final String wpath = "C://Users//user1//Desktop// p1.txt";
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop// p1.txt");
			//파일쓰기
			w.write("경로확인");
			//파일닫기
			w.close();
			
			//어디서 보던지 경로가 확실한 경로 절대경로
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
		//폴더를 만들고 폴더 안에 파일을 만들기
				//파일 안에 내용 작성하기
				
				// File.separtor 
				// window : \
				// Linux or MacOs : /
				
				
				final String folderPath = "C:\\Users\\user1\\Desktop\\new_folders";//원하는 경로 설정
				String wpath = folderPath + "\\.git";
				File f = new File(wpath);
				// exists 이미 존재하는지 확인
				if(!f.exists()) {
					f.mkdir();
					System.out.println("Initialized empty Git repository in " +folderPath+"\\.git");
					
				} else {
					System.out.println("Reinitialized existing Git repository in C:/Users/user1/Desktop/new_folders/.git/");
				}
				
				FileWriter w;
				try {
					w = new FileWriter(wpath+"\\newTxt.txt");
					w.write("새로운 파일의 내용을 입력합니다.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
	
	}
}

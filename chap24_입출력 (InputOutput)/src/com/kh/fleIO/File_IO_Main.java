package com.kh.fleIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_IO_Main {

	public static void main(String[] args) {
	/*	String filePath =  "설명 작성 란/입출력IO.txt";
		System.out.println("생성");
		//FileWriter fWriter = new FileWriter(filePath,true);
		//true : 파일 끝에 이어쓰기
		//false : 파일 덮어쓰기
		 */
		//만약에 날짜가 오늘 날짜인 폴더가 없을 떄
		//폴더를 만들고
		mk
		File f = new File("new.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("파일을 생성했습니다.");
			}else {
				System.out.println("이미 존재하는 파일입니다.");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String fileName = f.getName();
		//FileReader fReader = new FileReader(f,true);

	}

}

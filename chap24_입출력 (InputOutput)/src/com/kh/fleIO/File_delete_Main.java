package com.kh.fleIO;

import java.io.File;

public class File_delete_Main {

	public static void main(String[] args) {
		String mainPath ="C:\\Users\\user1\\Desktop//";
		String originFile = mainPath+"cute2222.png";
		
		//파일 객체 생성
		File fileToDelete = new File(originFile);
		//파일삭제
		boolean deleted = fileToDelete.delete();
		if (deleted) {
			System.out.println("파일이 성공적으로 삭제되었습니다.");
		} else {
			System.out.println("파일을 삭제하는데 실패했습니다");
		}

	}

}

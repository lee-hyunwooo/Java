package com.kh.fleIO;

import java.io.File;

public class File_delete_Main {

	public static void main(String[] args) {
		String mainPath ="C:\\Users\\user1\\Desktop\\cute.png";
		String originFile = mainPath+"cute.png";
		
		//���� ��ü ����
		File fileToDelete = new File(originFile);
		//���ϻ���
		boolean deleted = fileToDelete.delete();
		if (deleted) {
			System.out.println("������ ���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����ϴµ� �����߽��ϴ�");
		}

	}

}

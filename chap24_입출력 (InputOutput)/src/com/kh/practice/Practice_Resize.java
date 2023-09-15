package com.kh.practice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class Practice_Resize {

	public static void main(String[] args) {
		Practice_Resize p = new Practice_Resize();
				p.Resize2();
	}
	public void Resize1() {
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "cute.jpg";
		String outputImg = path + "cc.jpg";
		
		int width = 200;
		int height = 150;
	try {	
		BufferedImage bufImg = ImageIO.read(new File(inputImg));
		
		Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
		BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
		
		ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
		System.out.println("성공!");
		} catch (IOException e) {
			System.out.println("실패 : " + e.getMessage());
		}
	}
	
	
	public void Resize2() {
		//이미지 하나 불러오기
		//바탕화면에 새로운 폴더 만들기 mkdir
		//새로 리사이즈한 이미지 바탕화면에 새로 만든 폴더안에 저장하기
		String newFolder = "C:\\Users\\user1\\Desktop\\img"; //폴더생성 경로
		File dir = new File(newFolder);
		boolean success = dir.mkdirs(); //폴더 생성
		
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "cute.jpg";
		String outputImg = path +"img\\reSizeCute.jpg";
		
		int width =200;
		int height = 150;
	try {	
		BufferedImage bufImg = ImageIO.read(new File(inputImg));
		
		Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
		BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		bufResizeImg.getGraphics().drawImage(resizeImg, 0, 0, null);
		
		ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
		System.out.println("성공!");
		} catch (IOException e) {
			System.out.println("실패 : " + e.getMessage());
		}
	} 
	
}

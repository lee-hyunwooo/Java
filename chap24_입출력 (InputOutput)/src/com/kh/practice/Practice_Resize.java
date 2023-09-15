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
		System.out.println("����!");
		} catch (IOException e) {
			System.out.println("���� : " + e.getMessage());
		}
	}
	
	
	public void Resize2() {
		//�̹��� �ϳ� �ҷ�����
		//����ȭ�鿡 ���ο� ���� ����� mkdir
		//���� ���������� �̹��� ����ȭ�鿡 ���� ���� �����ȿ� �����ϱ�
		String newFolder = "C:\\Users\\user1\\Desktop\\img"; //�������� ���
		File dir = new File(newFolder);
		boolean success = dir.mkdirs(); //���� ����
		
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
		System.out.println("����!");
		} catch (IOException e) {
			System.out.println("���� : " + e.getMessage());
		}
	} 
	
}

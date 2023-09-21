package com.kh.IAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {

	public static void main(String[] args) {
		PracticeAddress PA = new PracticeAddress();
		

	}

	public void Address() {
		try {
			InetAddress address = InetAddress.getByName("www.naver.com");
		} catch (UnknownHostException e) {
			
			byte[] ipAddress = address.getAdderss();
			Sysout.out Println("IP Address byte·Î ¾òÀ½")
			
			for()
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}

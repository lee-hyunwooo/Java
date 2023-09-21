package com.kh.udpServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 
 ��Ʈ��ũ ����� ���� �߿��� Ŭ����
	UDP(User Datagram Protocol)����ؼ� �����͸� �ۼ��� �ϴµ� ���
DatagramSocket
	UDP ����� ���� ���� Ŭ����
	TCP ���ϰ� �ٸ��� ������ �����ϰų� ���� ������ �������� �ʰ� ������ ��Ŷ�� �׳� ������ �޴� ����

 DatagramPacket
	UDP ������ ��Ŷ�� ��Ÿ���� Ŭ����
	�������� ���� ����� �����͸� ���� ��� �Ǵ� �����͸� ������ ����� �ּ� ������ ����
 
 Packet�̶�?
 	��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ���
 	�����͸� �ְ���� �� ���س��� ��Ģ
 	Pack +Bucket �ռ��� 
 */
public class UDPServer {
	public void start() throws Exception {
	DatagramSocket socket = new DatagramSocket(8888);
	DatagramPacket inPacket, outPacket;
	
	byte[] inMsg = new byte[10];
	byte[] outMsg;
	
	while(true) {
		//�����͸� �����ϱ� ���� ��Ŷ�� ����
		inPacket = new DatagramPacket(inMsg, inMsg.length);
		//��Ŷ�� ���� �����͸� ����
		socket.receive(inPacket);
		
		//������ ��Ŷ���� Ŭ���̾�Ʈ�� IP & Port
		InetAddress address =inPacket.getAddress();
		int port = inPacket.getPort();
		
		//������ ���� �ð��� �ú��� ���·� ��ȯ
		SimpleDateFormat simpleDate = new SimpleDateFormat("[hh:mm:ss");
		String time = simpleDate.format(new Date());
		outMsg = time.getBytes();//byte �迭�� ��ȯ
		
		//��Ŷ�� �����ؼ� Ŭ���̾�Ʈ���� ����
		outPacket = new DatagramPacket(outMsg, outMsg.length,address,port);
	
	}
	
	}
	public static void main(String[] args) {
		try {
			new UDPServer.start(); //UDP ���� ����
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
		
		
		
		
	
}

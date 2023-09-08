package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.UserController;
import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UsrView;

public class UserClient {

	public static void main(String[] args) {
	/*
	 * MVC ������ ����ؼ� ���������� �ٷ�� ��
	 * */
		//�� ��ü ����
		UserModel user = new UserModel("ȫ�浿",20);
		
		//�� ��ü ����
		UsrView view = new UsrView();
		
		//��Ʈ�ѷ� ��ü ���� ��                              �� �� ����
		UserController controller = new UserController(user, view);
		
		//���� ������ ������Ʈ�ؼ� ���
		controller.updateView();
		
		//���� ���� ������Ʈ
		controller.setUserName("�̼���");
		controller.setUserAge(30);
		
		//������Ʈ �� ���� ���� ���
		controller.updateView();
		
	}

}

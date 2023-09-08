package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.UserModel;
import com.kh.pattern.mvc.View.UsrView;
//import com.kh.pattern.mvc.Veiw.User;
public class UserController {
	/*
	 * �𵨰� �並 �����ϴ� ��
	 * ����� �Է��� ó���ϴ� ��
	 */
	private UserModel usermodel;

	private UsrView userview;
	
	public UserController(UserModel usermodel, UsrView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	}

	public void setUserName(String name) {
		//this.usermodel = usermodel;
		usermodel.setName(name);
	}

	public void setUserAge(int Age) {
		usermodel.setAge(Age);
	}
	
	public String getUserName() {
		return usermodel.getName();
	}
	
	public int getUserAge() {
		return usermodel.getAge();
	}
	
	
	public void updateView() {
		//DB�� �� ����� �κ� �߰�
		userview.displayInfo(usermodel.getName(), usermodel.getAge());
	}
}

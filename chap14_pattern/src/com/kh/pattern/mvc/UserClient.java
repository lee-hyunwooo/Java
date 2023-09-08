package com.kh.pattern.mvc;

import com.kh.pattern.mvc.controller.UserController;
import com.kh.pattern.mvc.model.UserModel;
import com.kh.pattern.mvc.view.UserView;

public class UserClient {
	
	public static void maint(String[] args) {
		
	}
	/*
	 MVC 패턴을 사용해서 학생 정보를 다루는곳
	 */
	 	UserModel user = new UserModel("홍길동",20);
	 	
	 	//뷰 객체 생성
	 	UserView view = new UserView();

	 	//컨트롤러 객체 생성 및 모델 뷰 설정
	 	UserController controller = new UserController(user, view);
	 	
	 	
}

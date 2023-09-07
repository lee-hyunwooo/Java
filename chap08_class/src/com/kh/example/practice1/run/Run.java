package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// 1. Member객체를 생성
		//만약에 char 값을 넣고 싶으면 ''를 넣어줘야함 ex)'남''여'
		Member member = new Member();
		
		// 2. changeName() 값 변경
		member.changeName("뉴네임");
		//3. prinName() 을 이용해 출력
		member.printName();
		
	}
	
}

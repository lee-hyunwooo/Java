package com.kh.classAM;
import com.kh.classAM.AM;
public class OtherAm {

	public static void main(String[]args) {
		//AM 생성
		AM am = new AM();
		am.publicMethod();
		am.protectedMethod();
		am.defaultMethod();
		//am.privateMethod(); //다른 클래스에 존재하기 때문에 출력이 안됌
	}
}

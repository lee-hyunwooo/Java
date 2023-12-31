package com.kh.classAM;

public class AM {
	public int pNum = 10;
	protected int pNum2 = 20;
	int pNum3 = 30; //접근 제한자를 명시하지 않으면 자동으로 default 제한이 적용
	private int pNum4 = 40;
	
	//호출 메서드 작성해서 각각 호출하기
	
	public void publicMethod() {
		System.out.println("어떤 클래스에서든 접근이 가능 " + "public Method() 호출됨");
	}
	
	protected void protectedMethod() {
		System.out.println("같은 패키지 내에서는 접근 가능 " + "protected Method() 호출됨");
	}
	void defaultMethod () {//default 는 앞에 접근 제한자를 작성해주지 않으면 기본적으로 적용
		System.out.println("default Method() 호출됨");
	}
	void privateMethod() {
		System.out.println("private Method() 호출됨");
	}
}

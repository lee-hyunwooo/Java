package com.kh.practice.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		//System.out.println("colors : " + colors);
		
		colors.add("빨");
		colors.add("주");
		colors.add("노");
		colors.add("초");
		colors.add("파");
		colors.add("남");
		colors.add("보");
		//System.out.println("colors : " + colors);
		
		colors.set(1, "블랙");
		colors.set(3, "브라운");
		colors.set(4, "그린");
		//System.out.println("colors : " + colors);
		colors.add(2,"옐로우");
		/*   1번방법 노랑 브라운 삭제 //
		colors.remove(3);//노랑
		System.out.println("노 삭제 : " + colors);
		colors.remove(3);//노랑이 사라졌으므로 브라운이 3
		System.out.println("브라운 삭제 : " + colors);
		colors.add(4,"연한파랑");
		System.out.println("수정 : " + colors);
		*/
		
			//2번방법
		colors.add(6, "연한파랑");
		//System.out.println("수정 : " + colors);
		
		
		for(String AAA : colors) {
			//System.out.println(AAA);
		}

		//1. 인덱스 이용해서 자리출력
		colors.set(7, "남");
		//System.out.println("최후 출력"+colors.get(0)+ " " +colors.get(7)+" "+colors.get(8));
		
		//2.초기화 후 출력
		colors.clear();
		colors.add("빨");
		colors.add("남");
		colors.add("보");
		//System.out.println("최후 출력" + colors.get(0)+ colors.get(1) + colors.get(2));
		
	}

}

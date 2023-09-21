package com.kh.testSample;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kh.jUnit.practice.ArrayPractice;


public class ArrayPracticeTest {
	private ArrayPractice ar;
	@Before
	public void setUp() {
		ar = new ArrayPractice();
		System.out.println("테스트 시작");
	}
	
	@After
	public void Down() {
		System.out.println("테스트 종료");
	}
	
	@Test
	public void testPractice1() {
		int[] expceted = {1,2,3,4,5,6,7,8,9,10};
		int[] actual = {1,2,3,4,5,6,7,8,9};
		assertEquals(expceted, actual);
		
	}
	@Test
	public void testPractice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수");
		int a = sc.nextInt();
		System.out.println("두번째 수");
		int b = sc.nextInt();
		assertEquals(a,b);
		sc.close();
	}
	
	@Test
	public void testPractice3() {
		String[] ar1 = {"사과","바나나","포도"};
		String[] ar2 = {"포도","바나나","사과"};
		assertNotEquals(ar1,ar2);
	}
	
	
	@Test
	public void testPractice4() {
	Scanner sc = new Scanner(System.in);
	System.out.println("첫번째 값 ");
	String at = sc.next();
	System.out.println("두번째 값");
	String bt = sc.next();
	
	String[] a = {at};
	String[] b = {bt};
	assertNotEquals(a,b);
		
	}
	
}

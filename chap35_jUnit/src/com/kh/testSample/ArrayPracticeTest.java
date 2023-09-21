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
		System.out.println("�׽�Ʈ ����");
	}
	
	@After
	public void Down() {
		System.out.println("�׽�Ʈ ����");
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
		System.out.println("ù��° ��");
		int a = sc.nextInt();
		System.out.println("�ι�° ��");
		int b = sc.nextInt();
		assertEquals(a,b);
		sc.close();
	}
	
	@Test
	public void testPractice3() {
		String[] ar1 = {"���","�ٳ���","����"};
		String[] ar2 = {"����","�ٳ���","���"};
		assertNotEquals(ar1,ar2);
	}
	
	
	@Test
	public void testPractice4() {
	Scanner sc = new Scanner(System.in);
	System.out.println("ù��° �� ");
	String at = sc.next();
	System.out.println("�ι�° ��");
	String bt = sc.next();
	
	String[] a = {at};
	String[] b = {bt};
	assertNotEquals(a,b);
		
	}
	
}

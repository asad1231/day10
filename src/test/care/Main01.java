package test.care;

import test.date.Date;
import test.java.TestClass01;
import test.java.TestClass02;
import test.java.TestClass03;

//import test.java.*;


public class Main01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.test();
		TestClass01 t01 = new TestClass01();
		t01.test();
		TestClass02 t02 = new TestClass02();
		TestClass03 t03 = new TestClass03();
		
		Date dd = new Date();
		dd.data();
		
		test.java.Date d01 = new test.java.Date();
		d01.data();
		
		java.util.Date d02 = new java.util.Date();
		System.out.println(d02);
		
	}
}

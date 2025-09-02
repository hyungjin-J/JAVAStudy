package com.kh.object.access.run;

import com.kh.object.access.AccessTest;

public class Run {
	public static void main(String[] args) {
		//AcessTest 객체 생성
		AccessTest test = new AccessTest();
		
		//public 멤버 접근
		System.out.println(test.publicfield);
		test.publicMethod();
		
		//protected 멤버 접근
		
		/*System.out.println(test.protectedfield);
		test.protectedMethod();  접근 불가*/
		
		//default 멤버 접근
		
		/* System.out.println(test.defaultfield);
		test.defaultMethod(); 접근 불가 */ 
		
		//private 멤버 접근
		
		/*System.out.println(test.privatefield);
		test.privateMethod(); 접근 불가*/
		
		
	}

}

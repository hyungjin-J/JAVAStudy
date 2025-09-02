package com.kh.object.access;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessTest test = new AccessTest();
		
		//public 멤버 접근
		System.out.println(test.publicfield);
		test.publicMethod();
		
		//protected 멤버 접근
		
		System.out.println(test.protectedfield);
		test.protectedMethod(); 
		
		//default 멤버 접근
		
		System.out.println(test.defaultfield);
		test.defaultMethod(); 
		
		//private 멤버 접근
		
		/*System.out.println(test.privatefield);
		test.privateMethod(); 접근 불가 
		// private 사용 이유
		// : 객체의 데이터를 외부로부터 안전하게 보호하기 위해서(정보 은닉)
		// : 객체 지향 핵심 원리 중 하나인 캡슐화를 실현하는데 사용함
		*/

	}

}

package com.kh.object.basicPerson;

/*
 * 클래스 구조
 * 
 *   접근제한자 class (예약어) person(클래스 이름) {
 *       //변수부 (필드부,멤버 변수) <<< 데이터를 저장하는 공간을 선언하는 영역
 * 		 //메소드부
 * 			:기능을 정의하는 영역
 * 		 //생성자부
 * 			: 클래스 생성을 위해 생성자를 정의하는 영역
 * 			: 데이터를 초기화하기 위한 목적으로 정의
 *   }
 *   
 */
public class Person {
	//---------------필드부 정의---------------
	String name;// 이름 String
	int age;// 나이 int
	
	//---------------생성자부 정의--------------
	
	public Person() {}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	//---------------메소드부 정의--------------
	// 소개하다. ->출력
	
	public void intrduce() {
		System.out.println("안녕하세요.");
		System.out.println("저는" + name + "입니다.");
		System.out.println("나이는" + age + "살입니다.");
	}
	

}

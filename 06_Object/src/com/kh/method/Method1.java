package com.kh.method;

public class Method1 {

	public static void main(String[] args) {
		/*
		 * 메소드 : 클래스 내부에 있는 함수
		 * [표현법]
		 * [접근제한자] [예약어] 반환형 : 메소드명(매개변수) {
		 *   // 수행할 내용(기능)
		 * }
		 * 
		 * 접근제한자 : 생략 가능, 생략시 default 로 사용됨
		 */
		
		System.out.println("======프로그램 시작=====");
		hiEveryone(20);
		hiEveryone(10);
		//hiEveryone(); 매개변수가 없는 hiEveryone 메소드는 존재하지 않아 오류!
		System.out.println("======프로그램 종료=====");
		
		
		}
	public static void hiEveryone(int age) {
		// 반환형 : void => "결과 값이 없음" 의미(내용 실행하고 끝)
		// 메소드명 : hiEveryone
		// 매개변수 정보 : 정수형 1개 (age) > 메소드가 호출될 때 전달되는 값을 저장하는 공간(변수)
		System.out.println("Hi, Everyone!");
		System.out.println("age: " + age);
		
	}

}

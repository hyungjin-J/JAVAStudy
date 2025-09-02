package com.kh.exception;

public class MyException extends Exception {
	/*
	 * 나만의 예외 클래스 만들기
	 * [1] 예외 클래스 상속 (Exception 등등)
	 * [2] 예외 메시지 초기화(설정)
	 * 		- 매개변수가 1개인 생성자 이용
	 *		- getMessage 메소드를 오버라이딩 하기도 함
	 * 
	 */
	public MyException() {}
	
	public MyException(String message) {
		//전달된 값을 부모 생성자를 통해 초기화
		super(message);
	}

}

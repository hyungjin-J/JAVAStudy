package com.kh;

public class Variable {
	// 자바 프로그램 실행 시 반드시 필요한 것! => main 메소드
	// String[] args = 매개 변수
	public static void main(String[] args) {
		printVariable(); // printVariable 메소드 호출(실행)
		declareVariable(); // declareVariable 메소드 호출(실행)
	}
	
	public static void printVariable() {
		/*
		 * 변수의 목적 ? 데이터를 저장하기 위한 공간
		 * - 가독성 증가
		 * - 개발자의 실수를 줄일 수 있다.
		 * - 재사용이 용이하다.
		 * - 유지 보수가 좋아진다.
		 */
		
		//예제  월급 = 시급 * 근무시간 * 근무일수
		// 출력 형식 -> xxx : 0000원
		// 2025년 최저시급 : 10030원 + 200원
		
		System.out.println("홍길동 : " + (10230 * 8 * 5) + "원");
		System.out.println("아이유 : " + (10230 * 6 * 5) + "원");
		System.out.println("진 : " + (10230 * 15 * 28) + "원");
		System.out.println("유재석 : " + (10230 * 20 * 31) + "원");
		
		// 변수를 사용하여 시급에 대한 부분을 변경 해보자
		// * 최저시급 10030원 -> 숫자, 정수형
		
		int pay = 10030; // 변수 선언 및 초기화
		pay = pay + 500;
		
		System.out.println("홍길동 : " + (pay * 8 * 5) + "원");
		System.out.println("아이유 : " + (pay * 6 * 5) + "원");
		System.out.println("진 : " + (pay * 15 * 28) + "원");
		System.out.println("유재석 : " + (pay * 20 * 31) + "원");
		
		
	}
	
	public static void declareVariable() {
		/*
		 * 변수 선언 : 값을 저장하기 위한 변수를 메모리 공간에 할당하는 것.
		 * [표현식]
		 * 			자료형 변수명;
		 * 			자료형의 의미 : 데이터의 종류 (변수의 크기나 모양(정수,문자열 등)을 지정하는 것)
		 * 			변수명 : 변수의 이름을 부여하는 부분 (이름은 모두가 알기 쉽게 의미를 부여하여서.)
		 * 
		 * 		변수 명명 규칙 :camelCase : 소문자로 시작하고 다른 단어가 연결 될 경우 첫글자를 대문자로 시작
		 * 					 SNAKE_CASE : 변하지 않는 상수값을 저장할 때, 변수 전체를 대문자로 표기. 다른 단어는 _ 로 구분
		 *                                 변수 앞에 final 붙임
		 *					 예약어 사용 불가 : static, void , int 와 같이 이미 사용중인 이름 이용 불가                               
		 *                   공백 사용 불가
		 *                   특수 문자는 _ 와 $ 만 이용할 수 있다.
		 *                   숫자로 시작할 수 없다.
		 *                   대소문자 구분하며, 첫 시작을 대문자 시작 불가, 길이는 제한 없다.
		 */
		
		// 1. 논리형 (boolean) : 논리값을 저장, true, false, 1byte, 기본 false
		// true값을 저장하는 isTrue라는 변수 선언 및 초기화
		boolean isTrue = true;
		// false 값을 저장하는 isFalse 변수 선언 및 초기화
		boolean isFalse = false;
		
		System.out.println("isTrue의 값 : " + isTrue);
		System.out.println("isFalse의 값 : " + isFalse);
		
		isTrue = 1 + 3 > 1;
		System.out.println("1 + 3 > 1의 결과 : " + isTrue);
		//-------------------------------
		//2. 숫자 자료형 (정수, 실수)
		//2-1) 정수형
		//정수형 : 딱 떨어지는 수 , 소숫점 없음
		//byte(1B), short(2B), int(4B), long(8B) 저장할 수 있는 값의 범위가 다름
		
		//byte 자료형 변수 bNum 
		
		byte bNum = -128;
		
		// bNum에 1000을 넣어보자 오버 플로우
		
		//bNum = 1000;
		// 저장 가능한 범위를 벗어나는 값을 저장하려 해서 오류 발생
		
		//2-2 실수형 : 소숫점이 있는 숫자 /float(4B) , double(8B)
		//float 자료형 변수 fNum에 0.0을 저장
		//값 자체 (리터럴)를 저장할 때는 접미사 f/F를 붙여줌
		
		float fNum = 0.0f; // 소숫점 7자리까지
		double dNum = 0.0; // 소숫점 15자리까지 표현 가능, 실수형의 기본 자료형
					
		//--------------------------------------
		//3. 문자형 (char, String)
		// 3-1) 문자 : char (2B)
		// 'a' 라는 데이터를 저장하는 변수 ch 선언 및 초기화
		
		char ch = 'a';
		// '김' 이라는 데이터를 변수에 저장하자.
		
		char cha = '김';
		
		// 3-2) 문자열 : String (참조자료형)
		
		// 문자열 변수 str 선언
		String str;
		
		// str 변수에 "안녕하세요" 데이터를 저장
		str = "안녕하세요";
		
		// 문자열의 길이 : 변수명.legth()
		System.out.println("str 데이터 길이: " + str.length());
		
		//상수 : 변하지 않는 값을 저장하는 공간
		/*
		 * [표현식]
		 * final 자료형 변수명;
		 * 
		 */
		// 최대 허용자 수를 저장하기 위한 상수 선언
		
		final int MAX_USERS;
		MAX_USERS = 25; // => 데이터 재할당 불가
		
		// 대표적인 상수 : 파이 PI
		
		System.out.println( Math.PI );
		
		
		
		
		
		
		
	}
}

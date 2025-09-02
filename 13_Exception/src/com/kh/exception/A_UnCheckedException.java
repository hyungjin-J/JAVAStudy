package com.kh.exception;

import java.util.Scanner;

public class A_UnCheckedException {
	/*
	 * RuntimeException : 프로그램 실행 시 발생하는 예외들
	 * - IndexOutOfBoundsException : 배열이나 리스트 등에 부적절한 인덱스로 접근 시
	 * 발생하는 오류
	 * - NullPointerException : 참조변수가 null 인 상태에서 객체 멤버로 접근할 때 발생
	 * - ArithmeticException : 나누기 연산에서 0으로 나눌 때 발생
	 * - ClassCastException : 허용되지 않는 객체로 형변환을 시도할 때 발생
	 * - NegativeArraySizeException : 배열을 생성할 때 크기를 음수로 지정하면 발생
	 * =>RuntimeException 계열의 예외는 대부분 예측 가능한 상황에서 발생
	 * 그렇기 때문에 if 문 조건 처리를 통해 애초에 예외가 발생하지 않도록 방지 가능!
	 * 
	 */
	//------필드부-------
	private Scanner sc = new Scanner(System.in);
	
	public void test1() {
		//ArithmeticException Test
		System.out.println("정수1 : ");
		int n1 = sc.nextInt();
	
		System.out.println("정수2 : ");
		int n2 = sc.nextInt();
		
		
		
		
		// int result = n1 / n2;
		// => 두번째 입력값 (n2)이 0인 경우 예외 발생 -> 프로그램이 비정상 종료됨
		// 조건 처리 (조건문)
		
		/*
		int result = 0; 
		if(n2 !=0) { 					//예외가 발생되지 않도록 막은 거임
			result = n1 / n2;
		}
		
		System.out.println("결과는 ...." + result);
		*/
		/*
		 예외 처리 목적 : 예외가 발생했을 때 비정상 종료되지 않도록 하기 위함
		 실행할 내용을 미리 작성해 놓은 것
		 try catch
		 try{
		     예외가 발생할 수 있는 구문
		     } catch(발생될 예외 클래스 매개변수) {
		     해당 예외가 발생했을 때 실행할 구문
		     }
		     
		*/
		 
		try {
			int result = n1 / n2;
			System.out.println("결과 : " + result);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			
			System.out.println(e.getMessage()); // 예외에 대한 메시지 설명 출력
			e.printStackTrace(); // 예외 처리된 거 어떤 오류였는지 표기해줌
				
	}

		System.out.println("작업 끝!");
}
	public void test2() {
		//NegativeArraySizeException ,ArrayIndexOutOfBoundsException
		System.out.println("배열 크기 : ");
		int size = sc.nextInt();
		
		// 조건 처리 
		/*
		if(size>=77) {
		int[] arr = new int[size];
		System.out.println("77번 위치의 값 : " + arr[77]);
		}
		*/
		//예외 처리
		
		try {
			int[] arr = new int[size];
			System.out.println("77번 위치의 값 : " + arr[77]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("인덱스 범위를 벗어난 접근 발생!");
			e.printStackTrace();
		} catch(NegativeArraySizeException e) {
			System.out.println("배열 크기를 음수로 지정할 수 없음!");
			e.printStackTrace();
		}
		
		// catch 를 여러개 사용하여 필터링 할 수 있다.
		 System.out.println("작업 끝!!");
	}
	
	public void test3( ) {
		System.out.println("배열 크기 : ");
		int size = sc.nextInt();
		
		try {
			int[] arr = new int[size];
			System.out.println("77번 위치의 값 : " + arr[77]);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("인덱스 범위를 벗어난 접근 발생!");
			e.printStackTrace(); }
			
			catch(RuntimeException e) {
			System.out.println("인덱스가 잘못되었거나,, 배열 크기가 음수일 경우...");
			e.printStackTrace(); // 다형성을 활용하여 부모타입으로 catch 블럭을 작성 가능
			// 모든 자식 예외 발생시 처리 가능
		}
		
		// catch 를 여러개 사용하여 필터링 할 수 있다.
		// 각각의 예외 발생 시 실행할 동작이 다를 경우
		// 다중 catch 블럭을 사용하여 예외 별로 세분화할 수 있음
		// 이때, 순서에 유의해야 함! (부모 타입보다 자식 타입이 위쪽에 작성되어야 함)
		
		 System.out.println("작업 끝!!");
	}
	
}
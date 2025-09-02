package com.kh.operator;

import java.util.Scanner;

public class C_Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 논리 연산자 (이항 연산자)
		 * :논리값을 비교하는 연산자 (결과값 = true, false)
		 * :결과값도 논리값이다.
		 * 
		 * *종류 : && , ||
		 * 
		 * AND 연산자 : &&
		 * A && B : A , B 모두 true 여야 true
		 * true && true => true
		 * true && false => false
		 * 
		 * OR 연산자 : ||
		 * A || B : A B 둘 중 하나라도 true 면 true
		 * 
		 * true || true = true
		 * true || false = true
		 * false || false = false
		 * 
		 * 
		 * 단축평가(SCE)
		 * - && 연산자 : 왼쪽(A) 조건이 false 라면 오른쪽(B) 연산이 수행되지 않는다.
		 * - || 연산자 : 왼쪽(A) 조건이 true 라면 오른쪽(B) 연산이 수행되지 않는다.
		 * 
		 */
		
		//method1();
		method2();

	}
	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean result1 = num >= 1 && num <= 10;
		
		System.out.println("입력받은 값은 1~10 사이의 값인가 ? " + result1);
		
		// 입력받은 값이 1 ~ 10 사이의 값이 아닌지 확인
		
		boolean result2 = num < 1 || num >10;
		System.out.println("입력받은 값은 1보다 작거나 10보다 큰 값인가? " + result2);
	}
	
	public static void method2() {
		
		//입력받은 문자가 소문자인지 확인
		
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력하세요 : ");
		String alpha = sc.nextLine();
		
		// 문자열에서 문자로 추출 메소드 : 문자열.charAt(위치) : char
		// 위치값은 0부터 시작!
		
		char chAlpha = alpha.charAt(0);
		boolean isSmall = chAlpha >= 'a' && chAlpha <='z'; //문자 형식이지만 자동 변환 하여 아스키코드값으로 계산
		boolean isBig = chAlpha >= 'A' && chAlpha <= 'Z'; 
		
		System.out.printf("%c 은 소문자인가? %b\n", chAlpha, isSmall);
		System.out.printf("%c 은 대문자인가? %b\n", chAlpha, isBig);
	}

}

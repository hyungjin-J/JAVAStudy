package com.kh.operator;

import java.util.Scanner;

public class B_Comparison {
	/*
	 * 비교 연산자 (이항 연산자)
	 * : 두 값을 비교하는 연산자
	 * : 결과가 true / false 로 나뉜다.
	 * : - 조건을 만족하는 경우 : true
	 * : - 조건을 만족하지 않는 경우 : false
	 * 
	 * * 대소비교 연산자 : > < >= <=
	 * * 동등비교 연산자 : == !=
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();

	}
	
	public static void method1() {
		// Scanner 준비시키기! [1] 포함하기 [2] 준비하기(생성)
		Scanner sc = new Scanner(System.in);
		
		//정수 두개를 입력받아 변수에 저장하기
		
		System.out.print("정수1 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("정수2 입력 : ");
		int n2 = sc.nextInt();
		
		System.out.printf("n1 : %d, n2: %d\n", n1, n2);
		
		System.out.println("첫번째 숫자와 두번째 숫자는 같은 값인가? " + (n1 == n2));
		System.out.println("첫번째 숫자가 두번째 숫자보다 큰가? " + (n1 > n2));
		System.out.println("두번째 숫자는 짝수인가? " + (n2 % 2 == 0));
		System.out.println("두번째 숫자는 'A'의 유니코드인가? " + (n2 == 'A'));
		// 문자는 숫자와 매칭되어 있다. 아스키코드, 유니코드 'A' = 65 'Z' = 90
		
		
	}

}

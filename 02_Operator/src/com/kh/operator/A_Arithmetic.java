package com.kh.operator;

/*
 * 산술 연산자 (이항 연산자) +, -, *, /  %
 * 우선순위 : / % > + -
 */


public class A_Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
				
	}
	
	public static void method1() {
		// 정수형 변수 n1 선언하고, 10을 대입
		int n1 = 10;
		// 정수형 변수 n2에 3을 대입
		int n2 = 3;
		
		System.out.println("n1 + n2 = " + (n1 + n2));
		// => n1 + n2 = 103 -> 순서대로 진행되기에 합이 아닌 나열만 진행됨, 소괄호를 만들어 우선 합연산 되도록 수정.
		System.out.println("n1 - n2 = " + (n1 - n2));
		// + 와 - 는 우선순위가 동일 => 왼쪽 연산자가 먼저 순차적으로 수행됨.
		System.out.println("n1 * n2 = " + (n1 * n2));
		// * 연산자가 + 보다 우선순위가 높아 ()를 생략해도 된다. 가독성 때문에 그냥 함.
		System.out.println("n1 / n2 = " + (n1 / n2));
		// / 연산자가 + 보다 우선순위가 높아 ()를 생략해도 된다. 가독성 때문에 그냥 함.
		System.out.println("n1 % n2 = " + (n1 % n2));
		// 나머지 연산자 %는 홀/짝을 판별하는데 사용
		// *짝수 : (변수 % 2 == 0)
		// *홀수 : (변수 % 2 != 0)
		System.out.println("n1은 짝수인가? " + (n1 % 2 == 0));
		System.out.println("n2은 짝수인가? " + (n2 % 2 == 0));
	}

}

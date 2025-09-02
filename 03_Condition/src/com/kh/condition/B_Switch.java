package com.kh.condition;

import java.util.Scanner;

public class B_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch
		 * : if 문과 동일한 조건문이지만 동등 비교를 통해 흐름을 비교한다.
		 * 실행할 코드만 실행하고 종료하기 위해서는 break 를 사용한다.
		 * 
		 * switch (비교대상) {
		 *  case 값1: 
		 * 		//비교대상 == 값1 경우 실행할 내용
		 * 	break;
		 * }
		 *  *  case 값2: 
		 * 		//비교대상 == 값2 경우 실행할 내용
		 * 	break; // break 는 생략 가능하지만 없으면 계속 실행됨
		 * 
		 * default:
		 * 		// 모든 case에 해당되지 않을 때 실행할 내용
		 * }
		 * 
		 */
		method1();

	}
	
	public static void method1() {
		
		/*
		 * 정수를 입력받아 아래 조건에 맞게 출력
		 * 1. 빨강 / 2.노란 / 3.파란 / 그외. 최록
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		int n = sc.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("빨간색");
			break;
		case 2:
			System.out.println("노란색");
			break;
		case 3:
			System.out.println("파란색");
			break;
			default:
				System.out.println("초록색");
				
		}
		
		
	}

}

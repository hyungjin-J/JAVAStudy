package com.kh.loop;

import java.util.Scanner;

public class C_DoWhile {
	/*
	 * do ~ while 문
	 * : 처음 무조건 실행 후 조건문 검사
	 * [표현식]
	 * do {
	 *   		반복할 내용
	 *   } while (조건식);
	 * 실행 순서
	 * 반복할 내용 실행 > 조건식 검사 > true 라면 반복할 내용 수행
	 * > 조건식 검사 -> true 라면 반복할 내용 수행 .... 반복
	 * ----- 계속 반복 -----
	 * 조건식이 false 라면 반복문 종료
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자에게 입력받은 정수를 계속해서 더한 후 출력
		//단 사용자가 0을 입력했을 경우, 반복문 종료
		Scanner sc = new Scanner(System.in);
		int total = 0; // 총 합을 저장할 변수
		int inputNum = 0; // 사용자가 입력한 값을 저장한 변수
		
		do { 
			System.out.print("정수 입력 : ");
			inputNum = sc.nextInt();
			
			total += inputNum;
		} while(inputNum !=0); // 사용자가 입력한 값이 0이 아닌 동안 반복
			System.out.println("총 합 : " + total);
			sc.close();
	}

}

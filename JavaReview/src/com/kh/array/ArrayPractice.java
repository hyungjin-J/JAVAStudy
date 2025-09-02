package com.kh.array;

public class ArrayPractice {
	/*
	 * 배열 : 자료 구조 중 하나. 같은 종류의 데이터를 여러 개 저장할 수 있는 공간
	 * 
	 * 선언 : 자료형[] 변수명;
	 * 
	 * 할당(생성) : 변수명 = new 자료형[배열 크기];
	 * 값 대입 : 변수명[인덱스(위치값)] = 값;  * 인덱스는 0부터 ~ 배열크기 -1 까지
	 * 
	 * 초기화 : 자료형[] 변수명 = {값, 값, 값, 값};
	 * **************************************************
	 * 일반 변수 : 기본 자료형으로 선언된 변수들 (값을(리터럴) 저장하고 있음)
	 * 참조 변수 : 기본 자료형 외 타입으로 선언된 변수들(배열,객체,...)
	 * 		   : 주소값을 저장하고 있다.
	 * 
	 */

	public static void main(String[] args) {
		//1부터 5까지 값을 저장하고자 할 때
		int[] arr = new int[5]; // 인덱스 0~4\
		
		arr[0] = 1;
		arr[1] = 2;
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = i + 1;
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//foreach 문
		for(int item : arr) {
			System.out.println("* " + item);
		}
		
	}

}

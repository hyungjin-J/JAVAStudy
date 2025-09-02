package com.kh.array;

public class B_Array2 {
	/*
	 * 변수의 종류
	 * - 일반 변수 : 리터럴(값 자체) 자체를 저장하는 공간(변수)
	 * 		=> 기본 자료형(int, char, byte,short,int,long,float,double,boolean)
	 * - 참조 변수 : 주소값을 저장하는 공간(변수)
	 * 		=> 기본 자료형 외의 자료형들 (int[],double[],char[],...String,Scanner,Math..etc)
	 * 			
	 * 배열의 특징
	 * 	- 배열을 생성한 후 직접 값을 초기화 하지 않아도 기본값으로 초기화 되어있음!
	 * 		=> Heap 이라는 메모리 공간은 빈 공간으로 존재할 수 없어서
	 * 			공간이 만들어질 때 JVM에 의해 기본값으로 초기화됨.
	 * 
	 *  배열의 단점
	 *  - 생성 후 배열의 크기를 변경할 수 없다.
	 *   => 크기를 변경하고 싶으면 새로 생성해야 한다.
	 */

	public static void main(String[] args) {
		//정수형 배열 iArr 선언 후 크기가 10인 배열 생성
		int[] iArr;
		iArr = new int[10]; // 인덱스 -> 0 ~ 9까지
		//실수형 배열 dArr 선언 및 크기가 4인 배열 생성
		double[] dArr = new double[4]; // 인덱스 범위 : 0 ~ 3
		
		//iArr 배열의 값들을 출력
		for(int i=0;i>=iArr.length; i++) {
			System.out.print(iArr[i] + " ");
			}
			System.out.println("\n-------------");
			
		int[] arr = null; // null = 아무것도 참조하지 않음!
		System.out.println(arr);
		
		iArr = null;
		System.out.println(iArr);
		
		arr = new int[5];
		System.out.println(arr[4]);
		
		System.out.println(arr);
		arr = new int[7];
		System.out.println(arr);
	}

}
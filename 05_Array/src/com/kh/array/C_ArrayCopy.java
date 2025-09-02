package com.kh.array;

public class C_ArrayCopy {

	public static void main(String[] args) {
		//shallowCopy();
		deepcopy();
	}
	public static void shallowCopy() {
		/*
		 * 얕은 복사 = > 주소값(참조값) 복사
		 * 
		 * 		 
		 */
		
		int[] origin = {1, 2, 3, 4, 5};
		System.out.println("====원본 배열 출력=====");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
			
		}
		System.out.println();
		int[] copy = origin;
		// 얕은 복사 -> 주소값이 복사됨
		
		System.out.println("====사본 배열 출력====");
		for (int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 200;

		System.out.println("====사본 배열 출력====");
		for (int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		System.out.println("====원본 배열 출력=====");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
			
		}
		System.out.println();
		
	}
	/**
	 * 깊은 복사 : 새로운 배열을 생성하여 원본 배영의 값을 복사 
	 */
	
	public static void deepcopy() {
		
		int[] origin = {1,2,3,4,5};
		//복사본 배열(copy)을 선언하고 원본배열 크기만큼 할당(생성)
		
		int[] copy = new int[origin.length];
		
		//for 문 이용하여 복사하기
		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
			
		}
		for(int n : copy) {
			System.out.print(n + " ");
		}
				
		copy[2] = 999;
		
		for(int n : copy) {
			System.out.print(n + " ");
		}
		
		//--------------------------------------------------------
		
		
		}
		
	}
	



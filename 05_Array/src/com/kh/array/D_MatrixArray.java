package com.kh.array;

public class D_MatrixArray {
	/*
	 * 2차원 배열 = 배열 안의 배열
	 * "같은" 자료형의 "1차원 배열의 묶음"
	 * 2차원 배열은 할당된 공간마다 인덱스 번호를 2개씩 사용
	 * :앞의 번호 : 행의 인덱스 (몇번째 1차원 배열인지),
	 * :뒤의 번호 : 열의 인덱스 (1차원 배열에서 몇번째 데이터인지)
	 * 
	 * 선언 -> 1차원 배열의 묶음을 참조하는 2차원 배열 참조변수를 만듬!
	 * 
	 * 자료형[][] 배열명; <= 권장
	 * 자료형 배열명[][];
	 * 자료형[] 배열명[];
	 * 
	 * 할당(실제 생성)
	 * 
	 * 배열명 = new 자료형[행크기][열크기];
	 * 		행크기 = 1차원 배열의 갯수
	 * 		열크기 = 1차원 배열의 크기 (생략 가능 -> 생략시 가변 길이의 1차원 배열 할당 가능)
	 *
	 * 선언 및 할당 : 자료형[][] 배열명 = new 자료형[행크기][열크기];
	 * 
	 * 값 대입
	 * 		배열명[행인덱스][열인덱스] = 값;
	 * 		*행인덱스 : 몇번째 1차원 배열인지
	 * 		*열인덱스 : 1차원 배열에서 몇번째 데이터인지 (인덱스)
	 */

	public static void main(String[] args) {
		
		//Practice1();
		Practice2();

	}
	public static void Practice1() {
		// 정수형 2차원 배열 arr 선언
		
		int[][] arr;
		// 크기가 4인 1차원 배열 3묶음으로 할당
		//arr = new int[3][4];
		arr = new int[3][];
		
		for(int i=0;i<arr.length;i++) {
			// arr [0].length => 0 행에 할당된 열크기
			arr[i] = new int[4];
		}
		
		//값 대입 및 초기화
		int[][] arr2 = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		// 6이라는 값을 출력 -> [1][1] 1행 1열 위치에 있다.
		System.out.println(arr2[1][1]);
		
		
	}
	public static void Practice2() {
		/*
		 * "(0행 0열)" "(0행 1열)" "(0행 2열)"
		 * "(1행 0열)" "(1행 1열)" "(1행 2열)"
		 * "(2행 0열)" "(2행 1열)" "(2행 2열)"
		 */
		
		String[][] arr;
		arr = new String[3][3];
		
		//값 대입 (데이터 저장)
		
		arr[0][0] = "(0행 0열)";
		arr[0][1] = "(0행 1열)";
		
		// 노가다 가능하지만 반복문도 가능하다.
		
		/*
		for(int i=0; i<arr[0].length;i++) {
			arr[0][i] = "(0행" + i + "열)";
			
		}
		
		for(int i=0; i<arr[1].length;i++) {
			arr[1][i] = "(1행" + i + "열)";
		}
		for(int i=0; i<arr[2].length;i++) {
			arr[2][i] = "(2행" + i + "열)";
		}
		*/
	
		for(int row=0; row<arr.length; row++) { // row => 행의 인덱스로 사용
			
			for(int col=0; col<arr.length; col++) {
				// col => 열의 인덱스로 사용
				arr[row][col] = "(" + row + "행" + col + "열)";
				//row=0) col=0) arr[0][0] = "(0행 0열)";
				// col1=) arr[0][1] = "(0행 1열)";
			}
		}
		
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr.length; col++) {
				System.out.print(arr[row][col] + " ");
				}
			System.out.println();
		}
		
	}

}

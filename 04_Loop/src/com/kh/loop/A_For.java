package com.kh.loop;

public class A_For {
	/*
	 * 반복문 : 프로그램 흐름을 제어하는 문법 중 하나로
	 * 특정 코드를 반복 수행한다.
	 * 
	 * for 문 [표현식]
	 * for(초기식; 조건식; 증감식) {
	 *  // 반복적으로 수행할 내용;
	 *  }
	 *  초기식 : 반복문이 수행될 때 "최초" 한번만 실행하는 식
	 *  조건식 : 반복문이 "수행될 조건"을 작성하는 식
	 *  	- 조건식의 결과가 true 일 때 중괄호 내용 실행
	 *  	- 조건식의 결과가 false 일 때 빠져나오며 끝남
	 *  증감식 : 반복문을 제어하는 변수의 값을 증감시키는 식
	 *  
	 *  [for문 실행 순서]
	 *  	초기식 -> 조건식 검사 -> 결과가 true 인 경우 반복할 내용 수행
	 *  -> 증감식 반영 -> 조건식 검사 -> 실행 -> 증감식 반영 -> 조건식이 false 까지 반복
	 *  참고사항 : 초기식, 조건식, 증감식은 생략 가능
	 *  	=> 세미 콜론(;) 은 무조건 작성 해야함 ;;; 
	 */

	public static void main(String[] args) {
		
		//method1();
		//method2();
		//method3();
//		method4();
		method5();
	}
	/**
	 * "Happy" 5번 출력
	 */
	public static void method1() {
		/*
		for(int i=0;i<5;i++) {
			System.out.println("Happy");
		}
		*/
		
		for(int i=1;i<6;i++) {
			System.out.println("Happy");
		}
		
		
	}
	public static void method2() {
		// 10부터 1까지 출력 10 9 8
		
		for(int i=10;i>0;i--) {
			System.out.print(i + " ");
		}
		
	}
	public static void method3() {
		
		//1부터 10까지의 숫자들의 합을 구하시오
		//총 합을 저장할 변수
		int total = 0;
		
		for(int i=1;i<=10;i++) {
			total += i;
		System.out.print(total + " ");	
		}
		System.out.println("1~10까지 총 합 : " + total);
		
	}
	public static void method4() {
		
		/*
		 * 랜덤값을 추출하여 1부터 그 값까지의 총 합
		 * [랜덤값을 구하는 방법]
		 * Math : java.lang.Math
		 * Math.random() 호출하여 사용
		 * 랜덤값의 범위 : 	0.0 ~ 0.999999....
		 * 
		 * ex) 1부터 10까지의 랜덤 값 추출
		 * Math.random() * 10 = 10 => 0.0 ~ 9.99999...
		 * Math.random() * 10 + 1 => 1.0 ~ 10.9999...
		 * (int)(Math.random() * + 1) => 1 ~ 10
		 */
		
		int random = (int)(Math.random() * 10 + 1);
		int total = 0;
		
		for(int i=1;i<=random;i++) {
			total += i;
		}
		System.out.printf("1부터 %d까지의 총 합 : %d\n", random, total);
	}
	public static void method5() {
		
		/**
		 * 구구단 출력 2단에서 ~ 9단까지 (중첩 반복문)
		 */	
		
		for(int dan=2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			
			for(int n=1; n<= 9; n++) {
				System.out.printf("%d x %d = %d\n",dan,n,dan*n);
			}
		}
	}
	
	
	
	
	
	
}

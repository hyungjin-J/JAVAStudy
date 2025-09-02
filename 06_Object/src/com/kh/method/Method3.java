package com.kh.method;

public class Method3 {
	
	/*
	 * 메소드에서 return 의 의미
	 * (1) 반환 값을 돌려준다 -> return 값;
	 * (2) 메소드를 종료시키는 역할 -> return; << 값 없이
	 */

	public static void main(String[] args) {
		divide(100,7);

	}
	public static void divide(int n1, int n2) {
		if(n2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		
		System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
		
	}
	

}

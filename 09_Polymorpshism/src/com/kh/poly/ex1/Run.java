package com.kh.poly.ex1;

public class Run {
/*
 * 클래스명 참조변수 						= new 클래스생성자;
 * 클래스명에 부모 클래스가 올 수 있음  | 클래스 생성자에 자식 클래스로 생성할 수 있음
 * 
 * 실제로 어디까지 접근할 수 있는가?    | 실제로 어떤 형태로 메모리에 생성되었는가?
 */
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		//->c1이라는 변수는 Cake 멤버까지 접근 가능

		c1.sweet();
		c1.milky();
		//c1.yummy(); yummy는 접근 불가
		//=>sweet(); 오버라이딩된 메소드는 실제 메모리에 있는 재정의 된 메소드가 실행
		
		// CheeseCake c2 = new Cake(); // yummy()가 없어
		//일치하지 않기에 생성 불가

	}

}

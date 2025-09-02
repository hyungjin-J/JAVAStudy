package com.kh.object.basicPerson;

public class run {

	public static void main(String[] args) {
		// 정의해둔 Person 클래스를 사용할거임.
		// 사용하기 위해서는 객체를 생성해야 함!
		
		// * 변수 선언 : 클래스명 변수명;
		
		Person p1; // 선언만 했을 경우, 변수는 null 값을 가지고 있는 상태이다.(참조하는게 없다.)
		
		// 객체를 생성 (인스턴스 생성)
		// 선언한 변수에 대입 -> 변수명 = new 클래스명(); : 생성자
		p1 = new Person();
		
		// 인스턴스 변수에 접근 : 변수명.인스턴스 변수명;
		p1.name ="정형진";
		p1.age = 39;
		
		// 인스턴스 메소드에 접근 : 변수명.인스턴스메소드명()
		p1.intrduce();
		
		//선언과 할당을 동시에 해보자.
		
		Person p2 = new Person();
		
		p2.name ="임대현";
		p2.age = 20;
		p2.intrduce();
		
		Person p3 = new Person("아이유", 33);
		
		p3.intrduce();
	}

}

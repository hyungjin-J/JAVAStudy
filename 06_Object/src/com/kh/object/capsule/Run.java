package com.kh.object.capsule;

public class Run {

	public static void main(String[] args) {
		//Person 객체 생성
		
		Person p1 = new Person();
		// p1.name = "홍길동" private 할당으로 접근 불가
		p1.setName("정형진"); // 직접 값을 변경하는 것이 아닌 setter 를 통해
		                    // 간접적으로 값을 변경
		Person p2 = new Person();
		p1.setAge(20);
	
		p1.intrduce();
		
		// Person p2 = new Person("정형진,20"); //매개변수 생성자가 없어 사용 불가!
		System.out.println(p2.getName());

	}

}

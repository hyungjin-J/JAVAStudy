package com.kh.collection.set.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.collection.set.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		HashSet hs1 = new HashSet();
		
		hs1.add("반가워요");
		hs1.add(new String("반가워요"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("힘내요!"));
		hs1.add(new String("힘내요!"));
	
		System.out.println(hs1);
		// =>저장 순서 유지 X, 인덱스 X 중복된 데이터 저장 불가
		// String 클래스에는 HashCode() 가 오버라이딩 되어있음
		//	=>실제 담긴 문자열을 가지고 10진수의 형태로 반환해준다.
		// String 클래스에 equals() 도 오버라이딩 되어있음
		// => 실제 담긴 문자열의 값을 비교하여 일치하면 true 그렇지 않으면 false
		
		HashSet<Student> hs2 = new HashSet<>();
		
		hs2.add(new Student("정형진",40,77) );
		hs2.add(new Student("이병건",43,98) );
		hs2.add(new Student("매직박",45,96) );
		hs2.add(new Student("손흥민",34,94) );
		hs2.add(new Student("손흥민",34,94) );
		
		System.out.println(hs2);
		
		//중복 제거가 되지 않음
		//Object 클래스의 hashCode()
		// 해당 객체의 "주소값"을 가지고 10진수 형태로 반환해준다.
		// 즉, 저장된 값 상관 없이 "주소값" 상태로 반환됨
		//Object 클래스의 equals()
		//=>두 객체의 "주소값"을 비교해서 같으면 true 다르면 false
		
		//-------------------------------- 
		
		// Student 에 hashCode() 오버라이딩
		//->실체 각 필드에 담긴 데이터들이 일치하면(합해서) 10진수 형태로 반환
		// Student 에 equals() 오버라이딩
		// ->실제 각 필드에 담긴 데이터를 가지고 비교, 모두 일치하면 true, 그렇지 않으면 false
		
		System.out.println(new Student("손흥민", 34,94).hashCode());
		System.out.println(new Student("손흥민", 34,94).hashCode());

		System.out.println(new Student("손흥민", 34,94).equals(new Student("손흥민", 34,94)));
		
		
		//for 문을 사용하여 hashSet에 담긴 데이터를 순차적으로 접근하자
		
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		//ArrayList에 저장한 다음, 반복문을 사용
		//저장 방법 : ArrayList 생성 후 addAll 메소드 사용
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hs2);
		
		//ArrayList 생성과 동시에 전달하기
		ArrayList<Student> list2 = new ArrayList<>(hs2);
		for(int i=0; i<list2.size();i++) {
			System.out.println( list.get(i));
		}
		//Iterator 반복자를 이용하여 순차적으로 접급하기
		Iterator<Student> it = hs2.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
		
	}

}

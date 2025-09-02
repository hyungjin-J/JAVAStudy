package com.kh.run;

import java.util.Scanner;

import com.kh.model.vo.Student;

public class Run {
	/*
	 * 객체 배열 : 여러개의 객체를 저장하는 구조
	 * 선언 : 클래스명[] 변수명;
	 * 할당(생성) : 변수명 = new 클래스명[배열 크기];
	 * 배열에 값을 초기화 (대입) : 변수명[인덱스] = new 클래스명();
	 *  
	 */

	public static void main(String[] args) {
		//크기가 3인 정수형 배열 선언 및 할당
		int[] iArr = new int[3]; // |0|0|0|
		
		for(int i=0;i<iArr.length;i++) {
			iArr[i]=i+1;
			System.out.println(iArr[i]);
		}
		//--------------------------------
		
		/*
		 * 학생 정보를 담을 객체 배열 선언 및 할당
		 * 객체 배열
		 * 클래스명[] 배열명 = new 클래스명[배열 크기];
		 */
		
		Student[] stdArr = new Student[3]; // 인덱스에 현재 null 드가있음
		
		for(int i=0;i<stdArr.length;i++) {
			System.out.println(stdArr[i]);
		}
		//객체 배열에 데이터를 저장(대입)
		// 배열명[인덱스] = new 클래스명();
		
		stdArr[0] = new Student("정형진", 20, 91.1);
		stdArr[1] = new Student("임대현", 20, 100.0);
		stdArr[2] = new Student("둘리", 13, 88.5);
		
		
		stdArr[2].printinfo();
		
		Student[] sArr = new Student[2];
		Scanner sc = new Scanner(System.in);
		
		//반복문을 이용하여 입력 받은 값으로 배열에 저장
		
		for(int i=0; i<sArr.length;i++) {
			System.out.print("- 이름 : ");
			String name = sc.next();
			
			System.out.print("- 나이 : ");
			int age = sc.nextInt();
			
			System.out.print("- 성적 : ");
			double score = sc.nextDouble();
			//i 번째 위치에 입력받은 학생 정보 저장 -> 객체 생성 대입
			
			sArr[i] = new Student(name, age, score);
		}
	//출력
		for(Student s : sArr ) { 
			s.printinfo();
		}
		
	}

}

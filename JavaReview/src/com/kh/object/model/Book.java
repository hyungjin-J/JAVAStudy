package com.kh.object.model;

public class Book {
	private String title;
	private String author;
	
	
	//-------생성자부----------
	//=>특징 : 반환형이 없고, 이름이 클래스명과 동일
	//접근제한자 생성자명(매개변수){}
	//객체가 생성될 때 수행할 내용 (초기화)
	
	//기본생성자 : 생성자가 하나도 정의되어있지 않았을 때, 자동으로 추가되는 생성자
	public Book() {}
	public Book(String title, String author) {
		//this = 현재 객체를 의미함.
		
		this.title = title;
		this.author = author;
		
	}
	
	//title 필드의 getter
	public String getTitle() {
		return title;
	} //title 필드의 setter
	public void setTitle(String title) {
		this.title = title;
	}//author 필드의 getter
	public String getAuthor() {
		return author;
	}//author 필드의 setter
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//메소드부----------------------
	// 접근제한자 예약어 반환형 메소드명 {동작할 내용}
	// toString() : 오버라이딩 되는 메소드
	// => 모든 필드의 값을 문자열로 반환하는 메소드
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
	

}

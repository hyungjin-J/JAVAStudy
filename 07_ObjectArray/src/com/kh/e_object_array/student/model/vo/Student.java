package com.kh.e_object_array.student.model.vo;

public class Student {
		
	private String name;
	private String subject;
	private int score;
	
	public Student(String name, String subject, int score) {
		this.name = name; 
		this.subject = subject;
		this.score = score; 
		 
	}
	
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	
	public void setName(String name) {
		this.name = name;		
	}
	public void setSubject(String subject) {
		this.subject = subject;		
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String inform(String name, String subject, int score) {
		return "이름" + name + "과목" + subject + "점수" + score;
		
	}
	
		
}

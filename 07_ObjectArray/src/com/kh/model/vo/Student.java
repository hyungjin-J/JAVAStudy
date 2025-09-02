package com.kh.model.vo;

public class Student {
	
	private String name; //이름
	private int age; //나이
	private double score; //성적
	
	// 기능 -> 공부한다. 밥먹기, 술마시기 등...
	
	public void printinfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 성적: " + score);
		
	}
	//getter /setter -> private 필드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
		
	}
	
	
	

}

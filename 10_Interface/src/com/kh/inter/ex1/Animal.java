package com.kh.inter.ex1;

//[접근 제한자] interface 인터페이스명
public interface Animal {
	//상수 필드와 추상메소드로 구성됨!
	//추상메소드=> 몸체(구형)가 없는메소드. 미완성
	
	public abstract void move();
	public /* abstract */ void eat();
	/* public abstract */ void makeSound();
	

}

package com.kh.inter.ex1;

public class Mouse implements Animal,Baby{

	@Override
	public void move() {
		System.out.println("");
		
	}

	@Override
	public void eat() {
		System.out.println("쥐는 호랑이 시체를 먹는다.");
		
	}

	@Override
	public void makeSound() {
		System.out.println("찍-- 찍--");
		
	}
	

}

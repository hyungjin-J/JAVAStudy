package com.kh.oop.model;

public abstract class PaymentMethod {
	private String methodName; //결제 수단 이름
	
	public PaymentMethod(String methodName) {
		this.methodName = methodName;
	}

	public String getMethodName() {
		return methodName;
	}
	
	//결제 로직 -> 추상 메소드
				// 몸체 없는 메소드, 규격만 잡아놓는 메소드
	
	public abstract void process(double money); 
	// => 추상 메소드의 구현 내용은 자식 클래스에서 구현하도록 처리

}

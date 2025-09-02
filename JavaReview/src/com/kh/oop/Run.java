package com.kh.oop;

import com.kh.oop.model.BankTransfer;
import com.kh.oop.model.PaymentMethod;
import com.kh.oop.model.Toss;

public class Run {

	public static void main(String[] args) {
		//결제 방식별 객체 생성
		Toss toss = new Toss();
		BankTransfer bt = new BankTransfer("123-1234-1234");
		
		toss.process(1000);
		System.out.println();
		bt.process(3000);
		
		//다형성 적용, 부모 타입으로 자식 객체를 다루는 기술
		PaymentMethod pm1 = new Toss();
		PaymentMethod pm2 = new BankTransfer("101-2222-5433");
		
		pm1.process(5000);
		System.out.println();
		pm2.process(900000);
		
		//----------------------------------------------
		PaymentMethod[] methods = new PaymentMethod[4]; //인덱스에는 null이 있는 상황
		methods[0] = new Toss();
		methods[1] = new BankTransfer("333-3123-4123");
		methods[2] = toss;
		methods[3] = bt;
		// ------------
		
		for(int i=0; i<methods.length;i++) {
			methods[i].process(10000);
			System.out.println();
		}

	}

}

package com.mypet.controller;

import com.mypet.model.Pet;

public class MyPetController {
	private String userName; // 사용자 이름
	private Pet pet; // 펫 정보
	
	// 생성자 생략되어있음 -> 기본 생성자가 만들어진다.
	
	public String getUserName() {
		return userName;
	}
	public void createUser(String userName) {
		this.userName = userName;
	}
	public Pet getPet() {
		return pet;
	}
	public void createPet(Pet pet) {
		this.pet = pet;
	}
	
	// 펫 상태 조회
	// @return 펫 상태 정보
	public String petStatus() {
		return pet.getStatus();
		
	}
	//펫 살아 있는지 확인하기
	//return = 펫의 생존여부
	public boolean isPetAlive() {
		return pet.isAlive();
	}
	
	//펫에 대한 행동을 처리하는 메소드
	// @param action (1: 밥주기 , 2. 놀아주기 , 3. 씻겨주기)
	public void doAction(int action) {
		
		switch (action) {
		case 1:
			pet.eat();
			break;
		case 2:
			pet.play();
			break;
		case 3:
			pet.clean();
			break;
		default:
		}
	}
	// 하루가 지났을 때 펫의 상태를 업데이트
	// 
	public void nextDay() {
		pet.passDay();
	}
}

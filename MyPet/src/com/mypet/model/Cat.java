package com.mypet.model;

public class Cat implements PetType {
/*
 * 	public abstract void eat(Pet pet);
	public abstract void play(Pet pet);
	void clean(Pet pet);
	String getType();
	
	해당 추상 메소드 들이 포함되어있음
 */
	
	/*
	 * 먹이를 받았을 때 상태 변경하자.
	 * 포만감 +10, 즐거움 +5, 청결함 -5
	 * @param pet 펫 정보 변경
	 */
	@Override
	public void eat(Pet pet) {
		
		pet.updateFullnessScore(10);
		pet.updateHappyScore(5);
		pet.updateCleanScore(-5);
		
	}

	@Override
	public void play(Pet pet) {
		
		pet.updateFullnessScore(-5);
		pet.updateHappyScore(20);
		pet.updateCleanScore(-10);
		
	}

	@Override
	public void clean(Pet pet) {
		
		pet.updateCleanScore(20);
		pet.updateFullnessScore(-5);
		pet.updateHappyScore(-10);
				
	}

	@Override
	public String getType() {
		
		return "고양이";
	}

}

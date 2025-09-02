package com.kh.Inherit.after;

//Product 클래스로부터 상속 받기 -> extends
public class Desktop extends Product{
/* 필요한 추가적인 정보는 따로 정의 해줘야 한다.
 * public Desktop(){
 * super(); // 부모클래스의 기본생성자 호출.
 * }
 * 	
 */
	private boolean allInOne;
	//---------생성자------------
	//매개 변수 5개인 생성자 -> 부모 클래스(Product)에서 4개, Desktop 에서 1개
	public Desktop(String brand,String code,String name,
			int price, boolean allInOne) {
		super(brand, code, name, price);
		// =>부모클래스의 매개변수가 4개인 생성자를 호출
		this.allInOne = allInOne;
				
			}
	// information():String -> 부모클래스에 정의되어 있음 allInOne만 추가
	@Override
	public String information() {
		return super.information() + ", allInOne: " + allInOne;
				
	}
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

}

package com.kh.d_object.practice1.model.vo;
/*
 * ---- 필드부 -----
 * productName : String
 * price : int
 * brand : String
 * 
 */

/*
 * 생성자 부
 * 
 * + Product()
 * + -> public  접근 제한자
 * product() => 기본 생성자
 * 
 * 접근 제한자 생성자
 * 
 * 메소드부
 * +setter() /getter() : private 필드에 대한 st메소드, get 메소드
 * +information() : void
 * 
 */
public class Product {
	private String productName;
	private int price;
	private String brand;
	
	public Product(){}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getPrice() {
		return price;		
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void information() {
		System.out.printf("%s / %d / %s\n",productName,price,brand);
	}


}

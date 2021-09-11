package com.demo.springbasics;

public class Phone {

	private String phoneName;
	
	private String modelName;
	
	private int price;

	public Phone() {
		
		System.out.println(this.getClass().getSimpleName()+ "Object Created");
	}
	
	
	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Phone [phoneName=" + phoneName + ", modelName=" + modelName + ", price=" + price + "]";
	}
	
	
}

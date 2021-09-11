package com.demo.springbasics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Watch {

	public Watch() {
		System.out.println(this.getClass().getSimpleName()+"object created");
	}
	
	@Value(value = "Fastrack")
	private String brand;
	
	@Value(value = "Silver")
	private String color;
	
	@Value(value = "2599")
	private int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Watch [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
	
}

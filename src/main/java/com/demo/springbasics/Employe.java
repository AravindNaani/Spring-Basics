package com.demo.springbasics;

public class Employe {

	private String name;
	
	private String designation;
	
	private String phnNum;

	public Employe(String name, String designation, String phnNum) {
		super();
		System.out.println(this.getClass().getSimpleName()+" Object Created");
		this.name = name;
		this.designation = designation;
		this.phnNum = phnNum;
	}

	
	@Override
	public String toString() {
		return "Employe [name=" + name + ", designation=" + designation + ", phnNum=" + phnNum + "]";
	}
	
}

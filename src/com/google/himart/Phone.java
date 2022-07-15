package com.google.himart;

public class Phone extends Product {
	private String company;
	
	public Phone() {
		this.setCompany("apple");
		this.setBrand("iphone");
		this.setPrice(1500000);
		this.setPoint(150);
	}
	
	public void info() {
		System.out.println(this.getCompany());
		System.out.println(this.getBrand());
		System.out.println(this.getPrice());
		System.out.println(this.getPoint());
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}

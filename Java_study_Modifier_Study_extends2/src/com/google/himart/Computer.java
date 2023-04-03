package com.google.himart;

public class Computer extends Product {
	private String cpu;
	
	public Computer() {
		this.setCpu("i5");
		this.setBrand("samsung");
		this.setPrice(1000000);
		this.setPoint(100);
	}
	
	public void info() {
		System.out.println(this.getCpu());
		System.out.println(this.getBrand());
		System.out.println(this.getPrice());
		System.out.println(this.getPoint());
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	
}

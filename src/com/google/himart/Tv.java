package com.google.himart;

public class Tv extends Product{
	private int size;
	
	public Tv() {
		this.setSize(100);
		this.setBrand("LG");
		this.setPrice(2000000);
		this.setPoint(200);
	}
	
	public void info() {
		System.out.println(getSize());
		System.out.println(getBrand());
		System.out.println(getPrice());
		System.out.println(getPoint());
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}

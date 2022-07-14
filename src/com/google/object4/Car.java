package com.google.object4;

public class Car {
	String company;
	String brand;
	String color;
	boolean gear;
	
	//인스턴스 초기화 블럭{}
	{
		this.company ="기아";
		this.brand = "k5";
		this.color = "black";
		this.gear = false;
	}
	
	public Car() {
		this.company ="현대";
		this.brand = "아반떼";
		this.color = "White";
		this.gear = true;
	}
	
	public Car(String color) {
		this.company ="현대";
		this.brand = "아반떼";
		this.color = color;
		this.gear = true;
	}
	
	public Car(String brand, String color) {
		this.company ="현대";
		this.brand = brand;
		this.color = color;
		this.gear = true;
	}
	
	public void info() {
		System.out.println("company :" + this.company);
		System.out.println("brand :" + this.brand);
		System.out.println("color :" + this.color);
		System.out.println("gear :" + this.gear);
		
	}
}

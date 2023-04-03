package com.google.terran;

import com.google.unit.Unit;

public class Scv extends Unit{
	//오버라이딩
	public void move() {
		System.out.println("이동");
	}
	
	public void attack() {
		System.out.println("공격");
	}
	
	public void work() {
		System.out.println("일하기");
	}

	
}

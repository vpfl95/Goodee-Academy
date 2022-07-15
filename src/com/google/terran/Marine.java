package com.google.terran;

import com.google.unit.Attacker;
import com.google.unit.Unit;

public class Marine extends Unit implements Attacker{
	
	private String weapon;
	
	public Marine() {
		//super(); 생략
		super(30);
		System.out.println("marine 생성자");
	}
	
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	//오버라이딩
	public void move() {
		System.out.println("구보로 움직이기");
	}
	//오버라이딩
	public void info() {
		super.info();
		System.out.println("marine info");
	}
	
	public void attack() {
		this.shoot();
	}
	
	private void shoot() {
		System.out.println("따다ㅏ다ㅏ");
	}
	
}

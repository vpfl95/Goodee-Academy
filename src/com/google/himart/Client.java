package com.google.himart;

public class Client {
	private int money;
	private int point;
	
	public Client() {
		this.money = 30000000;
		this.point = 10;
	}
	
	public void buy(Tv tv) {
		this.money -= tv.getPrice();
		this.point += tv.getPoint();
		System.out.println(this.money+","+this.point);
	}
	public void buy(Computer computer) {
		this.money -= computer.getPrice();
		this.point += computer.getPoint();
		System.out.println(this.money+","+this.point);
	}
	public void buy(Phone phone) {
		this.money -= phone.getPrice();
		this.point += phone.getPoint();
		System.out.println(this.money+","+this.point);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}

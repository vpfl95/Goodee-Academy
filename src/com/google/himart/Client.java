package com.google.himart;

public class Client {
	private int money;
	private int point;
	
	public Client() {
		this.money = 30000000;
		this.point = 10;
	}
	
	public void buy(Product product) {
		this.money -= product.getPrice();
		this.point += product.getPoint();
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

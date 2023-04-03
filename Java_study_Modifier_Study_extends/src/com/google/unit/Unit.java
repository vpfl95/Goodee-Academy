package com.google.unit;

public abstract class Unit {
	//클래스간의 공통 요소
		private int hp;
		private String color;
		private String name;
		
		public Unit() {}
		
		public Unit(int hp) {
			System.out.println("Super 생성자");
			this.hp=hp;
		}
		
		//
		public abstract void move(); 
		
		public void info() {
			System.out.println("Super Info");
		}
		
		
		public int getHp() {
			return hp;
		}
		public void setHp(int hp) {
			this.hp = hp;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}

package com.google.ex1;

public class Iu {
	private String name;
	private int age;
	//fix-study
	private String test;
	
	//싱글톤
	private static Iu iu = new Iu();
	private Iu() {}
	public static Iu getInstance() {	
		return iu;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//setter
	//public void set변수명(데이터타입 변수명){}
	
	//getter
	//public 리턴타입 get변수명(){retrun 변수명}
	
	
}

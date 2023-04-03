package com.google.lang;

public class Lang {
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString());
		Member member = new Member();
		member.toString();
		MemberClient mc = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		boolean check = car.equals(car2);
		System.out.println(check);
			
	}
	
}

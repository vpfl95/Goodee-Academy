package com.google.array;

public class Array_1 {

	public static void main(String[] args) {
		//배열 선언 : 모으려고하는 데이터타입 [] 변수명
		int age = 30;
		int [] nums = new int[3];
		char [] names = new char[2];
		nums[1] = age;
		nums[2] = 50;
		nums[0] = 10;
		names[0] = 'a';
		names[1] = 'b';
		System.out.println(names[0]);
		System.out.println(age);
		System.out.println(nums);
		System.out.println(nums[1]);
		
	}

}

package com.google.object2;

import java.util.Scanner;

public class Object2Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AnimalSound as = new AnimalSound();
		System.out.println("1.Dog 2.Cat 3.Tiger");
		int select = sc.nextInt();
		System.out.println("횟수를 입력");
		int count =sc.nextInt();
		
		if(select==1) {
			as.dogSound();
		}
		else if(select ==2) {
			as.catSound();
		}
		else {
			as.tigerSound();
		}
	}

}

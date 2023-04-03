package com.google.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		//제어문
		//1. 단일 if문
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num +"은 짝수입니다");
		}
		
	}

}

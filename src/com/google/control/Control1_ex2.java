package com.google.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = "홀수";
		
		if(num%2==0)
			str = "짝수";
		System.out.println(str);
			
		
	}

}

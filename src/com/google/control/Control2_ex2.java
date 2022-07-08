package com.google.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int result=0;
			System.out.println("1-5사이의 숫자 입력");
			int num = sc.nextInt();
			System.out.println("알파벳을 입력");
			char ch = sc.next().charAt(0);
			
			result = (ch+num)%26 + 78;
			
			if(Character.isUpperCase(ch)) {
				System.out.println((char)(result-26));
			}
			else {
				System.out.println((char)result);
			}
				
			System.out.println("======================");

		}
		

		//study edition
		//

		
	}

}

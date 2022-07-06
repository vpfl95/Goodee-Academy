package com.google.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// 1
		Scanner sc = new Scanner(System.in);
		int result=0;
		
		while(true) {
			
			System.out.println("1-5사이의 숫자 입력");
			int num = sc.nextInt();
			System.out.println("알파벳을 입력");
			char ch = sc.next().charAt(0);
			
			if(num==1) {
				result = (ch + 1)%26 + 78;
			}
			else if(num==2) {
				result = (ch + 2)%26 + 78;
			}
			else if(num==3) {
				result = (ch + 3)%26 + 78;
			}
			else if(num==4) {
				result = (ch + 4)%26 + 78;
			}
			else if(num==5) {
				result = (ch + 5)%26 + 78;
			}
			System.out.println((char)result);
			System.out.println("======================");

		}
		
		
		
	}

}

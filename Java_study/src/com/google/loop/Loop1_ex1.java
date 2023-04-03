package com.google.loop;

import java.util.Scanner;

public class Loop1_ex1 {
	public static void main(String[] args) {
		for(int i =0; i<10; i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
		for(int i =0; i<10; i+=2) {
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0; i<n; i++)
			System.out.println("멍멍");
		
	}
}

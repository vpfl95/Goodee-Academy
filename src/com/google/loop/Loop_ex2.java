package com.google.loop;

import java.util.Scanner;

public class Loop_ex2 {

	public static void main(String[] args) {
		//fps
		//총알 :  
		//탄창 : 30발, 3개
		//1.단발 탕, 2.점사 3발씩 탕탕탕
		
		Scanner sc = new Scanner(System.in);
		int mode;
//		for(int i=0; i<3; i++) {
//			System.out.println("1.단발 2.점사");
//			mode = sc.nextInt();
//			if(mode==1) {
//				for(int j=0; j<30; j++) {
//					System.out.println(j+1+"발 탕");
//				}
//			}
//			else {
//				for(int j=0; j<30; j+=3) {
//					System.out.println(j+3+"발 탕탕탕");
//				}
//			}
//		}
		for(int i=0; i<3; i++) {
			System.out.println("1.단발 2.점사");
			mode = sc.nextInt();
			for(int j=0; j<30; j++) {
				if(mode==1) {
					System.out.println(j+1+"발 탕");
				}
				else {
					System.out.println(j+3+"발 탕탕탕");
					j+=2;
				}
			}
		
		}
		
		
	}

}

package com.google.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		while(true) {
			System.out.println("================================");
			System.out.println("0.가위 1.바위 2.보 입력");
			int me = sc.nextInt();
			int com = random.nextInt(3);
			String me_str;
			String com_str;
			
			if(me==0) me_str = "가위";
			else if(me==1) me_str = "바위";
			else me_str = "보";
			if(com==0) com_str = "가위";
			else if(com==1) com_str = "바위";
			else com_str = "보";
			
			System.out.println("나:"+me_str +" "+ "컴:"+com_str);
			
			
			if(me==0 && com==2) {
				System.out.println("승리");
				break;
			}
			if(me>com) {
				if(me==2 && com==0) {System.out.println("패배");} 
				else {
					System.out.println("승리");
					break;
				}
			}
			else if(me==com) System.out.println("비김");
			else
				System.out.println("패배");
			
		}
		
		
		
	}
		
			
}

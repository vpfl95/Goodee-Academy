package com.google.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//월급을 입력
		//1. 정규직 2.계약직
		//정규직-국민연금1%,건보1.4%,고용보험0.5%,산재0.7%
		//계약직-3.3%
		double salary;
		int select;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월급 입력");
		salary = sc.nextDouble();
		
		System.out.println("1.정규직 2.계약직");
		select = sc.nextInt();
		
		if(select==1) {
			salary -= salary*0.036;
		}
		else if(select==2) {
			salary -= salary*0.33;
		}
		System.out.println("월급:"+salary);
		
		
		
		
	}

}

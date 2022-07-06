package com.google.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로 국영수 점수 차례로 입력
		//총점과 평균 계산, 평균 90이상이면 우등상
		//모든학생들은 졸업 출력
		//평균이 90이상이면 A, 80이상 B, 70이상이면 C, 60이상 D, 나머지 F
		Scanner sc = new Scanner(System.in);
		
		double korean, english, math, sum, avg;
		
		System.out.println("국영수 점수 입력");
		korean = sc.nextDouble();
		english = sc.nextDouble();
		math = sc.nextDouble();
		
		sum = korean + english + math;
		avg = sum/3;
		System.out.println("총점:"+sum+" "+"평균:"+avg);
		
		if(avg>=90) {
			System.out.println("우등상");
			System.out.println("A");
		}
		if(avg>=80 && avg<90) {
			System.out.println("B");
		}
		if(avg>=70 && avg<80) {
			System.out.println("C");
		}
		if(avg>=60 && avg<70) {
			System.out.println("D");
		}
		if(avg<60)
			System.out.println("F");
		
		System.out.println("졸업");	
		
	}

}

package com.google.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double korean, english, math, sum, avg;
		
		System.out.println("국영수 점수 입력");
		korean = sc.nextDouble();
		english = sc.nextDouble();
		math = sc.nextDouble();
		
		sum = korean + english + math;
		avg = sum/3;
		System.out.println("총점:"+sum+" "+"평균:"+avg);
		
		double select = avg / 10;
		switch((int)select) {
			case 10:
				System.out.println("A");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			
		}

	}

}

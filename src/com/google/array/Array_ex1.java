package com.google.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// 키보드로 인원수 입력. 인원수만큼 이름 입력, 이름 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원수 입력");
		int n = sc.nextInt();
		
		String[] names = new String[n];
		int[] korean = new int[n];
		
		System.out.println("이름 입력");
		for(int i=0;i<n;i++) {
			names[i] = sc.next();
		}
		System.out.println(Arrays.toString(names));
		
		System.out.println("학생의 국어 점수 입력");
		for(int i=0;i<names.length;i++) {
			korean[i] = sc.nextInt();
		}
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"의 국어 점수는"+korean[i]);
		}
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum+=korean[i];
		}
		System.out.println("총점"+sum);

	}

}

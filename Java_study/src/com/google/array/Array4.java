package com.google.array;


import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[2];
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(i+"번 인덱스 값 입력");
			nums[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(nums));

	}

}

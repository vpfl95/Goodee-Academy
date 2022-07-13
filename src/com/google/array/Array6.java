package com.google.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열의 길이 변경
		int [] nums = {1,2,3};
		int[] copy = new int[nums.length-1];
		System.out.println(Arrays.asList(nums).indexOf(4));
//		for(int i=0; i<copy.length; i++) {
//			copy[i] = nums[i];
//		}
//		nums =copy;
//		System.out.println(nums.length);
//		
//		for(int i=0; i<nums.length;i++) {
//			System.out.println(nums[i]);
//		}
		
	}


}

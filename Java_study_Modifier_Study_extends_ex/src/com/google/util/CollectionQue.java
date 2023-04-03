package com.google.util;

import java.util.Scanner;

public class CollectionQue implements Collection{
	//2. com.google.util.CollectionQue
	// add - 새로운 숫자 0번에 추가
	// remove - 마지막 인덱스 번호 삭제
	
	private Scanner sc;
	private int[] arr;
	
	public CollectionQue() {
		sc = new Scanner(System.in);
	}
	
	@Override
	public int[] add(int[] numbers) {
		System.out.println("숫자 입력");
		int num = this.sc.nextInt();
		
		this.arr = new int[numbers.length+1];
		arr[0] = num;
		for(int i=1; i<numbers.length+1; i++) {
			arr[i] = numbers[i-1];
		}
		return this.arr;
	}
	
	@Override
	public int[] remove(int[] numbers) {
		System.out.println("마지막 인덱스 삭제");
		
		this.arr = new int[numbers.length-1];
		if(numbers.length>0) {
			for(int i=0; i<numbers.length-1; i++) {
				arr[i] = numbers[i];
			}
		}
		return arr;
	}
}

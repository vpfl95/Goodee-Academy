package com.google.util;

import java.util.Scanner;

public class CollectionSet implements Collection {
	//3. com.google.util.CollectionSet
	//add - 새로운 숫자 추가 마지막에 추가
	//		단, 중복되지 않는 숫자만 추가
	//remove - 삭제할 숫자를 입력받아서 일치하는 것 삭제
	
	private Scanner sc;
	private int[] arr;
	private int[] arr2;
	public CollectionSet() {
		sc = new Scanner(System.in);
	}
	
	@Override
	public int[] add(int[] numbers) {
		System.out.println("삽입할 숫자 입력");
		int num = this.sc.nextInt();
		this.arr = new int[numbers.length+1];
		
		for(int i=0; i<numbers.length; i++) {
			arr[i] = numbers[i];
			if(num==numbers[i]) {
				System.out.println("중복 발생");
				return numbers;
			}
		}
		arr[numbers.length] = num;
		return arr;
	}
	
	@Override
	public int[] remove(int[] numbers) {
		System.out.println("삭제할 숫자 입력");
		int num =this.sc.nextInt();
		this.arr = new int[numbers.length-1];
		boolean check =false;
		if(numbers.length>0) {
			for(int i=0; i<numbers.length; i++) {
				if(num==numbers[i]) {
					check =true;
					for(int a=0; a<i+1;a++)
						arr[a]=numbers[a];
					for(int j=i; j<numbers.length-1; j++) {
						arr[j] = numbers[j+1];
					}
					break;
				}
			}
		}
		if(check)
			return arr;
		return numbers;
	}
}

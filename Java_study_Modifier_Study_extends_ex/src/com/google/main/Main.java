package com.google.main;

import java.util.Arrays;

import com.google.util.CollectionQue;
import com.google.util.CollectionSet;
import com.google.util.CollectionStack;

public class Main {

	public static void main(String[] args) {

		//1. com.google.util.CollectionStack 클래스 생성
			// add - 새로운 숫자 추가 무조건 0번에 추가
			//remove - 0번 인덱스 삭제
		//2. com.google.util.CollectionQue
			// add - 새로운 숫자 0번에 추가
			// remove - 마지막 인덱스 번호 삭제
		//3. com.google.util.CollectionSet
			//add - 새로운 숫자 추가 마지막에 추가
			//		단, 중복되지 않는 숫자만 추가
			//remove - 삭제할 숫자를 입력받아서 일치하는 것 삭제
		int[] numbers = {1,2,3};

//		CollectionStack stack = new CollectionStack();
//		numbers = stack.add(numbers);
//		System.out.println(Arrays.toString(numbers));
//		numbers = stack.remove(numbers);
//		System.out.println(Arrays.toString(numbers));
		
//		CollectionQue que = new CollectionQue();
//		numbers = que.add(numbers);
//		System.out.println(Arrays.toString(numbers));
//		numbers = que.remove(numbers);
//		System.out.println(Arrays.toString(numbers));
		
		CollectionSet set = new CollectionSet();
		numbers = set.add(numbers);
		System.out.println(Arrays.toString(numbers));
		numbers = set.remove(numbers);
		System.out.println(Arrays.toString(numbers));
		
			
	}

}

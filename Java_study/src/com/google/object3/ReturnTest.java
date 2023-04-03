package com.google.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	
	//title, host, 통장번호, 잔액 입력 받아서 리턴
	public Account makeAccount() {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		ac.title = sc.next();
		ac.host = sc.next();
		ac.numbers = sc.next();
		ac.balance = sc.nextLong();
		return ac;
	}
	
	public int[] makeRandom2(int n) {
		//메서드 호출시 숫자를 받아서 그 숫자만큼 랜덤한수를 뽑아서 리턴
		Random random = new Random();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = random.nextInt(50);
		}                               
		return arr;
	}
	
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		return num;
	}
	
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}

}

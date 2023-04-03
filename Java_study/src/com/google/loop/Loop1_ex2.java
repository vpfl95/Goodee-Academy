package com.google.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		// 1번 대문자, 2번 소문자
		//1번 소문자 A-Z, 2번 a-z출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.대문자 2.소문자");
		int n = sc.nextInt();
		
		if(n==1) {
			for(int i=65; i<91; i++) {
				System.out.println((char)i);
			}
		}
		else {
			for(int i=97; i<123; i++) {
				System.out.println((char)i);
			}
		}
		
		System.out.println("===========================");
		
		//1-10까지 합 구하기
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("sum = "+sum);
//		
		System.out.println("===========================");
		
		// ID, PW입력해서 로그인 판단 최대5번시도
		int yId=1234; //회원가입시 ID
		int yPw=5678; //회원가입시 PW
		int cnt=0;
		int id,pw;
		while(cnt<5) {
			System.out.println(cnt+1 +"번쨰");
			System.out.println("ID 입력");
			id = sc.nextInt();
			System.out.println("PW 입력");
			pw = sc.nextInt();
			cnt++;
			if(id==yId && pw==yPw ) {
				System.out.println(cnt+"번째 로그인 성공");
				break;
			}
		}
		if(cnt==5) {
			System.out.println("아이디 잠김");
		}
		
		
	}

}

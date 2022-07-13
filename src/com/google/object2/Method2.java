package com.google.object2;

import java.util.Scanner;

public class Method2 {
	//info 메서드 선언
	public void info() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력");
		String name = sc.next();
		
		Method1 mt = new Method1();
		mt.test();
		System.out.println(name);
	}
}

package com.google.object3;

import java.util.Arrays;

public class Object3Main1 {

	public static void main(String[] args) {
		ReturnTest rt = new ReturnTest();
		rt.info();
		int num = rt.makeRandom();
		System.out.println(num);
		
		int[] arr;
		arr = rt.makeRandom2(num);
		System.out.println(Arrays.toString(arr));
		
		Account ac = new Account();
		ac = rt.makeAccount();
		System.out.println(ac.title +" "+ ac.host +" "+ ac.numbers +" "+ ac.balance);
	}

}

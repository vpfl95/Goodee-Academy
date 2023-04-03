package com.google.string;

import java.util.Arrays;

public class StringStudy3 {
	
	public void studySplit() {
		String str = "iu,suji,choa,hani";
		
		String [] names = str.split(",");
		
		System.out.println(Arrays.toString(names));
		for(String name: names) {
			System.out.println(name);
		}	
	}
	
	public void studySplit2() {
		String info = "1997 12 24";
		String [] arr = info.split(" ");
		System.out.println(Arrays.toString(arr));
	}
	
	public void studySplit3() {
		String info= "서울,대전-대구,부산-제주,광주-강릉";
		info=info.replace("-", ",");
		System.out.println(info);
		String [] city = info.split(",");
		System.out.println(Arrays.toString(city));
	
	}
}

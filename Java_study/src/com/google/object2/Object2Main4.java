package com.google.object2;

public class Object2Main4 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.name ="iu";
		member.age =30;
		member.email ="asdfasdf";
		Member member2 = new Member();
		member2.name ="suzy";
		member2.age =25;
		member2.email ="qwewqret";
		Member member3 = new Member();
		member3.name ="choa";
		member3.age =35;
		member3.email ="zxcvzxcb";
		
		Member[] people = new Member[3];
		people[0] = member;
		people[1] = member2;
		people[2] = member3;
		Method4 mt4 = new Method4();
		mt4.info(people);
		System.out.println(people.length);
	}

}

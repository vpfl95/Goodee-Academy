package com.google.object2;

public class Object2Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method3 mt3 = new Method3();
		//월급 입력
		int salary = 5000000;
		mt3.sal(salary);
		System.out.println(salary);
		mt3.hap(10,20);
		mt3.info("iu", 30, "k_dh610@naver.com");
		Member member = new Member();
		member.name="iu";
		member.age=30;
		member.email="iu@gmail.com";
		mt3.info2(member);
		System.out.println(member.age);
	}

}

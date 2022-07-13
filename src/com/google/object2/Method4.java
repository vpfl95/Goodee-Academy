package com.google.object2;

public class Method4 {
	//info 멤버들의 정보 출력 메서드
	
	public void info(Member [] members) {
		for(int i=0; i<members.length;i++)
			System.out.println(members[i].name +" "+ members[i].age +" "+ members[i].email);
		
		members = new Member[2];
	}
}

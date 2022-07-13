package com.google.object1.ex1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StudentView {
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	public void viewAll(Student[] std) {
		for(int i=0; i<std.length; i++) {
			System.out.println("이름:"+std[i].name+" "
							+"번호:"+std[i].num+" "
							+"국어:"+std[i].kor+" "
							+"영어:"+std[i].eng+" "
							+"수학:"+std[i].math+" "
							+"총점:"+std[i].total+" "
							+"평균:"+std[i].avg+" ");
			
		}
	}
	
	//학생 한명의 정보를  받아서 모든 정보를 출력
	public void viewOne(Student std) {
			System.out.println("이름:"+std.name
							+" 번호:"+std.num
							+" 국어:"+std.kor
							+" 영어:"+std.eng
							+" 수학:"+std.math
							+" 총점:"+std.total
							+" 평균:"+std.avg);	
	}
	
	//문자열을 받아서 그 문자열을 출력
	public void viewMessage(String str) {
		System.out.println(str);
	}

}

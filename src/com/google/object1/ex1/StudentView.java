package com.google.object1.ex1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StudentView {
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	public void viewAll(Student[] std) {
		for(int i=0; i<std.length; i++) {
			System.out.println("이름:"+std[i].getName()
							+" 번호:"+std[i].getNum()
							+" 국어:"+std[i].getKor()
							+" 영어:"+std[i].getEng()
							+" 수학:"+std[i].getMath()
							+" 총점:"+std[i].getTotal()
							+" 평균:"+std[i].getAvg());
		}
	}
	
	//학생 한명의 정보를  받아서 모든 정보를 출력
	public void viewOne(Student std) {
			System.out.println("이름:"+std.getName()
							+" 번호:"+std.getNum()
							+" 국어:"+std.getKor()
							+" 영어:"+std.getEng()
							+" 수학:"+std.getMath()
							+" 총점:"+std.getTotal()
							+" 평균:"+std.getAvg());	
	}
	
	//문자열을 받아서 그 문자열을 출력
	public void viewMessage(String str) {
		System.out.println(str);
	}

}

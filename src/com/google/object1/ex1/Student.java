package com.google.object1.ex1;

public class Student {
	String name;
	int num;
	int kor;
	int eng;
	int math;
	int total;
	double avg;

	
	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
		this.setAvg();
	}
	
	public void setAvg() {
		this.avg = this.total/3;
	}
}

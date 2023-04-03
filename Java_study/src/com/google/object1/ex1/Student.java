package com.google.object1.ex1;

public class Student {
	private String name;
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	
	//getter
	public String getName() {
		return this.name;
	}
	public int getNum() {
		return this.num;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public int getTotal() {
		return this.total;
	}
	public double getAvg() {
		return this.avg;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setNum(int num) {
		if(num>0)
			this.num = num;	
	}
	public void setKor(int kor) {
		this.kor = this.checkPoint(kor);
	}
	public void setEng(int eng) {
		this.eng = this.checkPoint(eng);
	}
	public void setMath(int math) {
		this.math = this.checkPoint(math);
	}
	
	private int checkPoint(int point) {
		if(point<0 || point>100) {
			return 0;
		}
		return point;
	}

	public void setTotal() {
		this.total = this.kor + this.eng + this.math;
		this.setAvg();
	}
	
	private void setAvg() {
		this.avg = this.total/3;
	}
}

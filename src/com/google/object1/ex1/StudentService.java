package com.google.object1.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class StudentService {
	//makeStudents
	//학생수를 입력 받고,
	//학생수만큼 정보를 입력 받고,
	//학생들을 리턴
	public Student[] makeStudents() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int n =sc.nextInt();
		Student[] std = new Student[n];
		
		for(int i=0; i<n; i++) {
			Student student = new Student();
			System.out.println("이름, 번호, 국어, 영어, 수학 순서로 입력");
			student.name = sc.next();
			student.num = sc.nextInt();
			student.kor = sc.nextInt();
			student.eng = sc.nextInt();
			student.math = sc.nextInt();
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total /3;	
			std[i] = student;
		}
		return std;
	}
	
	//findStudent 검색하고 싶은 학생의 번호 입력 
	//같은 번호의 학생을 찾아서 그 학생 한명을 리턴
	//없으면 null리턴
	public Student findStudent(Student[] std) {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 번호 입력");
		int search_num = sc.nextInt();
		for(int i=0; i<std.length; i++) {
			if(search_num==std[i].num) {
				return std[i];
			}
		}
		return null;
	}
}

package com.google.object1.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class StudentService {
	
	
	Scanner sc;
	public StudentService() {
		sc = new Scanner(System.in);		
	}
	
	//makeStudents
	//학생수를 입력 받고,학생수만큼 정보를 입력 받고,학생들을 리턴
	public Student[] makeStudents() {
		System.out.println("학생 수 입력");
		int n =sc.nextInt();
		Student[] std = new Student[n];
		
		for(int i=0; i<n; i++) {
			Student student = new Student();
			System.out.println("이름, 번호, 국어, 영어, 수학 순서로 입력");
			student.setName(sc.next());
			student.setNum(sc.nextInt());
			student.setKor(sc.nextInt());
			student.setEng(sc.nextInt());
			student.setMath(sc.nextInt());
			student.setTotal();
			std[i] = student;
		}
		return std;
	}
	
	//findStudent 검색하고 싶은 학생의 번호 입력 
	//같은 번호의 학생을 찾아서 그 학생 한명을 리턴, 없으면 null리턴
	public Student findStudent(Student[] std) {
		System.out.println("검색할 번호 입력");
		int search_num = sc.nextInt();
		for(int i=0; i<std.length; i++) {
			if(search_num==std[i].getNum()) {
				return std[i];
			}
		}
		return null;
	}
	
	//addStudent
	//학생들의 정보를 받아서 학생 한명 추가, 학생정보들을 리턴
	public Student[] addStudent(Student[] std) {
		Student student = new Student();
		Student[] students = new Student[std.length+1];
		System.out.println("이름, 번호, 국어, 영어, 수학 순서로 입력");
		student.setName(sc.next());
		student.setNum(sc.nextInt());
		student.setKor(sc.nextInt());
		student.setEng(sc.nextInt());
		student.setMath(sc.nextInt());
		student.setTotal();
		for(int i=0; i<std.length; i++) {
			students[i] = std[i];
		}
		students[std.length] = student;
		return students;
	}
	
	//removeStudent
	//학생들의 정보를 받아서 삭제하려는 학생의 번호 입력 받음
	//일치하는 학생을 삭제, 남은 학생정보들을 리턴
	public Student[] removeStudent(Student[] std) {
		Student[] students = new Student[std.length-1];
		System.out.println("삭제할 학생의 번호를 입력하시오");
		int del_num = sc.nextInt();
		for(int i=0; i<std.length; i++) {
			if(del_num==std[i].getNum()) {
				for(int j=i; j<std.length-1; j++) {
					students[j] = std[j+1];
				}
				break;			
			}
			students[i] = std[i];
		}
		return students;
	}
	
}

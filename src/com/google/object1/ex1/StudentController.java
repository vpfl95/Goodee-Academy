package com.google.object1.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class StudentController {
	//start메서드 선언
	//1.학생정보 입력 - 학생 수 입력 -이름,번호,국어,영어,수학 입력 총점,평균 계산
	//2.학생정보 조회 - 모든 학생의 이름,번호,총점,평균 출력
	//3.학생정보 검색 - 검색할 학생의 번호 입력 -그학생의 모든 정보출력 -없으면 없다고 출력
	//4.학생정보 삭제 - 삭제할 학생의 번호 입력 -입력한 번호와 일치하는 학생의 정보 삭제 -없으면 없다출력
	//5.학생정보 추가 - 학생정보 한명 추가 
	//6.프로그램 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentView sv = new StudentView();
		Student[] std = null;
		
		while(true) {
			System.out.println("=========================");
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 정보 조회");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.학생 정보 추가");
			System.out.println("6.종료");
			System.out.println("=========================");
			int select = sc.nextInt();
			if(select==6) { 
				System.out.println("종료");
				break;
			}
			switch(select) {
				case 1:
					std = ss.makeStudents();
					break;
				case 2:
					if(std==null) {
						System.out.println("학생이 없음");
						break;
					}
					else
						sv.viewAll(std);
					break;
				case 3:
					Student student = ss.findStudent(std); 
					if(student==null) {
						sv.viewMessage("해당 학생이 없음");
					}
					else
						sv.viewOne(student);
					break;
				case 4:
					System.out.println("4");
					break;
				case 5:
					System.out.println("5");
					break;
			}
		}
	}
}

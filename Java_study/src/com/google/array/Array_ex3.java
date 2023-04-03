package com.google.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// 학교 성적프로그램
		//1.학생정보 입력 - 학생 수 입력 -이름,번호,국어,영어,수학 입력 총점,평균 계산
		//2.학생정보 조회 - 모든 학생의 이름,번호,총점,평균 출력
		//3.학생정보 검색 - 검색할 학생의 번호 입력 -그학생의 모든 정보출력 -없으면 없다고 출력
		//4.학생정보 삭제 - 삭제할 학생의 번호 입력 -입력한 번호와 일치하는 학생의 정보 삭제 -없으면 없다출력
		//5.학생정보 추가 - 학생정보 한명 추가 
		//6.프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.학생 정보를 입력하시오");
		int std_num = sc.nextInt();
		
		String[] name = new String[std_num];
		int[] num = new int[std_num];
		int[] kor = new int[std_num];
		int[] eng = new int[std_num];
		int[] math = new int[std_num];
		double[] sum = new double[std_num];
		double[] avg = new double[std_num];
		
		for(int i=0; i<std_num; i++) {
			System.out.println("이름, 번호, 국어, 영어, 수학");
			name[i] = sc.next();
			num[i] = sc.nextInt();
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			math[i] = sc.nextInt();
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / 3;
		}
		
		while(true) {
			int select;
			System.out.println("2.학생 정보 조회");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.학생 정보 추가");
			System.out.println("6.종료");
			select = sc.nextInt();
			if(select==6) { 
				System.out.println("종료");
				break;
			}
			switch(select) {
				case 2:
					for(int i=0; i<name.length; i++) {
						System.out.println("이름:"+name[i]
											+" 번호:"+num[i]
											+" 국어:"+kor[i]
											+" 영어:"+eng[i]
											+" 수학:"+math[i]
											+" 총점:"+sum[i]
											+" 평균:"+avg[i]);
					}
					break;
				case 3:
					System.out.println(Arrays.toString(num));
					System.out.println("검색할 번호 입력");
					int search_num = sc.nextInt();
					for(int i=0; i<num.length;i++) {
						if(search_num==num[i]) {
							System.out.println("이름:"+name[i]
											+" 번호:"+num[i]
											+" 국어:"+kor[i]
											+" 영어:"+eng[i]
											+" 수학:"+math[i]
											+" 총점:"+sum[i]
											+" 평균:"+avg[i]);	
						}
					}
					break;
					
				case 4:
					System.out.println(Arrays.toString(num));
					System.out.println("삭제할 번호 입력");
					int del_num = sc.nextInt();
					for(int i=0; i<num.length;i++) {
						if(del_num==num[i]) {
							String[] new_name = new String[name.length-1];
							int[] new_num = new int[name.length-1];
							int[] new_kor = new int[name.length-1];
							int[] new_eng = new int[name.length-1];
							int[] new_math = new int[name.length-1];
							double[] new_sum = new double[name.length-1];
							double[] new_avg = new double[name.length-1];
							for(int j=0; j<std_num; j++) {
								if(j==del_num) continue;
								new_name[j] = name[j];
								new_num[j] = num[j];
								new_kor[j] = kor[j];
								new_eng[j] = eng[j];
								new_math[j] = math[j];
								new_sum[j] = sum[j];
								new_avg[j] = avg[j];
							}
							name = new_name;
							num = new_num;
							kor = new_kor;
							eng = new_eng;
							math = new_math;
							sum = new_sum;
							avg = new_avg;
						}
					}
					
					break;
				case 5:
					String[] new_name = new String[name.length+1];
					int[] new_num = new int[name.length+1];
					int[] new_kor = new int[name.length+1];
					int[] new_eng = new int[name.length+1];
					int[] new_math = new int[name.length+1];
					double[] new_sum = new double[name.length+1];
					double[] new_avg = new double[name.length+1];
					for(int i=0; i<std_num; i++) {
						new_name[i] = name[i];
						new_num[i] = num[i];
						new_kor[i] = kor[i];
						new_eng[i] = eng[i];
						new_math[i] = math[i];
						new_sum[i] = sum[i];
						new_avg[i] = avg[i];
					}
					System.out.println(Arrays.toString(new_name));
					System.out.println("이름, 번호, 국어, 영어, 수학");
					int i =name.length;
					name = new_name;
					num = new_num;
					kor = new_kor;
					eng = new_eng;
					math = new_math;
					sum = new_sum;
					avg = new_avg;
					name[i] = sc.next();
					num[i] = sc.nextInt();
					kor[i] = sc.nextInt();
					eng[i] = sc.nextInt();
					math[i] = sc.nextInt();
					sum[i] = kor[i] + eng[i] + math[i];
					avg[i] = sum[i] / 3;
					
			}
	
		}
	}

}
		//3.학생정보 검색 - 검색할 학생의 번호 입력 -그학생의 모든 정보출력 -없으면 없다고 출력
		//4.학생정보 삭제 - 삭제할 학생의 번호 입력 -입력한 번호와 일치하는 학생의 정보 삭제 -없으면 없다출력
		//5.학생정보 추가 - 학생정보 한명 추가 
		//6.프로그램 종료
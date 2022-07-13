package com.google.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		//몬스터 기본 정보
		String[] monsterNames = {"고블린","오크","트롤","골렘"};
		int[] monsterHp = {5,7,10,15};
		
		//캐릭터이름 설정(마법사)
		System.out.println("캐릭터 이름 입력");
		String name = sc.next();
		//파이어볼
		int magicPower = 6;
		
		
		//몬스터 파티 생성
		//몬스터 수 입력(1~4), 입력한 수만큼 몬스터를 랜덤하게 뽑고 출력
		System.out.println("몬스터 수 입력");
		int n = sc.nextInt();
		String[] monster_party = new String[n];
		int[] monster_party_hp = new int[n];
		for(int i=0; i<n; i++) {
			int idx = random.nextInt(4);
			monster_party[i] = monsterNames[idx];
			monster_party_hp[i] = monsterHp[idx];
		}
		for(int i=0;i <n;i++) {
			System.out.println(monster_party[i]+"의 HP"+monster_party_hp[i]);
		}
		
		//1사냥 2도망
		//0-6미만 랜덤한 데미지로 공격
		
		while(true) {
			int death = 0;
			System.out.println("1.사냥 2.도망");
			int select = sc.nextInt();
			System.out.println("====================");
			if(select==1)
				for(int i=0; i<n; i++) {
					System.out.println("공격"); 
					if(monster_party_hp[i]>0)
						monster_party_hp[i] -= random.nextInt(magicPower);
					System.out.println(monster_party[i]+"의 HP"+monster_party_hp[i]);
					if(monster_party_hp[i]<=0)
						death++;
				}
			else
				break;
			System.out.println("데쓰"+death);
		}

	}

}

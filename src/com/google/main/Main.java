package com.google.main;

import com.google.animal.Cat;
import com.google.animal.Human;
import com.google.animal.Zoo;

public class Main {

	public static void main(String[] args) {
//		Cat cat = new Cat();
//		
//		cat.sound();
//		cat.age=5;
		Human human = new Human();
		//human.age = 500;
		human.setAge(150);
		human.info();
		//================================
		System.out.println(Zoo.title);
		Zoo.info();
		
		
	}

}

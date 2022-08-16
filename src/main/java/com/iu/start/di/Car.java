package com.iu.start.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car {
	//Car는 Engine이 없으면 안됨
	//Car는 Engine에 의존적이다.
	//1. private Engine engine = new Engine();
	//2. Car car = new Car();
	// car.engine = new Engine();
//3.public Car() {
//		this.engine = new Engine();
//	}
//4.{
//		this.engine = new Engine();
//	}
	//5.
//	Car car = new Car();
//	Engine engine = new Engine();
//	car.setEngine(engine);
	private Engine engine;
	private Wheel leftWheel;
	private Wheel rightWheel;
	

	public Car(Wheel leftWheel, Wheel rightWheel) {
		this.leftWheel = leftWheel;
		this.rightWheel = rightWheel;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}

package com.google.main;

import com.google.himart.Client;
import com.google.himart.Computer;
import com.google.himart.Phone;
import com.google.himart.Tv;

public class Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		Tv tv = new Tv();
		Phone phone = new Phone();
		computer.info();
		tv.info();
		phone.info();
		
		
		Client client = new Client();
		client.buy(tv.getPrice(), tv.getPoint());
	}

}

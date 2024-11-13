package com.spring.basics.demo;

public class CarEngine  implements Engine{ // to make loosely coupled we implements engine by creating an interface named engine
public void start() {
	System.out.println("CarEngine Started");
}
}

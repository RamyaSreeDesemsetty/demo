package com.spring.basics.demo;

public class Bike {
	private Engine engine;
	public Bike(Engine engine) {         //Car class no longer instantiates the  CarEngine
		                                // but accepts engine object through is constructor
		                                // this allows car class to work with any implementation of Engine interface that making it loosely coupled
		this.engine= engine;
	}
	public void startEngine() {
		engine.start();
	}
	public void drive() {
		System.out.println("Bike is Started");
	}
}

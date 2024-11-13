package com.spring.basics.demo;

public class Car {
//	Step-1
//  Example of Tight Coupling
//  private CarEngine careng;
//  public Car() {
//	careng = new CarEngine();         
//	                                  // car class directly instantiating an engine object in constructor
//	                                  // That is car class is tightly bound to specific implementation of CarEngine class
//}
//public void startEngine() {
//	careng.start();
//}
//Step-2
// Example of loosely Coupled
	private Engine engine;
public Car(Engine engine) {         //Car class no longer instantiates the  CarEngine
	                                // but accepts engine object through is constructor
	                                // this allows car class to work with any implementation of Engine interface that making it loosely coupled
	this.engine= engine;
}
public void startEngine() {
	engine.start();
}
	public void drive() {
		System.out.println("Car is Started");
	}

}

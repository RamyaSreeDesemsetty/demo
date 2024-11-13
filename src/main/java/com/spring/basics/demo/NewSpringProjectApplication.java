package com.spring.basics.demo;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NewSpringProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(NewSpringProjectApplication.class, args);
//	Step-1  
		/*For Tight coupling
		Car car = new Car();  
		car.drive();
		car.startEngine();
		*/
//	Step-2
    //	 For Loosely coupled
		/*
		Engine engine = new CarEngine(); 
		Car car = new Car(engine);
		car.drive();
		car.startEngine();
		*/
		//engine.start(); 
	/*line 19 and 21 both can replace this line and it get same output.
		we create an instance of CarEngine  class and assign it to the Engine interface variable engine.
		Then we call start() method directly on engine instance.This way we can start engine without involving car class.
This approach is suitable when you only need to interact with engine and do not require additional functionality provided by car class.
*/
//what if i want to call both car engine and bike engine.
	/*	
		Engine  carEngine = new CarEngine();
		Engine bikeEngine = new BikeEngine();
		carEngine.start();
		bikeEngine.start();
		*/
		//Step-3
		// working with Spring
		ApplicationContext  context = SpringApplication.run(NewSpringProjectApplication.class, args);
//		Method-1
//		CarNew engnew =   context.getBean(CarNew.class);
//		BikeNew engne =   context.getBean(BikeNew.class);
//		engnew.startEngine(); 
//		engne.startEngine();
//		Method-2
//		EngineNew obj = context.getBean(CarEngineNew.class);
//		EngineNew ob =  context.getBean(BikeEngineNew.class);
//		obj.start();
//		ob.start();
		//Method-3
		Map<String,EngineNew> obj = context.getBeansOfType(EngineNew.class);
		for(EngineNew engine: obj.values()) {
		
		engine.start();
		}
	}

}

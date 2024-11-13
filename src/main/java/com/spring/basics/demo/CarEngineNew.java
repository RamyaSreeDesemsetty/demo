package com.spring.basics.demo;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("carEngine")
public class CarEngineNew  implements EngineNew{

	@Override
	public void start() {
		System.out.println("CarEngineNew Started");
		
	}

}

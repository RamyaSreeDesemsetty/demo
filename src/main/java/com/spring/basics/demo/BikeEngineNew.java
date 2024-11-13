package com.spring.basics.demo;

import org.springframework.stereotype.Component;

@Component ("bikeEngine")
public class BikeEngineNew implements EngineNew {
	@Override
	public void start() {
		System.out.println("BikeEngineNew Started");
		
	}
}

package com.spring.basics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BikeNew {
	//Method-1
	/*
	@Autowired
	@Qualifier("carEngine")
	private EngineNew engnew;
	*/
	//Method-2
	/*
	private EngineNew engnew;
     @Autowired                                   //From 15 to 18 we are getting result through Constructor injection along with startEngine Method
	 public BikeNew(@Qualifier("bikeEngine")EngineNew engnew) {
		 this.engnew=engnew;
	 }
	 */
	
//	Method-3
	private EngineNew engnew;
    @Autowired                                   //From 26 to 29 we are getting result through Constructor injection along with startEngine Method
	 public  void setEngineNew(@Qualifier("bikeEngine")EngineNew engnew) {
		 this.engnew=engnew;
	 }
	
	 public void startEngine() {
		 engnew.start();
	 }
}

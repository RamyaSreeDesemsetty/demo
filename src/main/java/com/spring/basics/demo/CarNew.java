package com.spring.basics.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CarNew {
	// Method-1  - Field  Injection
	/*
	@Autowired
	@Qualifier("carEngine")
	private EngineNew engnew;
	*/
//Method-2 - Constructor Injection
	/*
private EngineNew engnew;
@Autowired                                                     //From 11 to 14 we are getting result through Constructor injection
 public CarNew(@Qualifier("carEngine")EngineNew engnew) {
	 this.engnew=engnew;
 }
 */
//	Method-3 - Setter Injection
	private EngineNew engnew;
    @Autowired                                   //From 24 to 27 we are getting result through Setter injection along with startEngine Method
	 public  void setEngineNew(@Qualifier("carEngine")EngineNew engnew) {
		 this.engnew=engnew;
	 }
 public void startEngine() {
	 engnew.start();
 }
}

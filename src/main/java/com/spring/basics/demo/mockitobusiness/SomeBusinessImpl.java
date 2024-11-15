package com.spring.basics.demo.mockitobusiness;

public class SomeBusinessImpl {
	private DataService dataService;
	
public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

public int findTheGreatestFrommAllData() {
	int [] data =  dataService.retrieveAllData();
	int greatestValue = Integer.MIN_VALUE;
	for(int value: data) {
		if(value > greatestValue) {
			greatestValue = value;
		}
		
	}
	return greatestValue;
}
}
interface DataService{
	int[] retrieveAllData();
}

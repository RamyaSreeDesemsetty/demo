package com.spring.basics.demo.mockitobusiness;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void test1() {
		DataService dataserviceStub = new DataServiceStub1();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataserviceStub);
		int result =businessImpl.findTheGreatestFrommAllData();
		assertEquals(27,result);
	}
	@Test
	void test2() {
		DataService dataserviceStub2 = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataserviceStub2);
		int result =businessImpl.findTheGreatestFrommAllData();
		assertEquals(27,result);
	}
}
	class DataServiceStub1 implements DataService{

		@Override
		public int[] retrieveAllData() {
			
			return new int[] {27,9,2};
		}
	}
		class DataServiceStub2 implements DataService{

			@Override
			public int[] retrieveAllData() {
				
				return new int[] {27};
			}
		}





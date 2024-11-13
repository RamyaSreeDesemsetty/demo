package com.spring.basics.demo.mockitobusiness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

class SomeBusinessImplMockTest {

	@Test 
	void testWithThreeArray() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {27,9,2});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result =businessImpl.findTheGreatestFrommAllData();
		assertEquals(27,result);
	}
	
	

}

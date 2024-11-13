package com.spring.basics.demo.mockitobusiness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MockAnnotationsExample {
	@Mock
	 private DataService dataServiceMock;
	 @InjectMocks
	 private SomeBusinessImpl businessImpl;

//	@Test
//	void testWithThreeArray() {
//		DataService dataServiceMock = mock(DataService.class);
//		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
//		SomeBusinessImpl business = new SomeBusinessImpl(dataServiceMock);
//		int result = business.findTheGreatestFrommAllData();
//		assertEquals(3,result);
//		
//		
//	}
	 @Test
		void testWithThreeArray() {
			
			when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
			
			int result = businessImpl.findTheGreatestFrommAllData();
			assertEquals(3,result);
			
			
		}

}

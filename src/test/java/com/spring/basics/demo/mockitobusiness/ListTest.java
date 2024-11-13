package com.spring.basics.demo.mockitobusiness;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	
	@Test
	void test() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(3);
		assertEquals(3,listMock.size());
	}
	@Test
	void test2() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(3).thenReturn(2);
		assertEquals(3,listMock.size());
		assertEquals(2,listMock.size());
	}
	@Test
	void parametertest1() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Something");
		assertEquals("Something",listMock.get(0));
	}
	@Test
	void parametertest2() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("Something");
		assertEquals("Something",listMock.get(0));
		assertEquals(null,listMock.get(1));
		
	}
	@Test
	void genericparametertest1() {
		List listMock = mock(List.class);
		when(listMock.get(Mockito.anyInt())).thenReturn("Something");
		assertEquals("Something",listMock.get(0));
		assertEquals("Something",listMock.get(1));
		
	}
}

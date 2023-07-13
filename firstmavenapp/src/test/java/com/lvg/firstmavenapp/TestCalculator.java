package com.lvg.firstmavenapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lvg.model.Calculator;

public class TestCalculator {
	Calculator c=null;
	
	@BeforeEach
	public void setUp() throws Exception{
		c=new Calculator();
	}
	@AfterEach
	public void tearDown() throws Exception{
		c=null;
	}
	@Test
	public void testSquare() {
		assertEquals(225,c.square(15));
	}
}

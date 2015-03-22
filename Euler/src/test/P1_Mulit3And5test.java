package test;

import static org.junit.Assert.*;
import main.P1_Mulit3And5;

import org.junit.Test;

public class P1_Mulit3And5test {

	P1_Mulit3And5 m3or5 = new P1_Mulit3And5();
	
	@Test
	public void shouldBe23IfInput10() {
		int expected = 23; 
		m3or5.setTotal(10);
		m3or5.multipleOf3And5();
		assertEquals(expected, m3or5.getTSum());
	}
	
	@Test
	public void shouldBe2138IfInput100() {
		int expected = 2318; 
		m3or5.setTotal(100);
		m3or5.multipleOf3And5();
		assertEquals(expected, m3or5.getTSum());
	}
	
	@Test
	public void shouldBe2138IfInput1000() {
		int expected = 233168; 
		m3or5.setTotal(1000);
		m3or5.multipleOf3And5();
		assertEquals(expected, m3or5.getTSum());
	}
}

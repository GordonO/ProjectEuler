package test;

import static org.junit.Assert.*;
import main.P5_SmallestMultiple;

import org.junit.Before;
import org.junit.Test;

public class P5_SmallestMultipleTest {

	// 2520 divide by 1-10 evenly
	// what is the number between 1-20

	P5_SmallestMultiple psm = new P5_SmallestMultiple();

	@Before
	public void initialize() {
		psm.setDividend(2520);
	}

	@Test
	public void testNumberShouldHaveNoRemainderDividedByOne() {
		assertTrue(psm.isDividedByEvenly(1));
	}

	@Test
	public void testNumberShouldHaveNoRemainderDividedByTwo() {
		assertTrue(psm.isDividedByEvenly(2));
	}

	@Test
	public void testNumberShouldHaveNoRemainderDividedByThree() {
		assertTrue(psm.isDividedByEvenly(3));
	}

	@Test
	public void test2520ShouldBeDivisableEvenlyBy1Thru10() {
		int expected = 2520;
		assertEquals(expected, psm.smallestMultiple(10));
	}

	@Test
	public void test232792560ShouldBeDivisableEvenlyBy1Thru20() {
		int expected = 232792560;
		assertEquals(expected, psm.smallestMultiple(20));
	}
}

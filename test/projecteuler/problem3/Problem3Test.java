package projecteuler.problem3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Problem3Test {

	Problem3 cut;
	
	@Before
	public void setup() {
		cut=new Problem3();
	}
	
	@Test
	public void givenZero_returnZero() {
		assertEquals(0, cut.findBiggestPrimeFactor(0));
	}

	@Test
	public void given2_return2() {
		assertEquals(2, cut.findBiggestPrimeFactor(2));
	}

	@Test
	public void given3_return3() {
		assertEquals(3, cut.findBiggestPrimeFactor(3));
	}

	@Test
	public void given4_return2() {
		assertEquals(2, cut.findBiggestPrimeFactor(2));
	}

	@Test
	public void given5_return5() {
		assertEquals(5, cut.findBiggestPrimeFactor(5));
	}

	@Test
	public void given6_return3() {
		assertEquals(3, cut.findBiggestPrimeFactor(6));
	}

	@Test
	public void given113_return113() {
		assertEquals(113, cut.findBiggestPrimeFactor(113));
	}

	@Test
	public void given2048_return2() {
		assertEquals(2, cut.findBiggestPrimeFactor(2048));
	}
}

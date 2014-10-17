import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

	private Problem6 cut;

	@Before
	public void setup() {
		cut = new Problem6();
	}

	@Test
	public void given0_return0() {
		assertEquals(0, cut.calcDifferenceOfSums(0));
	}

	@Test
	public void given1_return0() {
		assertEquals(0, cut.calcDifferenceOfSums(1));
	}

	/**
	 * 1^2 + 2^2 = 5
	 * (1 + 2)^2 = 9
	 * ==> 4
	 */
	@Test
	public void given2_return4() {
		assertEquals(4, cut.calcDifferenceOfSums(2));
	}

	/**
	 * 1^2 + 2^2 + 3^2 = 14
	 * (1 + 2 + 3)^2 = 36
	 * ==> 22
	 */
	@Test
	public void given3_return22() {
		assertEquals(22, cut.calcDifferenceOfSums(3));
	}

	/**
	 * See problem description.
	 */
	@Test
	public void given10_return2640() {
		assertEquals(2640, cut.calcDifferenceOfSums(10));
	}

}

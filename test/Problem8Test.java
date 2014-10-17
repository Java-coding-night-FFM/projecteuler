import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Problem8Test {

	Problem8 cut;

	@Before
	public void setup() {
		cut = new Problem8();
	}

	@Test
	public void given1AdjacentDigit_return9() {
		assertEquals(9, cut.findGreatestProductOfAdjacentDigits(1));
	}

	@Test
	public void given2AdjacentDigits_return81() {
		assertEquals(81, cut.findGreatestProductOfAdjacentDigits(2));
	}

	@Test
	public void given3AdjacentDigits_return648() {
		assertEquals(648, cut.findGreatestProductOfAdjacentDigits(3));
	}

	@Test
	public void given4AdjacentDigits_return5832() {
		assertEquals(5832, cut.findGreatestProductOfAdjacentDigits(4));
	}

}

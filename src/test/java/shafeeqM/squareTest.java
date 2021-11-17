package shafeeqM;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class squareTest {
	
	int result = 16;
	
	@Test
	public void testSquareFunction() {
		assertEquals(result, JunitTesting.square(4));
	}
}

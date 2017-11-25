
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class fibonacciTest {
	@Test
	public void testFibonacciHesap5() {
		int gerceksonuc=fibonacci.fibonacciHesap(5);
		assertEquals(3,gerceksonuc);
	}
	
}

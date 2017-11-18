import static org.junit.Assert.*;

import org.junit.Test;


public class OrtHesaplamaTest {
	@Test
	
	public void testOrtalamaHesapla55ve62() {
		int gercekSonuc = OrtHesaplama.ortHesap(55, 62);
		assertEquals(58, gercekSonuc);
	}

}

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {
	@Test
	public void testTopla33ve15() {
		int Sonuc = Hesaplama.topla(33, 15);
		assertEquals(48, Sonuc);
	}
}


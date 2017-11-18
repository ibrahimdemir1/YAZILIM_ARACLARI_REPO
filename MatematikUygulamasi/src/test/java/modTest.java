import static org.junit.Assert.*;
import org.junit.Test;

public class modTest {
	
	@Test
	public void TestMod20ve3() {
		int gercekSonuc = mod.modAlma(20, 3);
		assertEquals(2, gercekSonuc);
	}

}

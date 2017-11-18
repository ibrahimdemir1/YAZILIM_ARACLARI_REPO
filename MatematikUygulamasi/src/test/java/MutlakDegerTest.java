import org.junit.*;
import static org.junit.Assert.*;

public class MutlakDegerTest {

	@Test
	public void testHesapla() {
		int sonuc = MutlakDeger.hesapla(-3);
		
		assertEquals(3, sonuc);
	}
}

import org.junit.*;
import static org.junit.Assert.*;
public class bolmetest {
@Test
public void testHesapla() {
	int sonuc=bolme.hesapla(6, 1);
	assertEquals(6,sonuc);
}

}

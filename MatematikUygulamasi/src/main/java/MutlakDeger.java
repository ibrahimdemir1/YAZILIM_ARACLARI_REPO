
public class MutlakDeger {

	/**
	 * Bir sayinin mutlak degerini alan method
	 * 
	 * @param x mutlak degeri alinacak pozitif ya da negatif sayi
	 * 
	 * @return x'in mutlak degeri
	 */
	public static int hesapla(int x) {
		if (x<0) {
			return x*-1;
		} else {
			return x;
		}
	}
	
	public static int hesapla2(int x) {
		return Math.abs(x);
	}
}

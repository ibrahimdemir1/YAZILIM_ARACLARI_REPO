
public class OrtHesaplama {
//2 Sayinin ortalamasini alir. Ekrana bastirir.
	public static void main(String[] args) {
		
		int sonuc = ortHesap(55, 62);
		System.out.println("Ortalamaniz: " +sonuc);
		
		
	}
	public static int ortHesap(int sayi1, int sayi2) {
		return (sayi1+sayi2) /2;
	}

}

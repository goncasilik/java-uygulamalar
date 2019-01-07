class HavucluTatli extends YuvarlakTatli {
	float havuc;
	
	String tatliYap() { // static değil// sekerliTatli.tatliYap(); şeklinde çağırılır.
		return (this.buskivi + " Buskivi(g)\n" + this.seker + " Seker(g)\n"  + this.sut + " sut(ml)\n" + this.havuc + " havuc(adet)");	// bu da string değer döndürme 
	}
}
class KakaoluTatli extends YuvarlakTatli {
	float kakao;
	
	String tatliYap() {
		return (this.buskivi + " Buskivi(g)\n" + this.seker + " Seker(g)\n"  + this.sut + " sut(ml)\n" + this.kakao + " kakao(g)");	// bu da string değer döndürme 
	}
}

public class YuvarlakTatli {
	float buskivi;
	float seker;
	float sut;
	
	public static void main(String[] args) {
		KakaoluTatli kakaoluTatli = new KakaoluTatli();
		kakaoluTatli.buskivi = 300;
		kakaoluTatli.seker = 300;
		kakaoluTatli.sut = 250;
		kakaoluTatli.kakao = 100;
		// System.out.println("Şekersiz Tatli Şeker Oranı:" + sekerliTatli.seker + " g");
		System.out.println("Kakaolu Yuvarlak Tatli Tarifi\n" + kakaoluTatli.tatliYap());
		
		KakaoluTatli sekerliKakaoluTatli = new KakaoluTatli();
		sekerliKakaoluTatli.seker = 500;
		sekerliKakaoluTatli.buskivi = 300;
		sekerliKakaoluTatli.sut = 300;
		sekerliKakaoluTatli.kakao = 100;
		System.out.println("\nŞekerli Kakaolu Yuvarlak Tatli Tarifi\n" + sekerliKakaoluTatli.tatliYap());
		
		HavucluTatli sekersizHavucTatli = new HavucluTatli();
		sekersizHavucTatli.seker = 0;
		sekersizHavucTatli.buskivi = 300;
		sekersizHavucTatli.sut = 250;
		sekersizHavucTatli.havuc = 5;
		System.out.println("\nŞekersiz Havuç Tatlisi\n" + sekersizHavucTatli.tatliYap());
	}
}


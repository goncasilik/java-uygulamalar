class HavucTatlisi extends KareTatli {
	float havuc;
	
	HavucTatlisi(float buskivi, float sut, float seker, float havuc) {
		super(buskivi, seker, sut);
		this.havuc = havuc;
		System.out.println(this.buskivi + " Buskivi\n" + this.seker + " Seker(g)\n"  + this.sut + " sut(ml)\n" + this.havuc + " havuc(adet)");
	}
}

class KakaoTatli extends KareTatli {
	float kakao;
	
	KakaoTatli (float buskivi, float sut, float seker, float kakao) {	
		super(buskivi, seker, sut);
		this.kakao = kakao;
		System.out.println(this.buskivi + " Buskivi\n" + this.seker + " Seker(g)\n"  + this.sut + " sut(ml)\n" + this.kakao+ " kakao(gr)");
	}
}

public class KareTatli {
	float buskivi;
	float seker;
	float sut;
	
	KareTatli(float buskivi, float seker, float sut){
		this.buskivi = buskivi;
		this.seker = seker;
		this.sut = sut;
	}
	
	public static void main(String[] args) {
		System.out.println("\nŞekerli Havuc tatlisi");
		new HavucTatlisi(300, 200, 250, 3);
		System.out.println("\nSekersiz Havuc Tatlisi");
		new HavucTatlisi(300, 250, 0, 3);
		System.out.println("\nSekerli Kakao Tatlisi");
		new HavucTatlisi(300, 250, 300, 100);
	}
}


class Nisanci extends Karakter {
	boolean uzakSaldiri = true; // property
	boolean hizliKosma;
	Nisanci(String isim, int can, int enerji, boolean hizliKosma) { // constructor 
		super(isim, can, enerji);
		this.hizliKosma = hizliKosma;
		System.out.println("Isim: " + this.isim + "\nCan: " + this.can + "\nEnerji: " + this.enerji + "\nUzak Saldiri: " + this.uzakSaldiri + "\nHzýlý Koþma: " + this.hizliKosma);
	}
}
class Savasci extends Karakter {
	boolean yakinSaldiri = true;
	Savasci(String isim, int can, int enerji) {
		super(isim, can, enerji);
		System.out.println("Isim: " + this.isim + "\nCan: " + this.can + "\nEnerji: " + this.enerji + "\nYakýn Saldiri: " + this.yakinSaldiri);
	}
}
class Buyucu extends Karakter {
	boolean buyugucu = true;
	Buyucu(String isim, int can, int enerji, boolean buyugucu) {
		super(isim, can, enerji);
		System.out.println("Isim: " + this.isim + "\nCan: " + this.can + "\nEnerji: " + this.enerji + "\nUzak Saldiri: " + this.buyugucu);
	}
}
class Tank extends Karakter {
	boolean tanklama = true;
	Tank(String isim, int can, int enerji) {
		super(isim, can, enerji);
		System.out.println("Isim: " + this.isim + "\nCan: " + this.can + "\nEnerji: " + this.enerji + "\nTanklama: " + this.tanklama);
	}
}
class Destek extends Karakter {
	boolean koruma = true;
	Destek(String isim, int can, int enerji) {
		super(isim, can, enerji);
		System.out.println("Isim: " + this.isim + "\nCan: " + this.can + "\nEnerji: " + this.enerji + "\nUzak Saldiri: " + this.koruma);
	}
}
class Suikastci extends Karakter {
	boolean gizliSaldiri = true;
	Suikastci(String isim, int can, int enerji) {
		super(isim, can, enerji);
		System.out.println("Isim: " + this.isim + "\nCan: " + this.can + "\nEnerji: " + this.enerji + "\nUzak Saldiri: " + this.gizliSaldiri);
	}
}
public class Karakter {
	int can;
	String isim;
	int enerji;
	
	Karakter(String isim, int can, int enerji){
		this.isim = isim;
		this.can = can;
		this.enerji = enerji;
	}
	
	public static void main(String[] args) {
		Nisanci bruno = new Nisanci("Bruno", 3, 100, true);
		Savasci zilong = new Savasci ("Zilong", 3, 100);
		Tank tigreal = new Tank ("Tigreal", 3, 500);
	}
}


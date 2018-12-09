import java.util.Scanner; // Eklenmesi gerekenler: döngü, kullanýcý string girdiðinde karakter hatasý //

public class HesapMakinesi {
	public static void main(String[] args) {

		Scanner okuma = new Scanner(System.in);
		System.out.println("(1) Toplama Ýþlemi ");
		System.out.println("(2) Çýkarma Ýþlemi ");
		System.out.println("(3) Çarpma Ýþlemi ");
		System.out.println("(4) Bölme Ýþlemi ");
		System.out.println("(5) Karekök Hesapla ");
		System.out.println("(6) Faktöriyel Hesapla ");
		Boolean anahtar = true;
		while (anahtar) {
			System.out.print("Yapmak istediðiniz iþlem için bir numara seçin (cikmak icin q): ");
			String islemNumarasi = okuma.next(); // okuma.next() => string verir. okuma.nextInt() => integer deger uretir
			if (islemNumarasi.equals("1")) { // stringleri == mi diye kiyaslamak Java'da .equals metodu ile olur.
				topla(okuma);
			}
			else if (islemNumarasi.equals("2")) { // bu sayede kullanici 2 girerse => 2'ye esit mi diye bakiyoruz. Boylece cikarma fonksiyonunu cagiriyoruz
				cikarma(okuma);
			}
			else if (islemNumarasi.equals("3")) {
				carpma(okuma);
			}
			else if (islemNumarasi.equals("4")) {
				bolme(okuma);
			}
			else if (islemNumarasi.equals("5")) {
				karekok(okuma);
			}
			else if (islemNumarasi.equals("6")) {
				faktoriyel(okuma);
			}
			else if (islemNumarasi.equals("q")) {
				anahtar = false;
				System.out.print("Programdan cikis yaptiniz");
			}
			else {
				System.out.println("Lütfen yukarýda sýralanan numaralardan birini seçiniz!");
			}
		}
	}

	private static void topla(Scanner okuma) {
		System.out.print("Toplama iþlemi için birnci sayýyý giriniz: ");
		float sayi1 = okuma.nextFloat();
		System.out.print("Toplama iþlemi için ikinci sayýyý giriniz: ");
		float sayi2 = okuma.nextFloat();
		System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
	}

	private static void cikarma(Scanner okuma) {
		System.out.print("Çýkarma iþlemi için birnci sayýyý giriniz: ");
		float sayi1 = okuma.nextFloat();
		System.out.print("Çýkarma iþlemi için ikinci sayýyý giriniz: ");
		float sayi2 = okuma.nextFloat();
		System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));;
	}

	private static void carpma(Scanner okuma) {
		System.out.print("Çarpma iþlemi için birnci sayýyý giriniz: ");
		float sayi1 = okuma.nextFloat();
		System.out.print("Çarpma iþlemi için ikinci sayýyý giriniz: ");
		float sayi2 = okuma.nextFloat();
		System.out.println(sayi1 + " x " + sayi2 + " = " + (sayi1 * sayi2));
	}

	private static void bolme(Scanner okuma) {
		System.out.print("Bölme iþlemi için birnci sayýyý giriniz: ");
		float sayi1 = okuma.nextFloat();
		System.out.print("Bölme iþlemi için ikinci sayýyý giriniz: ");
		float sayi2 = okuma.nextFloat();
		if (sayi2 != 0) {
			System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
		}
		else {
			System.out.print("Bir sayýyý sýfýra bölemezsiniz!");
		}
	}

	private static void karekok(Scanner okuma) {
		System.out.print("Karekök alacaðýnýz sayýyý giriniz: ");
		double sayi = okuma.nextInt();
		double karekok = Math.sqrt(sayi);
		System.out.println(sayi + " 'in karekökü = " +karekok);
	}

	private static void faktoriyel(Scanner okuma) {
		int sayi;
		int faktoriyel = 1;
		System.out.println("Pozitif bir tam sayi giriniz: ");
		sayi = okuma.nextInt();
		if (sayi >= 0) {
			for (int i = sayi; i > 0; i--) {
				faktoriyel *= i;
			}
			System.out.println(sayi + " sayisinin faktoriyeli: " + faktoriyel);
		}
		else {
			System.out.println("Girdiðiniz sayý 0 veya 0'dan büyük olmalý");
		}
	}
}


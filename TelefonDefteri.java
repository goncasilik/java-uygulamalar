import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TelefonDefteri {
	public static void main(String[] args) {
		HashMap<String, String> rehber = new HashMap<String, String>();
		rehber.put("ali", "0555 236 99 88"); // key - value keylerimiz: ali, berk, levent; valuelarimiz: numaralar
		rehber.put("berk", "0555 276 99 00");
		rehber.put("levent", "0532 236 79 88");
		Scanner okuma = new Scanner(System.in);
		System.out.println("Numarasýna ulaþmak istediðiniz kiþin adýný giriniz: ");
		String isim = okuma.next().toLowerCase();
		System.out.println(rehber.get(isim));
		
		Set<String> isimler = rehber.keySet();
		//Anahtarlar listeleniyor
		for (String ad : isimler) {
			System.out.println(ad);
		}
		System.out.println("**********");
		//Deðer listesi alýnýyor
		Collection<String> numaralar = rehber.values();
		//Deðerler listeleniyor
		for (String numara : numaralar) {
			System.out.println(numara);
		}
		System.out.println("**********");
		
		//Kayýt anahtar ve deðerle alýnýyor
		Set<Map.Entry<String, String>> kayitlar = rehber.entrySet();
		//Anahtar ve deðerler listeleniyor
		for (Map.Entry<String, String> kayit : kayitlar) {
			System.out.println(kayit.getKey() + " - " + kayit.getValue());
		}
	}
}

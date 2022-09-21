package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Kısa sap bağlama!");
		
		//Değişken isimlendirmeleri java'da camelCase yazılır.
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
		
		//integer tam sayı için
		int vade = 12;
		
		//double ondalıklı sayı için fakat tam sayı için de kullanılabilir.
		double dolarDun = 18.10;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false; //veya true;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} 
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		//array
		
		String[] krediler = {"Hızlı kredi","Maaşını X'den","Mutlu Emekli"};
		
		//System.out.println(krediler[0]); (1. veri çıkar.)
		//System.out.println(krediler[1]); (2. veri çıkar.)
		//System.out.println(krediler[2]); (3. veri çıkar.)
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	
	}
		
}



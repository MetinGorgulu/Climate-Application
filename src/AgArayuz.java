

public class AgArayuz {
	
TusTakimi tusTakimi= new TusTakimi();
		 Eyleyici eyleyici =new Eyleyici();

		 public void secimEkraniGetir() {
	Ekran ekran	= new Ekran();
		int secim=0;
	
		while(true) {
			
			ekran.mesajGoruntule("**********************************************");
			ekran.mesajGoruntule("Ana Menu");
			ekran.mesajGoruntule("1-Sogutucuyu Ac");
			ekran.mesajGoruntule("2-Sogutucuyu Kapat");
			ekran.mesajGoruntule("3-Sicaklik Goruntule");
			ekran.mesajGoruntule("4-Cikis");
			ekran.mesajGoruntule("Seciminiz:");
			secim =tusTakimi.veriAlInt();
			ekran.mesajGoruntule("**********************************************");
								
			if(secim==1) {
				eyleyici.sogutucuAc();
				continue;
			}
			
			if(secim==2) {
				eyleyici.sogutucuKapat();
				continue;
			}
			
			if(secim==3) {
				ekran.mesajGoruntule("Sicaklik goruntuleniyor...");
				Araclar.bekle(1000);
				SicaklikAlgilayici sicaklikAlgilayici =new SicaklikAlgilayici();
				ekran.mesajGoruntule("Sicaklik :" +sicaklikAlgilayici.sicaklikOku()+" °C");
				ekran.mesajGoruntule("Secim ekraninina yonlendiriliyor..."); 
		      	Araclar.bekle(1000);
				continue;
			}
			
			if(secim==4) {
				ekran.mesajGoruntule("Çýkýlýyor...");
				break;
							
			}
			else {
				ekran.mesajGoruntule("1-4 arasýnda bir sayý girmelisiniz");			
			}
	
		}
			
		
	}
	
}

import java.util.concurrent.TimeUnit;

import include.IEyleyici;

public class Eyleyici implements IEyleyici {

	private Ekran ekran =new Ekran();
	
	@Override
	public void sogutucuAc() {
	
	SogutucuAcma acma =new SogutucuAcma();
	acma.islemYap();
	ekran.mesajGoruntule("Secim Ekranina Yonlendirliyor...");
	Araclar.bekle(1000);
	}

	@Override
	public void sogutucuKapat() {
		
		SogutucuKapa kapa =new SogutucuKapa();
		kapa.islemYap();
	}

}

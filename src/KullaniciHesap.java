
public class KullaniciHesap  implements IObserver {
	
	public KullaniciHesap(String kullaniciAdi, String kullaniciSifre) {
		super();
		this.kullaniciAdi = kullaniciAdi;
		this.kullaniciSifre = kullaniciSifre;
	}
	private String kullaniciAdi;
	private String kullaniciSifre;
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	public String getKullaniciSifre() {
		return kullaniciSifre;
	}
	public void setKullaniciSifre(String kullaniciSifre) {
		this.kullaniciSifre = kullaniciSifre;
	}
	@Override
	public void update(boolean klimaDurum) {
		System.out.println(this.kullaniciAdi+ " Kisisi Sogutucuyu "+(klimaDurum ? "Acti" :"Kapadi"));		
	}
}

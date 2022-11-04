
public class Kullanici1 implements IObserver {
	
	 private String ad;
	    private String sifre;

	    public Kullanici1(String adi, String sifresi) {
	        this.ad = adi;
	        this.sifre = sifresi;
	    }

	    public String getSoyad() {
	        return sifre;
	    }

	    public void setSoyad(String sifresi) {
	        this.sifre = sifresi;
	    }

	    public String getAd() {
	        return ad;
	    }

	    public void setAd(String ad) {
	        this.ad = ad;
	    }

		@Override
		public void update(boolean klimaDurum) {
			System.out.println(this.ad+ "Kisisi Sogutucuyu "+(klimaDurum ? "Acdi" :"Kapadi"));		
		}
	
}

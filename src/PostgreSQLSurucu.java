

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
	
public class PostgreSQLSurucu implements IVeritabaniRepository {

	Ekran ekran =new Ekran();

	TusTakimi tusTakimi = new TusTakimi();
public static KullaniciHesap hesap =new KullaniciHesap(null, null);
	private  Connection conn; 
	 private Connection baglan(){

	        Connection conn=null;
	    	try {
				 conn = DriverManager.getConnection(
						"jdbc:postgresql://localhost:5432/klima",
	                    "postgres", "12345");
				 ekran.mesajGoruntule("Veritabanýna baðlandý!");
				
			}
			catch(Exception e) {
				 ekran.mesajGoruntule("Baglanti sirasinda bir hata olustu !!!");
			}
	        return conn;
	    }
	
	
	
	@Override
	public KullaniciHesap kullaniciDogrulaIsim() {
		   ekran.mesajGoruntule("veritabanýna baðlandý (postgresql veritabaný yönetim sistemi) ve kullanýcýyý sorguluyor...");
		   
	        try
	        {
	        	ekran.mesajGoruntule("Kullanici adinizi giriniz..");
	        		String kullaniciAdi = tusTakimi.veriAlString();
	        		ekran.mesajGoruntule("Firma bilgi sistemi kullanýcýyý doðruluyor...");
	    	        Araclar.bekle(2000);
	            
	            Statement selectStmt = conn.createStatement();
	            ResultSet rs = selectStmt
	              .executeQuery("SELECT * FROM kullanici WHERE kullaniciadi = "+"'"+kullaniciAdi+"'");
	  
	           
	            if(!rs.next()) {
	            	
	             ekran.mesajGoruntule("Bu kullanici adina sahip biri bulunmamakta !!!"); 
	             
	             kullaniciDogrulaIsim();
	            }
	            else {
	    	              
	            	hesap =new KullaniciHesap(kullaniciAdi, null);
	            	return kullaniciDogrulaSifre(selectStmt,hesap);
	                  
	            } 
	        
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
			
		return null;
	}

	@Override
	public KullaniciHesap kullaniciDogrulaSifre(Statement selectStmt, KullaniciHesap hesap ) {
		
		
		 ekran.mesajGoruntule("Sifrenizi giriniz..");
 		String sifre = tusTakimi.veriAlString();
 		try {
 		ResultSet  rs = selectStmt
        .executeQuery("SELECT * FROM kullanici WHERE kullaniciadi = '"+hesap.getKullaniciAdi()+"' AND sifre = '"+sifre+"'");
      
      if(!rs.next()) {
      	 ekran.mesajGoruntule("Sifre hatali !!!"); 	
      	kullaniciDogrulaSifre( selectStmt, hesap);
          }
      
      else {
      	ekran.mesajGoruntule("Kullanici onaylandi"); 
      	hesap.setKullaniciSifre(sifre);
      	ekran.mesajGoruntule("Secim ekraninina yonlendiriliyor..."); 
      	Araclar.bekle(1000);
      	return hesap;

      }
		}
		
		catch(Exception e) {
	ekran.mesajGoruntule("Veri tabaninda bir hata olustu  !!!!");
			
		}
	return null;
	}



	@Override
	public void veriTabaniBagla() {
		 ekran.mesajGoruntule("Veritabanýna baðlanýlýyor...");
	        Araclar.bekle(2000); 
	         conn=this.baglan();		
	}

}

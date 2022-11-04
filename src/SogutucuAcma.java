
public class SogutucuAcma implements ISistemISlem{

	@Override
	public void islemYap() {
		 PostgreSQLSurucu postgreSQLSurucu= new PostgreSQLSurucu();
		if(!AkilliCihaz.klimaDurum) {
			
			 System.out.println("Sogutucu aciliyor...");
			 Araclar.bekle(1000);
					 System.out.println("Sogutucu acildi...");	
					 AkilliCihaz.klimaDurum=true;
					 postgreSQLSurucu.hesap.update( AkilliCihaz.klimaDurum);
		}
		else{ 
			System.out.println("Sogutucu acik !!!");	
		}  
		
	}

}

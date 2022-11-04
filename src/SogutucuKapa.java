
public class SogutucuKapa implements ISistemISlem {

	@Override
	public void islemYap() {
				 PostgreSQLSurucu postgreSQLSurucu= new PostgreSQLSurucu();
		if(AkilliCihaz.klimaDurum) {
			 System.out.println("Sogutucu kapatiliyor...");
			
			 Araclar.bekle(1000);
					 System.out.println("Sogutucu kapandi...");	
					 AkilliCihaz.klimaDurum=false;
					 postgreSQLSurucu.hesap.update( AkilliCihaz.klimaDurum);
		}
		else{ 
			System.out.println("Sogutucu kapali !!!");	
		}  
				
			}
		
	}

	
	


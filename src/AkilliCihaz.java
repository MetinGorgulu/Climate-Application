public class AkilliCihaz {

	private final AgArayuz agArayuz;
	
	public static boolean klimaDurum=false ;
	AkilliCihaz(){
		
		agArayuz =new AgArayuz();
	};
	
	Ekran ekran = new Ekran();
	PostgreSQLSurucu postgreSQLSurucu =new PostgreSQLSurucu();
	
	public void basla() {
		
		postgreSQLSurucu.veriTabaniBagla();
		kullaniciDogrula();
      	agArayuz.secimEkraniGetir();
		
	}
	
	private void kullaniciDogrula(){
		
		postgreSQLSurucu.kullaniciDogrulaIsim();
	}
	

}
import include.ISicaklikAlgilayici;
import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {

	@Override
	public Integer sicaklikOku() {
	
		  Random random = new Random();
		  int sicaklik = random.nextInt(45)-15;
		return sicaklik;
	}

}

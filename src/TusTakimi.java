import java.util.Scanner;

public class TusTakimi implements ITusTakimi {

	@Override
	public int veriAlInt() {
		 Scanner input=new Scanner(System.in);
	        return input.nextInt(); 
	}

	@Override
	public String veriAlString() {
		 Scanner input=new Scanner(System.in);
	        return input.next(); 
	}

	
	}



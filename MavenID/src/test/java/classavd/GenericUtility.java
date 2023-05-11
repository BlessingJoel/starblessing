package classavd;

import java.util.Random;

public class GenericUtility {
	
	public int getran() {
		Random run = new Random();
		int ranner = run.nextInt(1000);
		return ranner;
	}

}

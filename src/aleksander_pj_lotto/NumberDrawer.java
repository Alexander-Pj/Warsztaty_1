package aleksander_pj_lotto;

import java.util.Random;

public class NumberDrawer {

	public static int numberDraw() {
		Random generator = new Random();
		int number = generator.nextInt(49 - 1) + 1;
		return number;
	}

}

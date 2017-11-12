package aleksander_pj_lotto;

import java.util.Arrays;

public class LottoNumbers {

	public static int[] numbersLotto(int numbers) {
		int[] numbersTab = new int[numbers];
		int x;

		for (int i = 0; i < numbersTab.length; i++) {
			x = NumberDrawer.numberDraw();
			numbersTab[i] = x;
			for (int j = 0; j < i; j++) {
				while (numbersTab[i] == numbersTab[j]) {
					x = NumberDrawer.numberDraw();
				}

			}

		}
		Arrays.sort(numbersTab);
		return numbersTab;
	}

}

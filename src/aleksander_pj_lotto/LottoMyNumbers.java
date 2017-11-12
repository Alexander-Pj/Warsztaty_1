package aleksander_pj_lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoMyNumbers {

	public static int[] myNumbers(int numbers) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Podaj " + numbers + " liczb w zakresie 1-49, po każdej naciśnij klawisz ENTER");

		int[] numbersTab = new int[numbers];
		int x;

		for (int i = 0; i < numbersTab.length; i++) {

			boolean num = false;

			while (num == false) {

				while (!scan.hasNextInt()) {
					scan.next();
					System.out.println("Podana wartość nie jest liczbą");
				}

				x = scan.nextInt();
				num = NumberCheck.numbersCheck(x);

				if (num == false) {
					System.out.println("Podana liczba nie mieści się w zakresie 1-49");
				} else {
					numbersTab[i] = x;
				}

			}

		}
		Arrays.sort(numbersTab);
		return numbersTab;
	}
}

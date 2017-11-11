package Alexander_Pj;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoSim {

	public static void main(String[] args) {

		lottoSim();

	}

	static void lottoSim() {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		int[] lottoNumbers = new int[6];

		for (int i = 0; i < lottoNumbers.length; i++) {

			int x = generator.nextInt(49 - 1) + 1;
			lottoNumbers[i] = x;
			for (int j = 0; j < i; j++) {
				while (x == lottoNumbers[j]) {
					x = generator.nextInt(49 - 1) + 1;
				}
			}
		}

		System.out.println("Podaj 6 liczb z zakresu 1-49, po każdej wciskaj klawisz ENTER");

		int[] yourNumbers = new int[6];

		for (int i = 0; i < yourNumbers.length; i++) {
			int x = scan.nextInt();
			while(x<1 || x>49) {				
				 scan.next();
				System.out.println("Podana liczba nie mieści się w zakresie 1-49");
			} 
			 yourNumbers[i] = x;
		}
		Arrays.sort(yourNumbers);
		Arrays.sort(lottoNumbers);
		
		System.out.println();
		System.out.print("Twoje liczby to: ");
		System.out.println(Arrays.toString(yourNumbers));
		System.out.print("Wylosowane liczby to: ");
		System.out.println(Arrays.toString(lottoNumbers));
	}

}

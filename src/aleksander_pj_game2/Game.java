package aleksander_pj_game2;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Pomyśl liczbę od 0 do 1000 a ja ją zgadnę w 10 próbach");
		System.out.println();
		System.out.println("Gotowy? (TAK LUB NIE)");
		scan.nextLine();

		int min = 0;
		int max = 1000;

		boolean answer = false;
		String input = "";

		while (answer != true) {

			int guess = ((max - min) / 2) + min;
			System.out.println("Zgaduję: " + guess);
			System.out.println();
			System.out.print("Odpowiedz: \"za dużo\", \"za mało\" lub \"zgadłeś\": ");
			;

			input = scan.nextLine();
			if (input.equalsIgnoreCase("zgadłeś")) {
				System.out.println("Wygrałem!!!");
				answer = true;
				break;
			} else if (input.equalsIgnoreCase("za dużo")) {
				max = guess;
			} else if (input.equalsIgnoreCase("za mało")) {
				min = guess;
			} else {
				System.out.println("nie oszukuj");
			}

		}

	}

}
